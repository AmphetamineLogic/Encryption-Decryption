package encryptdecrypt;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter implements DataWriter {
    @Override
    public void writeData(String[] args, String processedMessage) {
        String filePath = "";
        int filePathPosition = Main.arraySearch(args, "-out");

        filePath = args[filePathPosition + 1];
        try (PrintWriter pw = new PrintWriter(filePath)){
            pw.println(processedMessage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
