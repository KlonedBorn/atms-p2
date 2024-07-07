package com.github.klonedev.data;

import com.github.klonedev.model.TrainSystem;
import com.github.klonedev.settings.Constants;

/**
 * AppData singleton
 * 
 * @author Marco Trombino
 */
public class AppData {

    private static AppData instance;
    private TrainSystem currentTrainSystem;

    private AppData() {
        
    }

    public TrainSystem getCurrentTrainSystem() {
        return currentTrainSystem;
    }

    public TrainSystem createTrainSystem() {
        return createTrainSystem(Constants.DEFAULT_MAP_WIDTH, Constants.DEFAULT_MAP_HEIGHT);
    }

    public TrainSystem createTrainSystem(double mapWidth, double mapHeight) {
        if (currentTrainSystem != null) {
            currentTrainSystem.close();
        }
        currentTrainSystem = new TrainSystem(mapWidth, mapHeight);
        return currentTrainSystem;
    }

    public static AppData getInstance() {
        if (instance == null) {
            instance = new AppData();
        }
        return instance;
    }
}