package encryptdecrypt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader implements DataReader {
    @Override
    public Data readData(String[] args) {
        String message = "";
        int key = 0;

        int inputFilePosition = Main.arraySearch(args, "-in");
        String filePath = args[inputFilePosition+1];
        File inputFile = new File(filePath);

        try (Scanner sc = new Scanner(inputFile)) {
            message = sc.nextLine();
        }
        catch (IOException e) {
            System.out.println("File not found");
        }

        int keyPosition = Main.arraySearch(args, "-key");
        key = Integer.parseInt(args[keyPosition + 1]);

        return new Data(message, key);
    }
}
