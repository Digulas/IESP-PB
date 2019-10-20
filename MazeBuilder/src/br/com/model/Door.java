package br.com.model;

public class Door implements MapSite {
	
	protected Room room1, room2;
    protected boolean isOpen;

    public Door(Room room1, Room room2, boolean isOpen) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = isOpen;
    }

    public void open() {
        
    }
    public void enter() {
        
    }
    public Door clone(Room clonedRoom1, Room clonedRoom2) {
        return new Door(clonedRoom1, clonedRoom2, isOpen);
    }
    
}
