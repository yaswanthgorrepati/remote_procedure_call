package org.project.client;

import org.project.server.Search;

import javax.naming.Name;
import java.rmi.Naming;

public class ClientRequest {
    public static void main(String[] args) {
        try{
            Search req = (Search)Naming.lookup("rmi://localhost:1900/test");
            System.out.println(req.searchQuery("rmi"));
        }catch (Exception e){
            System.out.println("Exception in client " + e.getStackTrace());
        }
    }
}
