package org.project.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SearchQuery extends UnicastRemoteObject implements Search {
    protected SearchQuery() throws RemoteException {
        super();
    }

    public String searchQuery(String search) throws RemoteException {
        if(search.equalsIgnoreCase("RMI")){
            return "Found";
        }
        return "Not Found";
    }
}
