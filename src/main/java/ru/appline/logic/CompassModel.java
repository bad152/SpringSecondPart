package ru.appline.logic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class CompassModel implements Serializable{
    private static final CompassModel instance = new CompassModel();

    private final Map<Integer, Compass> model;
    public CompassModel(){
        model = new HashMap<Integer, Compass>();
    }
    public static CompassModel getInstance(){
        return instance;
    }
    public void add(Compass compass, int id){
        model.put(id, compass);
    }

    public Compass getSomeSide(Integer degree) {
        return model.get(Compass.IntegerRange.equals(degree));
    }

}
