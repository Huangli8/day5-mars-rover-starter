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
        marsRover.executeCommand("M");
        Location currentLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(currentLocation.getxCoordinate(), marsRover.getLocation().getxCoordinate());
        assertEquals(currentLocation.getyCoordinate(), marsRover.getLocation().getyCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
}
