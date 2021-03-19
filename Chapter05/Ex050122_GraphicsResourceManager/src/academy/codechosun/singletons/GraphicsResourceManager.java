package academy.codechosun.singletons;

public class GraphicsResourceManager {
    private static GraphicsResourceManager instance;

    private GraphicsResourceManager(FileLoader loader, GraphicsDevice gfxDevice) {}

    public static void createInstance(FileLoader loader, GraphicsDevice gfxDevice) {
        assert (instance == null) : "Do not create instance twice";

        instance = new GraphicsResourceManager(loader, gfxDevice);
    }

    public static void deleteInstance() {
        assert (instance != null) : "No instance to delete";

        instance = null;
    }

    public static GraphicsResourceManager getInstance() {
        assert (instance != null) : "No instance was created before get()";

        return instance;
    }

}



