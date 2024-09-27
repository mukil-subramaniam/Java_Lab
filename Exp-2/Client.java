import java.rmi.Naming;

public class Client {
    public static void main(String[] args) {
        try {
            String host = "localhost";
            
            
            RmiInterface obj = (RmiInterface) Naming.lookup("rmi://" + host + "/RmiInterface");
            
            System.out.println("Result: " + obj.add(8,990));
        } catch (Exception e) {
            System.out.println("Client exception: " + e.toString());
        }
    }
}