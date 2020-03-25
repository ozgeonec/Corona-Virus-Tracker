package com.coronatracker.coronavirustracker.model;

public class LocationStats {
    private String state;
    private String country;
    private int latestTotal;
    private int diffFromPrevDay;


    public int getLatestTotal() {
        return latestTotal;
    }

    public String getCountry() {
        return country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLatestTotal(int latestTotal) {
        this.latestTotal = latestTotal;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "stats='" + state + '\'' +
                ", country='" + country + '\'' +
                ", latestTotalCases=" + latestTotal +
                '}';
    }

    public int getDiffFromPrevDay() {
        return diffFromPrevDay;
    }

    public void setDiffFromPrevDay(int diffFromPrevDay) {
        this.diffFromPrevDay = diffFromPrevDay;
    }
}
