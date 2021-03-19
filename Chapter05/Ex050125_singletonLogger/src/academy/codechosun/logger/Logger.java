package academy.codechosun.logger;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.List;

public class Logger {
    private static final String CONFIG_FILENAME = "logger-config.txt";

    private static Logger instance;

    private LogLevel logLevel;
    private BufferedWriter outBuffer;

    private Logger(LogLevel logLevel, String outputPath) {
        this.logLevel = logLevel;

        try {
            this.outBuffer = new BufferedWriter(new FileWriter(outputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static Logger getInstance() {
        if (instance != null) {
            return instance;
        }

        try {
            String classPath = getClassPath();
            Path loggerConfigPath = Paths.get(classPath, CONFIG_FILENAME);

            File configFile = new File(loggerConfigPath.toString());

            LogLevel logLevel = LogLevel.WARNING;
            String outputFilename = "log.txt";

            if (configFile.isFile()) {
                List<String> lines = Files.readAllLines(loggerConfigPath, StandardCharsets.UTF_8);

                for (String line : lines) {
                    String[] splits = line.split("=");

                    switch (splits[0]) {
                        case "loglevel":
                            logLevel = LogLevel.valueOf(splits[1]);
                            break;

                        case "output":
                            outputFilename = splits[1];
                            break;

                        default:
                            throw new IllegalArgumentException("Unknown configuration setting: " + splits[0]);
                            break;

                    }

                }

            }

            Path path = Paths.get(classPath, outputFilename);
            String outputPath = path.toString();

            instance = new Logger(logLevel, pathString);
            return instance;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void deleteInstance() {
        if (this.outBuffer != null) {
            try {
                this.outBuffer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        if (instance != null) {
            instance = null;
        }

    }

    public static void logDebug(String message, Object... args) {
        writeToFile(LogLevel.DEBUG, message, args);
    }

    public static void logInformation(String message, Object... args) {
        writeToFile(LogLevel.INFORMATION, message, args);
    }

    public static void logWarning(String message, Object... args) {
        writeToFile(LogLevel.WARNING, message, args);
    }

    public static void logError(String message, Object... args) {
        writeToFile(LogLevel.ERROR, message, args);
    }

    public static void logCritical(String message, Object... args) {
        writeToFile(LogLevel.CRITICAL, message, args);
    }

    private static void writeToFile(LogLevel logLevel, String message, Object... args) {
        if (this.logLevel.getLogLevel() > logLevel.getLogLevel()) {
            return;
        }

        try {
            String log = String.format("[%s] %s: %s",
                    Instant.now().toString(),
                    logLevel.toString(),
                    String.format(message, args));
            this.outBuffer.write(log);
            this.outBuffer.newLine();
            this.outBuffer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String getClassPath() {
        File f = new File(Logger.class.getProtectionDomain().getCodeSource().getLocation().getPath());
        String packageName = Logger.class.getPackageName();
        packageName = packageName.replace('.', '/');

        Path p = Paths.get(f.getPath(), packageName);

        return p.toAbsolutePath().normalize().toString();
    }

}



