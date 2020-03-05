package com.epam.lab.hw_7_8_collection.arrays.logical_task.task_d;

public class Door {
    private int numberDoor;
    private boolean isStatusDoor;
    private boolean behindTheDoor;

    Door(int numberDoor, boolean behindTheDoor) {
        this.numberDoor = numberDoor;
        this.behindTheDoor = behindTheDoor;
        this.isStatusDoor = false;
    }

    boolean isStatusDoor() {
        return isStatusDoor;
    }

    void setStatusDoor() {
        this.isStatusDoor = true;
    }

    boolean getBehindTheDoor(boolean bool) {
        return bool;
    }
}
