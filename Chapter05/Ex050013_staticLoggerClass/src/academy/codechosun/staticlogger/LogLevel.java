package academy.codechosun.staticlogger;

public enum LogLevel {
    DEBUG(0),
    INFORMATTION(1),
    WARNING(2),
    ERROR(3),
    CRITIVAL(4);

    private int level;

    public int getLogLevel() {
        return this.level;
    }

    private LogLevel(int level) {
        this.level = level;
    }

}



