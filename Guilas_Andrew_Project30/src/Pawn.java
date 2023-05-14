import java.util.ArrayList;

public class Pawn extends ChessPiece {

	public ArrayList<String> canMoveTo() {
		ArrayList<String> possibleMoves = new ArrayList<>();
		
        char file = coordinates.charAt(0);
        int rank = Character.getNumericValue(coordinates.charAt(1));

        // add moves around pawn
        if (rank == 2) {
            possibleMoves.add(file + "" + (rank + 1));
            possibleMoves.add(file + "" + (rank + 2));
        } else {
            possibleMoves.add(file + "" + (rank + 1));
        }
		
        possibleMoves = super.filterMoves(possibleMoves);
		return possibleMoves;
	}
	
}
