package academy.codechosun.logger;

import java.util.ArrayList;

public final class ConsoleLogger implements ILoggable, ISavable, IFileStorage {
    private ArrayList<String> logs = new ArrayList<String>();

    public void log(String message) {
        logs.add(message);
        System.out.println(message);
    }

    public void save(String fileName) {
        System.out.printf("%s is saved.%s", fileName, System.lineSeparator());
    }

    public void load(String fileName) {
        System.out.printf("%s is loaded.%s", fileName, System.lineSeparator());
    }

}



