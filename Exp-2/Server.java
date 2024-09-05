import java.rmi.Naming;
import java.rmi.RemoteException;

public class Server {
    public static void main(String[] args) {
        try {
            Rmiimple obj = new Rmiimple();
            Naming.rebind("RmiInterface", obj);
            System.out.println("Server is ready");
        } catch (Exception e) {
            System.out.println("Server exception: " + e);
        }
    }
}
