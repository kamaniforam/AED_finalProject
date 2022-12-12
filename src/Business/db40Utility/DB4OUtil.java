package Business.db40Utility;

import Business.ConfigureASystem;
import Business.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 *
 * @author foram
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank-test.db4o").toAbsolutePath().toString();// path to the data store
    private static ObjectContainer db = createConnection();
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }
    
    public synchronized static ObjectContainer getDBInstance(){
        if (db == null){
            db = createConnection();
        }
        return db;
    }

    public synchronized static void shutdown() {
        if (db != null) {
            db.close();
            db = null;
        }
    }

    private static ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config,FILENAME);
            return db;
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        if(db == null) {
            getDBInstance();
        }
        db.store(system);
        db.commit();
    }
    
    public EcoSystem retrieveSystem(){
        if(db == null) {
            getDBInstance();
        }
        ObjectSet<EcoSystem> systems = db.query(EcoSystem.class); // Change to the object you want to save
        EcoSystem system;
        if (systems.isEmpty()){
            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
        }
        else{
            system = systems.get(systems.size() - 1);
        }

        return system;
    }
//    
//    
//    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString();// path to the data store
//    private static DB4OUtil dB4OUtil;
//    
//    public synchronized static DB4OUtil getInstance(){
//        if (dB4OUtil == null){
//            dB4OUtil = new DB4OUtil();
//        }
//        return dB4OUtil;
//    }
//
//    protected synchronized static void shutdown(ObjectContainer conn) {
//        if (conn != null) {
//            conn.close();
//        }
//    }
//
//    private ObjectContainer createConnection() {
//        try {
//
////            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
////            config.common().add(new TransparentPersistenceSupport());
////            //Controls the number of objects in memory
////            config.common().activationDepth(Integer.MAX_VALUE);
////            //Controls the depth/level of updation of Object
////            config.common().updateDepth(Integer.MAX_VALUE);
////
////            //Register your top most Class here
////            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true); // Change to the object you want to save
//
//            ObjectContainer db = Db4oEmbedded.openFile(FILENAME);
//            return db;
//        } catch (Exception ex) {
//            System.out.print(ex.getMessage());
//        }
//        return null;
//    }
//
//    public synchronized void storeSystem(EcoSystem system) {
//        ObjectContainer conn = createConnection();
//        conn.store(system);
//        conn.commit();
//        conn.close();
//    }
//    
//    public EcoSystem retrieveSystem(){
//        ObjectContainer conn = createConnection();
//        ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class); // Change to the object you want to save
//        EcoSystem system;
//        if (systems.size() == 0){
//            system = ConfigureASystem.configure();  // If there's no System in the record, create a new one
//        }
//        else{
//            system = systems.get(systems.size() - 1);
//        }
//        conn.close();
//        return system;
//    }
}
