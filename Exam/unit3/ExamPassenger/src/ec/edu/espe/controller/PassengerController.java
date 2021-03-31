/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.controller;

import ec.edu.espe.model.Passenger;
import utils.FileManager;

/**
 *
 * @author Yessi
 */
public class PassengerController {
    public void save(Passenger passenger) {
        String data = passenger.getName() + ", " + passenger.getID() + ", " + passenger.getPasspot()
                + ", " + passenger.getSuitcases() + ", " + passenger.getDeparture()+ ", " + passenger.getArrival()+ ", " + passenger.getWeeks();
        FileManager.save(data, "passenger");
    }
    public static String read(){
        String data;
        data = FileManager.read("passenger.csv");
        return data;
    }
}
