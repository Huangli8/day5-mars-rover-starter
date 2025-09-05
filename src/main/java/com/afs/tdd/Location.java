package com.afs.tdd;

public class Location {
    int xCoordinate;
    int yCoordinate;
    Direction direction;

    public Location(int xCoordinate, int yCoordinate, Direction direction) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.direction = direction;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public String generateLocationInfo() {
        return String.format("location coordinates: x: %d, y: %d, direction: %s", xCoordinate, yCoordinate, direction.name());
    }
}
