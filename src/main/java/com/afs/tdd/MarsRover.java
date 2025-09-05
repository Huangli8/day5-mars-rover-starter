package com.afs.tdd;

public class MarsRover {
    Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public String executeBatchOfCommands(Command[] commands) {
        for(Command command:commands){
            executeCommand(command);
        }
        return location.generateLocationInfo();
    }

    public void executeCommand(Command command) {
        switch(command){
            case M:
                moveForward();
                break;
            case L:
                turnLeft();
                break;
            case R:
                turnRight();
                break;
            case B:
                moveBackward();
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
    private void moveBackward() {
        switch (location.getDirection()) {
            case N:
                location.setYCoordinate(location.getYCoordinate() - 1);
                break;
            case E:
                location.setXCoordinate(location.getXCoordinate() - 1);
                break;
            case S:
                location.setYCoordinate(location.getYCoordinate() + 1);
                break;
            case W:
                location.setXCoordinate(location.getXCoordinate() + 1);
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
    private void turnRight() {
        switch(location.getDirection()) {
            case N:
                location.setDirection(Direction.E);
                break;
            case E:
                location.setDirection(Direction.S);
                break;
            case S:
                location.setDirection(Direction.W);
                break;
            case W:
                location.setDirection(Direction.N);
                break;
        }
    }
}