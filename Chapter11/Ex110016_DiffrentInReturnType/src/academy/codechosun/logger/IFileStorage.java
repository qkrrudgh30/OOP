package academy.codechosun.logger;

public interface IFileStorage {
    boolean save(String fileName);
    void load(String fileName);
}



