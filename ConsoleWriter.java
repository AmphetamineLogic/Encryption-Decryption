package encryptdecrypt;

public class ConsoleWriter implements DataWriter {
    @Override
    public void writeData(String[] args, String processedMessage) {
        System.out.println(processedMessage);
    }
}
