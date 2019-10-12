package encryptdecrypt;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

class FileWriter implements DataWriter {
    @Override
    public void writeData(final String[] args, final String processedMessage) {
        final int filePathPosition = Main.parsedArguments.getArgumentPosition("-out");
        try (PrintWriter pw = new PrintWriter(args[filePathPosition + 1])) {
            pw.println(processedMessage);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
