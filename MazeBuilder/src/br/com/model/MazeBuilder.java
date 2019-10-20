package br.com.model;

import br.com.model.Maze;

public interface MazeBuilder {

	Maze getMaze();

    void buildMaze();
    void buildRoom(int id);
    void buildDoor(int from, int to);
    
}
