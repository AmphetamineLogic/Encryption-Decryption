package encryptdecrypt;

import java.util.Scanner;

class ConsoleReader implements DataReader {
    @Override
    public final Data readData(final String args[]) {
        final String message;
        final int key;

        int messagePosition = Main.parsedArguments.getArgumentPosition("-data");
        int keyPosition = Main.parsedArguments.getArgumentPosition("-key");

        if (messagePosition > -1) {
            message = args[messagePosition + 1];
            key = Integer.parseInt(args[keyPosition + 1]);
        } else {
            final Scanner scanner = new Scanner(System.in);
            message = scanner.nextLine();
            key = scanner.nextInt();
        }

        return new Data(message, key);
    }
}
