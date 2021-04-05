/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.TuristicPlaces.model;

public class TouristicPlaces {

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
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the distance
     */
    public float getDistance() {
        return distance;
    }

    /**
     * @param distance the distance to set
     */
    public void setDistance(float distance) {
        this.distance = distance;
    }

    /**
     * @return the LatitudeStart
     */
    public float getLatitudeStart() {
        return LatitudeStart;
    }

    /**
     * @param LatitudeStart the LatitudeStart to set
     */
    public void setLatitudeStart(float LatitudeStart) {
        this.LatitudeStart = LatitudeStart;
    }

    /**
     * @return the LongitudeStart
     */
    public float getLongitudeStart() {
        return LongitudeStart;
    }

    /**
     * @param LongitudeStart the LongitudeStart to set
     */
    public void setLongitudeStart(float LongitudeStart) {
        this.LongitudeStart = LongitudeStart;
    }

    public TouristicPlaces(String name, String type, float latitude, float longitude, float distance, float LatitudeStart, float LongitudeStart) {
        this.name = name;
        this.type = type;
        this.latitude = latitude;
        this.longitude = longitude;
        this.distance = distance;
        this.LatitudeStart = LatitudeStart;
        this.LongitudeStart = LongitudeStart;
    }
    
    private String name;
    private String type;
    private float latitude;
    private float longitude;
    private float distance;
    private float LatitudeStart;
    private float LongitudeStart;
}

