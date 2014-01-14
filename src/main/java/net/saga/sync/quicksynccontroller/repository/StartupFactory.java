/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.saga.sync.quicksynccontroller.repository;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.saga.sync.quicksynccontroller.ui.ChangeListener;
import org.ektorp.changes.ChangesCommand;
import org.ektorp.http.HttpClient;
import org.ektorp.http.StdHttpClient;
import org.ektorp.impl.StdCouchDbConnector;
import org.ektorp.impl.StdCouchDbInstance;
import org.jboss.aerogear.sync.CouchDBSyncManager;
import org.jboss.aerogear.sync.JsonMapper;
import org.jboss.aerogear.sync.SyncManager;

public class StartupFactory {

    private static final SyncManager SYNC_MANAGER;
    private static final String URL = "http://127.0.0.1:5984";
    private static final String DB_NAME = "device-sync";
    private static final StdCouchDbConnector DB;
    
    
    static {
        try {
            HttpClient httpClient = new StdHttpClient.Builder().url(URL).build();
            
            SYNC_MANAGER = new CouchDBSyncManager(URL, DB_NAME);
            StdCouchDbInstance stdCouchDbInstance = new StdCouchDbInstance(httpClient);
            DB = new StdCouchDbConnector(DB_NAME, stdCouchDbInstance);
            
            if (!stdCouchDbInstance.checkIfDbExists(DB_NAME)) {
                DB.createDatabaseIfNotExists();
                
            }
            String changes = JsonMapper.toJson(new ChangesCommand.Builder().continuous(true).build());
            ObjectMapper mapper = new ObjectMapper();
            JsonNode changesCommandJson = mapper.readTree(changes);            
            SYNC_MANAGER.subscribe(new ChangeListener(), changesCommandJson);
            
        } catch (IOException ex) {
            Logger.getLogger(StartupFactory.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
    }
    
    public static SyncManager getSyncManager() {
        return SYNC_MANAGER;
    }

    public static StdCouchDbConnector getDb() {
        return DB;
    }
    
}
