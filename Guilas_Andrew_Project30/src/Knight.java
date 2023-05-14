import java.util.ArrayList;

public class Knight extends ChessPiece {

	public ArrayList<String> canMoveTo() {
		ArrayList<String> possibleMoves = new ArrayList<>();

        char file = coordinates.charAt(0);
        int rank = Character.getNumericValue(coordinates.charAt(1));
		
        // add L-shaped moves
        
        String previousFile1 = String.valueOf((char) (file - 1));
        possibleMoves.add(previousFile1 + "" + (rank - 2));
        possibleMoves.add(previousFile1 + "" + (rank + 2));

        String previousFile2 = String.valueOf((char) (file - 2));
        possibleMoves.add(previousFile2 + "" + (rank - 1));
        possibleMoves.add(previousFile2 + "" + (rank + 1));

        String nextFile1 = String.valueOf((char) (file - 1));
        possibleMoves.add(nextFile1 + "" + (rank - 2));
        possibleMoves.add(nextFile1 + "" + (rank + 2));

        String nextFile2 = String.valueOf((char) (file - 2));
        possibleMoves.add(nextFile2 + "" + (rank - 1));
        possibleMoves.add(nextFile2 + "" + (rank + 1));
        
        // end
        
        possibleMoves = super.filterMoves(possibleMoves);
		return possibleMoves;
	}
	
}
