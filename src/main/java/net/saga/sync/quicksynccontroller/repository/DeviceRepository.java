/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.saga.sync.quicksynccontroller.repository;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.saga.sync.quicksynccontroller.vo.Device;
import org.ektorp.CouchDbConnector;
import org.ektorp.ViewResult;
import org.ektorp.support.CouchDbRepositorySupport;
import org.ektorp.support.View;
import org.jboss.aerogear.sync.Document;
import org.jboss.aerogear.sync.JsonMapper;
import static net.saga.sync.quicksynccontroller.repository.StartupFactory.*;
import org.jboss.aerogear.sync.ConflictException;
import org.jboss.aerogear.sync.DefaultDocument;
import org.jboss.aerogear.sync.DocumentNotFoundException;
import org.jboss.aerogear.sync.SyncManager;
/**
 *
 * @author summers
 */
@View( name = "all", map = "function(doc) { if (doc.type == 'DEVICE' ) emit( doc)}")
public class DeviceRepository extends CouchDbRepositorySupport<Device> {

    public DeviceRepository(CouchDbConnector db) {
        super(Device.class, getDb(), true);
        initStandardDesignDocument();
    }
    
    public List<Device> getDevices() {
        ViewResult r = db.queryView(createQuery("all"));
        List<Device> result = new ArrayList<>(r.getSize());
        for (ViewResult.Row row : r.getRows()) {
            JsonFactory factory = new JsonFactory();
            JsonNode keyNode = row.getKeyAsNode();
            Device device = JsonMapper.fromJson(keyNode.get("content").asText(), Device.class);
            device._id = keyNode.get("_id").asText();
            result.add(device);
        }
        
        return result;
        
    }
    
    public Device save(Device newDevice) {
        Document newDocument = new DefaultDocument(UUID.randomUUID().toString(), null, JsonMapper.toJson(newDevice), Device.TYPE);
        Document doc = getSyncManager().create(newDocument);
        return JsonMapper.fromJson(doc.content(), Device.class);
    }

    public Device update(Device currentDevice, String id) {
        SyncManager manager = getSyncManager();
        try {
            Document doc = manager.read(id);
            doc = new DefaultDocument(doc.id(), doc.revision(), JsonMapper.toJson(currentDevice), Device.TYPE);
            doc = manager.update(doc);
            return JsonMapper.fromJson(doc.content(), Device.class);
        } catch (DocumentNotFoundException ex) {
            return save(currentDevice);
        } catch (ConflictException ex) {
            Logger.getLogger(DeviceRepository.class.getName()).log(Level.SEVERE, null, ex);
            throw new RuntimeException(ex);
        }
        
    }
    
    
}
