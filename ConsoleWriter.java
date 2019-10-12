package encryptdecrypt;

final class ConsoleWriter implements DataWriter {
    @Override
    public void writeData(final String[] args, final String processedMessage) {
        System.out.println(processedMessage);
    }
}
