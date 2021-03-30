package academy.codechosun.engine;

import academy.codechosun.server.Receiver;
import academy.codechosun.logger.ILoggable;

public class Program {
    public static void main(String[] args) {
        byte[] data = new byte[100];
        Receiver receiver = new Receiver();
        ConsoleLogger logger = new ConsoleLogger();
        logger.log("Direct method access");
        receiver.processData(data, logger);

    }

}


