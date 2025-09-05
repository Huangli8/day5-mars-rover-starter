package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static com.afs.tdd.Command.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {
    @Test
    void should_move_when_executeCommand_given_M_origin_direction_N() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(M);
        Location currentLocation = new Location(0,1,Direction.N);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_when_executeCommand_given_M_origin_direction_S() {
        //given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(M);
        Location currentLocation = new Location(0,-1,Direction.S);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_when_executeCommand_given_M_origin_direction_W() {
        //given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(M);
        Location currentLocation = new Location(-1,0,Direction.W);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_when_executeCommand_given_M_origin_direction_E() {
        //given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(M);
        Location currentLocation = new Location(1,0,Direction.E);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_origin_direction_N() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(L);
        Location currentLocation = new Location(0,0,Direction.W);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_origin_direction_S() {
        //given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(L);
        Location currentLocation = new Location(0,0,Direction.E);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_origin_direction_W() {
        //given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(L);
        Location currentLocation = new Location(0,0,Direction.S);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_left_when_executeCommand_given_L_origin_direction_E() {
        //given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(L);
        Location currentLocation = new Location(0,0,Direction.N);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }


    @Test
    void should_turn_right_when_executeCommand_given_R_origin_direction_N() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(R);
        Location currentLocation = new Location(0,0,Direction.E);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_origin_direction_S() {
        //given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(R);
        Location currentLocation = new Location(0,0,Direction.W);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_origin_direction_W() {
        //given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(R);
        Location currentLocation = new Location(0,0,Direction.N);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_turn_right_when_executeCommand_given_R_origin_direction_E() {
        //given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(R);
        Location currentLocation = new Location(0,0,Direction.S);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_back_when_executeCommand_given_B_origin_direction_N() {
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.B);
        Location currentLocation = new Location(0,-1,Direction.N);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_back_when_executeCommand_given_B_origin_direction_S() {
        //given
        Location location = new Location(0, 0, Direction.S);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.B);
        Location currentLocation = new Location(0,1,Direction.S);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_back_when_executeCommand_given_B_origin_direction_W() {
        //given
        Location location = new Location(0, 0, Direction.W);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.B);
        Location currentLocation = new Location(1,0,Direction.W);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }
    @Test
    void should_move_back_when_executeCommand_given_B_origin_direction_E() {
        //given
        Location location = new Location(0, 0, Direction.E);
        MarsRover marsRover = new MarsRover(location);
        //when
        marsRover.executeCommand(Command.B);
        Location currentLocation = new Location(-1,0,Direction.E);
        //then
        assertEquals(currentLocation.getXCoordinate(), marsRover.getLocation().getXCoordinate());
        assertEquals(currentLocation.getYCoordinate(), marsRover.getLocation().getYCoordinate());
        assertEquals(currentLocation.getDirection(), marsRover.getLocation().getDirection());
    }

    @Test
    void should_return_location_and_direction_when_execute_batch_of_commands(){
        //given
        Location location = new Location(0, 0, Direction.N);
        MarsRover marsRover = new MarsRover(location);
        Command[] commands = {M,L,L,M,R,B};
        //when
        String expectedReport = marsRover.executeBatchOfCommands(commands);
        Location currentLocation = new Location(1,0,Direction.W);
        //then
        assertEquals(currentLocation.generateLocationInfo(),expectedReport);
    }


}
