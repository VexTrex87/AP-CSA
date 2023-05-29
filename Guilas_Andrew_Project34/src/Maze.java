
public class Maze {

    private final int[][] MOVES = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
	
	private char[][] maze;
	private int mazeWidth;
	private int mazeHeight;

	public Maze(char[][] mazeData) {
		this.maze = mazeData;
		mazeWidth = maze[0].length;
		mazeHeight = maze.length;
	}
	
    public boolean exploreMaze(int x, int y, int currentDirection) {
        if (maze[y][x] == ' ') {
            if (x == 0 || y == 0 || x == mazeWidth - 1 || y == mazeHeight - 1) {
                return true;  // Reached an exit
            }

            maze[y][x] = '.';  // Mark as visited


            for (int i = 0; i < 4; i++) {
            	// directions: right, down, left, up
                int nextDirection = (currentDirection + i) % 4;
                int nextX = x + MOVES[nextDirection][0];
                int nextY = y + MOVES[nextDirection][1];

                if (exploreMaze(nextX, nextY, nextDirection)) {
                    return true;  // Exit found in the current direction
                }
            }

            maze[y][x] = ' ';  // No path found, mark the position as unvisited
        }

        return false;  // No escape path found
    }
	
}
