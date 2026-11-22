package packege4.packege4_1.packege4_1_2;

public class LossOfNetworkConnection extends Exception {
    public LossOfNetworkConnection(){}

    public LossOfNetworkConnection(String message) {
        super(message);
    }

    public LossOfNetworkConnection(Exception e){
        super(e);
    }

    public LossOfNetworkConnection(String message, Exception e){
        super(message,e);
    }
}
