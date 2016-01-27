/**
 * Created by simonhamermesh on 1/25/16.
 */
public class Connection {
    private  int portNumber;
    private  String IPAddress;

    private Connection(int x, String y){
        this.portNumber = x;
        this.IPAddress = y;
    }

    public static Connection makeConnection(int x, String y){
       return new Connection(x,y);
    }

    int getPortNumber (){
        return portNumber;
    }
    String getIPAddress (){
        return IPAddress;
    }
}
