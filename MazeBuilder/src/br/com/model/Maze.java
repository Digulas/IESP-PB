package br.com.model;

import java.util.ArrayList;

public class Maze {
	
	private ArrayList<Room> rooms;
    private ArrayList<Door> doors;

    public Maze() {}

    public void addRoom(Room room) {
        rooms.add(room);
    }
    public void addDoor(Door door) {
        doors.add(door);
    }
    public Room findRoom(int id) {
        return rooms.get(id);
    }
    public ArrayList<Room> getRooms() {
        return rooms;
    }
    public ArrayList<Door> getDoors() {
        return doors;
    }
    public Maze clone() {
        Maze clone = new Maze();

        for (int i = 0; i < rooms.size(); i++)
            clone.rooms.add(rooms.get(i).clone());
        for (int i = 0; i < doors.size(); i++) {
            Door clonedDoor = doors.get(i);
            clone.doors.add(clonedDoor.clone(rooms.get(clonedDoor.room1.getId()), rooms.get(clonedDoor.room2.getId())));
        }
        return clone;
    }
}
