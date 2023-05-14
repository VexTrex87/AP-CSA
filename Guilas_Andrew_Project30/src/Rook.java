import java.util.ArrayList;

public class Rook extends ChessPiece {

	public ArrayList<String> canMoveTo() {
		ArrayList<String> possibleMoves = new ArrayList<>();

        char file = coordinates.charAt(0);
        int rank = Character.getNumericValue(coordinates.charAt(1));
		
        // add vertical moves
        for (int i = 1; i <= 8; i++) {
        	if (i != rank) {
            	String possibleMove = file + "" + i;
            	possibleMoves.add(possibleMove);
        	}
        }
       
        // add horizontal moves
        for (char newFile = 'a'; newFile <= 'h'; newFile++) {
            if (newFile != file) {
            	String possibleMove = newFile + "" + rank;
            	possibleMoves.add(possibleMove);
            }
        }
        
        possibleMoves = super.filterMoves(possibleMoves);
		return possibleMoves;
	}
	
}
