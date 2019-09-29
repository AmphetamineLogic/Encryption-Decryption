package encryptdecrypt;

import java.util.Scanner;

public class ConsoleReader implements DataReader {
    @Override
    public Data readData(String args[]) {
        String message = "";
        int key = 0;

        int messagePosition = Main.arraySearch(args, "-data");
        int keyPosition = Main.arraySearch(args, "-key");

        if (messagePosition > -1) {
            message = args[messagePosition+1];
            key = Integer.parseInt(args[keyPosition+1]);
        }
        else {
            Scanner scanner = new Scanner(System.in);
            message = scanner.nextLine();
            key = scanner.nextInt();
        }

        return new Data(message, key);
    }
}
