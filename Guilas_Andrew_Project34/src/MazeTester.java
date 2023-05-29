
public class MazeTester {
	public static void main(String[] args) {
		char[][] maze = {
		        {'*', ' ', '*', '*', '*', '*', '*', '*', '*'},
		        {'*', ' ', ' ', ' ', ' ', '*', '*', ' ', '*'},
		        {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'},
		        {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'},
		        {'*', ' ', '*', ' ', '*', '*', '*', ' ', '*'},
		        {'*', ' ', ' ', ' ', '*', ' ', ' ', ' ', '*'},
		        {'*', '*', '*', ' ', '*', ' ', '*', ' ', '*'},
		        {'*', ' ', ' ', ' ', ' ', ' ', '*', ' ', '*'},
		        {'*', '*', '*', '*', '*', '*', '*', ' ', '*'},
		};
		
		Maze mazeTester = new Maze(maze);
		if (mazeTester.exploreMaze(1, 1, 0)) {
			System.out.println("Exit found: true");
            for (char[] row : maze) {
                System.out.println(new String(row));
            }
		} else {
			System.out.println("No path found");
		}
	}
}
