package encryptdecrypt;

class MainContext {

    private String[] args;
    private CryptoMethod cryptoMethod;
    private DataReader dataReader;
    private DataWriter dataWriter;

    MainContext(String[] args, CryptoMethod cryptoMethod, DataReader dataReader, DataWriter dataWriter) {
        this.args = args;
        this.cryptoMethod = cryptoMethod;
        this.dataReader = dataReader;
        this.dataWriter = dataWriter;
    }

    void process() {
        Data data = dataReader.readData(args);
        String processedMessage = cryptoMethod.process(data);
        dataWriter.writeData(args, processedMessage);
    }
}
