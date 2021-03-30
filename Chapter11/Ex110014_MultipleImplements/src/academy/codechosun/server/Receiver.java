package academy.codechosun.server;

import academy.codechosun.logger.*;

public class Receiver {
    public void processData(byte[] data, ConsoleLogger logger) {
        if (data[0] != 'P' || data[1] != 'A') {
            logger.log("Wrong file signature.");
            logger.save("logFile.txt");
            return;
        }
    }

}



