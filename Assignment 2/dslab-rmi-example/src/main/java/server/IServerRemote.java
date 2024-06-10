package server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Declare a common interface which is understood by both the client and the
 * server, for accessing the remote object in an uniform manner.
 */
public interface IServerRemote extends Remote {

	String ping(String clientName) throws RemoteException;

}
