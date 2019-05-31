package com.example.parkingmonitor.model;

public class Parking {

    private int number;
    private boolean busy;

    public Parking(int number) {
        this.number = number;
        this.busy = false;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean getBusy() {
        return busy;
    }

    public void setBusy(boolean busy) {
        this.busy = busy;
    }
}
