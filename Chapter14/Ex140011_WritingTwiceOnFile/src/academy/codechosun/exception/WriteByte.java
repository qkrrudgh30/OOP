package academy.codechosun.exception;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;

public class WriteByte {
    public void writeByte(String relativePath, byte b) {
        Path path = Paths.get(getClassPath(), relativePath);

        FileOutputStream out = null;
        try {
            out = new FileOutputStream(new File(path.toString()), true);
            out.write(b);
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




