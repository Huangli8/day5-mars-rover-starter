package com.afs.tdd;

public class MarsRover {
    Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void executeCommand(Command command) {
        switch(command){
            case M:
                moveForward();
                break;
            case L:
                turnLeft();
                break;
        }

    }

    private void moveForward() {
        switch (location.getDirection()) {
            case N:
                location.setYCoordinate(location.getYCoordinate() + 1);
                break;
            case E:
                location.setXCoordinate(location.getXCoordinate() + 1);
                break;
            case S:
                location.setYCoordinate(location.getYCoordinate() - 1);
                break;
            case W:
                location.setXCoordinate(location.getXCoordinate() - 1);
                break;
        }
    }
    private void turnLeft() {
        switch(location.getDirection()) {
            case N:
                location.setDirection(Direction.W);
                break;
            case E:
                location.setDirection(Direction.N);
                break;
            case S:
                location.setDirection(Direction.E);
                break;
            case W:
                location.setDirection(Direction.S);
                break;
        }
    }
}