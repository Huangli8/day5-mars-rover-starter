package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_move_when_executeCommand_given_M() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.M);
        Location currentLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.L);
        Location currentLocation = new Location(0,0,Direction.W);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.R);
        Location currentLocation = new Location(0,0,Direction.E);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

}
