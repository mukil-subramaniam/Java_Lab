import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Rmiimple extends UnicastRemoteObject implements RmiInterface {

    
    protected Rmiimple() throws RemoteException {
        super();  
    }

    
    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }
}
