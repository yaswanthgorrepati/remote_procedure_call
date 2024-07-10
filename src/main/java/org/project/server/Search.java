package org.project.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Search extends Remote {

    public String searchQuery(String search) throws RemoteException;
}
