package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

final class FileReader implements DataReader {
    @Override
    public Data readData(final String[] args) {
        String message = "";
        int key;

        final int inputFilePosition = Main.parsedArguments.getArgumentPosition("-in");
        final String filePath = args[inputFilePosition + 1];
        final File inputFile = new File(filePath);

        try (Scanner scanner = new Scanner(inputFile)) {
            message = scanner.nextLine();
        } catch (IOException e) {
            System.out.println("File not found");
        }

        final int keyPosition = Main.parsedArguments.getArgumentPosition("-key");
        key = Integer.parseInt(args[keyPosition + 1]);

        return new Data(message, key);
    }
}
