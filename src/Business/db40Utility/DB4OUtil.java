package Business.db40Utility;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.nio.file.Paths;

/**
 *
 * @author foram
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
    private static ObjectContainer db = null;

    
    public synchronized static ObjectContainer getInstance(){
        if (db == null){
            db = createConnection();
        }
        return db;
    }

    public synchronized static void shutdown(ObjectContainer conn) {
        if (db != null) {
            db.close();
        }
    }

    private static ObjectContainer createConnection() {
        try {
            return Db4oEmbedded.openFile(FILENAME);
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        if(db == null) {
            return;
        }
        db.store(system);
        db.commit();
    }
    
    public EcoSystem retrieveSystem(){
        if(db == null) {
            return null;
        }
        ObjectContainer conn = createConnection();
        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.isEmpty()){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }
        conn.close();
        return system;
    }
}
