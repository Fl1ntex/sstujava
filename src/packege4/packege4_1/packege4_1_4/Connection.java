package packege4.packege4_1.packege4_1_4;

import packege4.packege4_1.packege4_1_2.LossOfNetworkConnection;
import packege4.packege4_1.packege4_1_3.UseOfClosedResource;

import java.util.Random;

public class Connection {
    private String ip;
    private boolean isConnect;

    public Connection(String ip){
        this.ip = ip;
        isConnect = true;
    }

    public void closeConnection(){
        if (!isConnect){
            throw new UseOfClosedResource();
        }
        isConnect = false;
    }

    public String getIp() throws LossOfNetworkConnection {
        if (!isConnect){
            throw new UseOfClosedResource();
        }

        Random r = new Random();
        if (r.nextInt() % 2 == 0){
            throw new LossOfNetworkConnection();
        }

        System.out.println("test connection");
        return this.ip;
    }

}
