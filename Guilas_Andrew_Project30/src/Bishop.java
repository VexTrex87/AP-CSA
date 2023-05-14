import java.util.ArrayList;

public class Bishop extends ChessPiece {

	public ArrayList<String> canMoveTo() {
		ArrayList<String> possibleMoves = new ArrayList<>();

        char file = coordinates.charAt(0);
        int rank = Character.getNumericValue(coordinates.charAt(1));
		
        // add diagonal moves
        for (int i = 1; i <= 4; i++) {
            String previousFile = String.valueOf((char) (file - i));
            possibleMoves.add(previousFile + "" + (rank - i));
            possibleMoves.add(previousFile + "" + (rank + i));
        	
            String nextFile = String.valueOf((char) (file + i));
            possibleMoves.add(nextFile + "" + (rank - i));
            possibleMoves.add(nextFile + "" + (rank + i));
        }
        
        possibleMoves = super.filterMoves(possibleMoves);
		return possibleMoves;
	}
	
}
