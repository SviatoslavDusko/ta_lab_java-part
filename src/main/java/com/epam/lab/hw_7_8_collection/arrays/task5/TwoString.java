package com.epam.lab.hw_7_8_collection.arrays.task5;


public class TwoString implements Comparable<TwoString> {
    private String country;
    private String capital;

    public TwoString(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public int compareTo(TwoString o) {
        return this.getCountry().compareTo(o.getCountry());
    }

    @Override
    public String toString() {
        return "TwoString{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
