package service;

import database.DatabaseClass;
import model.Things;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ThingService {

    private Map<Long, Things> things = DatabaseClass.getThing();

    public ThingService() {
    }

    public List<Things> getAllThings(){
        return new ArrayList(this.things.values());
    }

    public Things getThings(String item) {
        Things thing = (Things)this.things.get(item);
        return thing;
    }

    public Things addKinderGarden(Things thing) {
        thing.setId((this.things.size() + 1));
        this.things.put(thing.setId(), thing);
        return thing;
    }
}
