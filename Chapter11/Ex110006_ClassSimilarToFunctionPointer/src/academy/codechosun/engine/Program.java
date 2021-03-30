package academy.codechosun.engine;

import academy.codechosun.logger.*;
import academy.codechosun.processData.DataProcessingProgram;

public class Program {
    public static void main(String[] args) {
        DataProcessingProgram program = new DataProcessingProgram();
        ConsoleLogger logger = new ConsoleLogger();

        byte[] data = new byte[100];

        program.processData(data, logger);

    }

}



