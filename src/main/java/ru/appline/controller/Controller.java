package ru.appline.controller;

import org.springframework.web.bind.annotation.*;
import ru.appline.logic.Compass;
import ru.appline.logic.CompassModel;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class Controller {
    private static final CompassModel comModel = CompassModel.getInstance();
    private static final AtomicInteger newId = new AtomicInteger(1);

    @PostMapping(value = "/createCompass", consumes = "application/json", produces = "application/json")
    public void createCom(@RequestBody Compass compass){
        comModel.add(compass, newId.getAndIncrement());
    }
//    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
//    public Compass getSide(@RequestBody Map<String, Integer> degree){
//        return comModel.getSomeSide(degree.get("degree"));
//    }
    @GetMapping(value = "/getSide", consumes = "application/json", produces = "application/json")
    public Compass getSide(@RequestParam("degree") Integer degree){
        Compass compass = comModel.getSomeSide(degree);
        return compass;
    }


}
