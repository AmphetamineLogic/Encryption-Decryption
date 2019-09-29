package encryptdecrypt;

public class MainContext {

    String[] args;
    CryptoMethod cryptoMethod;
    DataReader dataReader;
    DataWriter dataWriter;
    Data data;
    String processedMessage;

    public void setArgs(String args[]) {
        this.args = args;
    }

    public void setCryptoMethod(CryptoMethod cryptoMethod) {
        this.cryptoMethod = cryptoMethod;
    }

    public void setDataReader(DataReader dataReader) {
        this.dataReader = dataReader;
    }

    public void setDataWriter(DataWriter dataWriter) {
        this.dataWriter = dataWriter;
    }

    public void process () {
        data = dataReader.readData(args);
        processedMessage = cryptoMethod.process(data);
        dataWriter.writeData(args, processedMessage);
    }
}
