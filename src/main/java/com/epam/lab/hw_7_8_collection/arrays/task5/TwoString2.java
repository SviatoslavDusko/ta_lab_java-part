package com.epam.lab.hw_7_8_collection.arrays.task5;


public class TwoString2 implements Comparable<TwoString2> {
    private String country;
    private String capital;

    public TwoString2(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public int compareTo(TwoString2 o) {
        return this.getCapital().compareTo(o.getCapital());
    }

    @Override
    public String toString() {
        return "TwoString{" +
                "country='" + country + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
