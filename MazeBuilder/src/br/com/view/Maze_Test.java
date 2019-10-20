package br.com.view;

import br.com.model.MazeBuilder;

public class Maze_Test {
	
	public static void main(String[] args) {
		
		MazeBuilder builder = new MazeBuilder();
		
	    builder.buildMaze();
	    builder.buildRoom(1);
	    builder.buildRoom(2) ;
	    builder.buildDoor(1, 2);

	    builder.getMaze();
	    
	}
				
}

