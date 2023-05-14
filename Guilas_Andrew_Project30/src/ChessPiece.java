import java.util.ArrayList;

public class ChessPiece {
	
	protected String coordinates;
	
	public void setPosition(String coordinates) {
		this.coordinates = coordinates;
	}
	
	public ArrayList<String> canMoveTo() {
		ArrayList<String> possibleMoves = new ArrayList<>();

		return possibleMoves;
	}
	
	public ArrayList<String> filterMoves(ArrayList<String> possibleMoves) {
		ArrayList<String> filteredPossibleMoves = new ArrayList<>();
		
		// remove moves that are out-of-bounds
	    for (int i = 0; i < possibleMoves.size(); i++) {
	    	String possibleMove = possibleMoves.get(i);
	        char file = possibleMove.charAt(0);
	        int rank = Character.getNumericValue(possibleMove.charAt(1));
	        if (file >= 'a' && file <= 'h' && rank >= 1 && rank <= 8) {
	        	
	    	    // remove duplicate values
	        	if (!filteredPossibleMoves.contains(possibleMove)) {
		        	filteredPossibleMoves.add(possibleMove);
	        	}
	        }
	    }
	    
	    return filteredPossibleMoves;
	}
	
}
