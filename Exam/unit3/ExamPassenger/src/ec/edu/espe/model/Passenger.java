/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

/**
 *
 * @author Yessi
 */
public class Passenger {
        public Passenger(String name, String ID, String passpot, int suitcases, String departure, String arrival, int weeks) {
        this.name = name;
        this.ID = ID;
        this.passpot = passpot;
        this.suitcases = suitcases;
        this.departure = departure;
        this.arrival = arrival;
        this.weeks = weeks;
    }
    private String name;
    private String ID;
    private String passpot;
    private int suitcases;
    private String departure;
    private String arrival;
    private int weeks;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the ID
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return the passpot
     */
    public String getPasspot() {
        return passpot;
    }

    /**
     * @param passpot the passpot to set
     */
    public void setPasspot(String passpot) {
        this.passpot = passpot;
    }

    /**
     * @return the suitcases
     */
    public int getSuitcases() {
        return suitcases;
    }

    /**
     * @param suitcases the suitcases to set
     */
    public void setSuitcases(int suitcases) {
        this.suitcases = suitcases;
    }

    /**
     * @return the departure
     */
    public String getDeparture() {
        return departure;
    }

    /**
     * @param departure the departure to set
     */
    public void setDeparture(String departure) {
        this.departure = departure;
    }

    /**
     * @return the arrival
     */
    public String getArrival() {
        return arrival;
    }

    /**
     * @param arrival the arrival to set
     */
    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    /**
     * @return the weeks
     */
    public int getWeeks() {
        return weeks;
    }

    /**
     * @param weeks the weeks to set
     */
    public void setWeeks(int weeks) {
        this.weeks = weeks;
    }

    
}
