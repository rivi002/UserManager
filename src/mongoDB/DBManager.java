/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mongoDB;

/**
 *
 * @author Rivi Rajapakse
 */

import com.mongodb.DB;
import com.mongodb.MongoClient;
import java.net.UnknownHostException;

public class DBManager {
    
    private static DB database;
    
    public static DB getDatabase(){
        if(database == null){
            MongoClient mongo;
            try {
                mongo = new MongoClient("RiviConn", 27017);
                mongo.getDB("usermanager");
            } catch (UnknownHostException e) {
                e.printStackTrace();
            }
            
            
        }
        return database;
    }
}
