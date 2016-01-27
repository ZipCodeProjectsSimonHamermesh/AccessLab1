import java.util.ArrayList;

/**
 * Created by simonhamermesh on 1/25/16.
 */

public class ConnectionManager {


    private static Connection [] connectionArray = new Connection[3];
    private static Boolean full = false;
    public static int connectionIndex;

    ConnectionManager(){}

    public static Connection addConnection(int port, String ipAddress){

        for (int i = 0; i<connectionArray.length; i++) {

            if (connectionArray[i]  == null) {

                connectionArray[i] = Connection.makeConnection(port, ipAddress);
                connectionIndex = i;
                break;

            }

            if(i == connectionArray.length-1 ){
              full = true;
            }


        }


        if(!full){return connectionArray[connectionIndex];
            }else{return null;}
    }

    public static void removeConnection(Connection connection){

        for(int i = 0; i<connectionArray.length; i++){
           if(connectionArray[i]!=null) {
                if (connectionArray[i].equals(connection)) {
                    connectionArray[i] = null;
                }
           }

        }
    }

    public static void printConnections(Connection [] y){
        System.out.println("Printing Connections:");
        for(int i = 0; i<connectionArray.length; i++){

            if(connectionArray[i]!=null){

                System.out.println("Array Index: " + i +" Port Number: " + connectionArray[i].getPortNumber()+" "+" IP Address: " + connectionArray[i].getIPAddress());

            }
        }

    }

    public static void main (String[] args) {


        Connection c1 =  ConnectionManager.addConnection(1,"1.2.1");
        ConnectionManager.printConnections(connectionArray);
        System.out.println();

        Connection c2 =  ConnectionManager.addConnection(2,"1.2.2");
        ConnectionManager.printConnections(connectionArray);
        System.out.println();

        Connection c3 =  ConnectionManager.addConnection(3,"1.2.3");
        ConnectionManager.printConnections(connectionArray);
        System.out.println();


        Connection c4 =  ConnectionManager.addConnection(4,"1.2.4");
        if(c4==null){System.out.println("Connection Manager is full");System.out.println("");}

        ConnectionManager.removeConnection(c1);
        ConnectionManager.printConnections(connectionArray);
        System.out.println();

        ConnectionManager.removeConnection(c2);
        ConnectionManager.printConnections(connectionArray);
        System.out.println();

        ConnectionManager.removeConnection(c3);
        ConnectionManager.printConnections(connectionArray);
        System.out.println();
    }
}
