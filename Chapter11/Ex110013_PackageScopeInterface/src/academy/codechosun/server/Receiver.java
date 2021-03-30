package academy.codechosun.server;

import academy.codechosun.logger.ILoggable;

public class Receiver {
    public void processData(byte[] data, ILoggable logger) {
        if (data[0] != 'P' || data[1] != 'A') {
            logger.log("Wrong file signature.");
            return;
        }

    }

} 



