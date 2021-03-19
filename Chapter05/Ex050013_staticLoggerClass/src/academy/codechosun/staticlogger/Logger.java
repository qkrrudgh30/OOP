package academy.codechosun.staticlogger;

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

    private static LogLevel logLevel = LogLevel.WARNING;
    private static boolean isConfigLoaded = false;
    private static BufferedWriter bufferOut;

    private Logger() {}

    public static void loadConfig() {
        try {
            String classPath = getClassPath();
            Path loggerConfigPath = Paths.get(classPath, CONFIG_FILENAME);

            File configFile = new File(loggerCongfigPath.toString());
            String outputFilename = "log.txt";

            if (configFile.isFile()) {
                List<String> lines = Files.readAllLines(loggerCongfigPath, StandardCharsets.UTF_8);

                for (String line : lines) {
                    String[] splits = line.splits("=");

                    switch (splits[0]) {
                        case "loglevel":
                            logLevel = LogLevel.valueof(Splits[1]);
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
            bufferOut = new BufferedWriter(new FileWriter(outputPath));
            isConfigLoaded = true;

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void close() {
        if (bufferOut != null) {
            try {
                bufferOut.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void logDebug(String message, Object... args) {
        assert (isConfigLoaded) : "Configuration not loaded";
        writeToFile(LogLevel.DEBUG, message, args);
    }

    public static void logInformation(String message, Object... args) {
        assert (isConfigLoaded) : "Configuration not loaded";
        writeToFile(LogLevel.INFORMATION, message, args);
    }

    public static void logWarning(String message, Object... args) {
        assert (isConfigLoaded) : "Configuration not loaded";
        writeToFile(LogLevel.WARNING, message, args);
    }

    public static void logError(String message, Object... args) {
        assert (isConfigLoaded) : "Configuration not loaded";
        writeToFile(LogLevel.ERROR, message, args);
    }

    public static void logCritical(String message, Object... args) {
        assert (isConfigLoaded) : "Configuration not loaded";
        writeToFile(LogLevel.CRITICAL, message, args);
    }

    private static void writeToFile(LogLevel logLevel, String message, Object... args) {
        if (!isConfigLoaded || Logger.logLevel.getLogLevel() > logLevel.getLogLevel()) {
            return;
        }

        try {
            String log = String.format("[%s] %s: %s", Instant.now().toString(),
                                                      logLevel.toString(),
                                                      String.format(message, args));
            bufferedOut.write(log);
            bufferedOut.newLing();
            bufferedOut.flush();
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





