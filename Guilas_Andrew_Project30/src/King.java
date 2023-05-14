import java.util.ArrayList;

public class King extends ChessPiece {

	public ArrayList<String> canMoveTo() {
		ArrayList<String> possibleMoves = new ArrayList<>();

        char file = coordinates.charAt(0);
        int rank = Character.getNumericValue(coordinates.charAt(1));
		
        // add moves around king
        
        String previousFile = String.valueOf((char) (file - 1));
        possibleMoves.add(previousFile + "" + (rank - 1));
        possibleMoves.add(previousFile + "" + (rank));
        possibleMoves.add(previousFile + "" + (rank + 1));
        
        possibleMoves.add(file + "" + (rank - 1));
        possibleMoves.add(file + "" + (rank + 1));
        
        String nextFile = String.valueOf((char) (file + 1));
        possibleMoves.add(nextFile + "" + (rank - 1));
        possibleMoves.add(nextFile + "" + (rank));
        possibleMoves.add(nextFile + "" + (rank + 1));
        
        // end
        
        possibleMoves = super.filterMoves(possibleMoves);
		return possibleMoves;
	}
	
}
