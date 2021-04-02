package academy.codechosun.exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class WriteFile {
    public void writeFile(String relativePath) {
        FileOutputStream out = null;
        try {
            Path path = Paths.get(getClassPath(), relativePath);

            out = new FileOutputStream(new File(path.toString()) , true);
            out.write(0xF);
        } catch (NullPointerException e) {
            System.err.println("Found null pointer!");
            throw e;
        } catch (IOException e) {
            e.printStackTrace();
            return;
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (Exception e) {
                    
                }
            }
        }

    }

}




