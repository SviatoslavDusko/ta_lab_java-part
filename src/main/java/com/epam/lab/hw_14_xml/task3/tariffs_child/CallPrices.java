package com.epam.lab.hw_14_xml.task3.tariffs_child;

public class CallPrices {
    private int onNetwork;
    private int outOfNetwork;
    private int stationary;

    public CallPrices(int onNetwork, int outOfNetwork, int stationary) {
        setOnNetwork(onNetwork);
        setOutOfNetwork(outOfNetwork);
        setStationary(stationary);
    }

    public int getOnNetwork() {
        return onNetwork;
    }

    public void setOnNetwork(int onNetwork) {
        if (onNetwork >= 0) {
            this.onNetwork = onNetwork;
        } else System.out.println("Not valid on network calls price.");
    }

    public int getOutOfNetwork() {
        return outOfNetwork;
    }

    public void setOutOfNetwork(int outOfNetwork) {
        if (outOfNetwork >= 0) {
            this.outOfNetwork = outOfNetwork;
        } else System.out.println("Not valid out of network calls price.");
    }

    public int getStationary() {
        return stationary;
    }

    public void setStationary(int stationary) {
        if (stationary >= 0) {
            this.stationary = stationary;
        } else System.out.println("Not valid stationary calls price");
    }
}
