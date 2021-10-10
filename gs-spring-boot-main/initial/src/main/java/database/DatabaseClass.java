package database;

import java.util.HashMap;
import java.util.Map;
import model.Things;

public class DatabaseClass {
    private static Map<Long, Things> thing = new HashMap();

    public DatabaseClass() {
    }

    public static Map<Long, Things> getThing() {
        return thing;
    }
}
