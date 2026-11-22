package packege4.packege4_2.packege4_2_4;

import packege4.packege4_1.packege4_1_2.LossOfNetworkConnection;
import packege4.packege4_1.packege4_1_4.Connection;

import java.util.Random;

public class ExampleConnector{

    public void register(){
        if(new Random().nextBoolean()) {
            throw new RuntimeException();
        }
        System.out.println("register connection");
    }

    public void unregister(){
        System.out.println("unregister connection");
    }

    public void makeConnect(Connection conn) throws LossOfNetworkConnection {
        register();
        conn.getIp(); //nextString
        unregister();
    }
}


//ExampleConnector exampleConnector = new ExampleConnector();
//Connection c = new Connection("ermakov.edu");
//
//        try {
//                exampleConnector.makeConnect(c);
//        } catch (RuntimeException e){
//
//        } catch (LossOfNetworkConnection e){
//        exampleConnector.unregister();
//        }