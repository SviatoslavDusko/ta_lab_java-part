package com.epam.lab.hw_15_json.task3.tariffs_child;

public class Parameters {
    private long favoriteNumber;
    private int tariffing;
    private int connectionCost;

    public Parameters(long favoriteNumber, int tariffing, int connectionCost) {
        setFavoriteNumber(favoriteNumber);
        setTariffing(tariffing);
        setConnectionCost(connectionCost);
    }

    public long getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(Long favoriteNumber) {
        if (favoriteNumber >= 380500000000L && favoriteNumber < 380999999999L) {
            this.favoriteNumber = favoriteNumber;
        } else System.out.println("Not valid favorite number.");
    }

    public int getTariffing() {
        return tariffing;
    }

    public void setTariffing(int tariffing) {
        if (tariffing > 0) {
            this.tariffing = tariffing;
        } else System.out.println("Not valid tariffing price.");
    }

    public int getConnectionCost() {
        return connectionCost;
    }

    public void setConnectionCost(int connectionCost) {
        if (connectionCost >= 0) {
            this.connectionCost = connectionCost;
        } else System.out.println("Not valid connection cost.");
    }
}
