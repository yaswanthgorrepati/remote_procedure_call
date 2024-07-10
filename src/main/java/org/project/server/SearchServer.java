package org.project.server;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.security.SecureRandom;

public class SearchServer {
    public static void main(String[] args) {
        try{
            Search search = new SearchQuery();
            LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900/test", search);
        } catch (Exception e){
            System.out.println("Exception" + e.getStackTrace());
        }
    }
}
