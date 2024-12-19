package com.example.project;
import java.util.Random;

public class Day4 {
    
    private static String[] reindeer_names = {"Dasher", "Dancer", "Prancer", "Vixen", "Comet", "Cupid", "Donner", "Blitzen"};
    private static int greatestDistance;

    public static class Reindeer { // you must have at least a name, distance travelled, speed, run duration, and rest duration attribute
        private String name;
        private int speed;
        private int runDuration;
        private int distanceTraveled;
        private int restDuration;

        // Constructor 
        public Reindeer(String name, int speed, int runDuration, int restDuration) {
            this.name = name;
            this.speed = speed; 
            this.runDuration = runDuration; 
            this.restDuration = restDuration;
        }

        public String getName() {
            return name;
        }

        public int getDistanceTraveled(){ // this method is required
           return distanceTraveled;
        }
        

        public void simulateSecond(){ //this method is required but not tested
            distanceTraveled = speed * runDuration;
        }

    }

    public static String simulateRace(int time, Reindeer[] reindeers){ //you will be tested on this method
        String winnerName = null;
        for (int i = 0; i < reindeers.length; i++) {
            reindeers[i].simulateSecond();
            if (reindeers[i].distanceTraveled > greatestDistance) {
                greatestDistance = reindeers[i].distanceTraveled;
                winnerName = reindeers[i].getName();
            }
        }
        return winnerName;
        }
    

    
    public static void main(String[] args) { // for testing purposed

    }
}