package br.com.model;

import java.util.ArrayList;
import java.util.Random;
import br.com.model.Maze;;

public class MazeCore implements MazeBuilder {
	
	private Maze currentMaze;

    public void buildMaze() {
        currentMaze = new Maze();
    }
    public void buildRoom(int id) {
        currentMaze.addRoom(new Room(id));
    }
    public void buildDoor(int from, int to) {
        ArrayList<Room> rooms = currentMaze.getRooms();

        Door mutualDoor = new Door(rooms.get(from), rooms.get(to), new Random().nextBoolean());
        rooms.get(from).setSide(getNeighbourDirection(from, to), mutualDoor);
        rooms.get(to).setSide(getNeighbourDirection(to, from), mutualDoor);

        currentMaze.addDoor(mutualDoor);
    }
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction getNeighbourDirection(int from, int to) {
        // logic, code below will do
        return Direction.values()[new Random().nextInt() % 4];
    }
}
