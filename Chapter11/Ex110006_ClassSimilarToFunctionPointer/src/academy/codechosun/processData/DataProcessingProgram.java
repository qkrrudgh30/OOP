package academy.codechosun.processData;

import academy.codechosun.logger.LoggerBase;

public class DataProcessingProgram {
    public void processData(byte[] data, LoggerBase logger) {
        if (data[0] != 'P' || data[1] != 'A') {
            logger.log("Wrong file signature.");
            return;
        }
    }

}



