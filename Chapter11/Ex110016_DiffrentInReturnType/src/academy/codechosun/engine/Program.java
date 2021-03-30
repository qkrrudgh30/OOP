package academy.codechosun.engine;

import academy.codechosun.logger.*;
import academy.codechosun.server.Receiver;

public class Program {
    public static void main(String[] args) {
        byte[] data = new byte[100];
        Receiver receiver = new Receiver();
        ConsoleLogger logger = new ConsoleLogger();
        receiver.processData(data, logger);

    }

}



