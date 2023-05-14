import java.util.ArrayList;

public class ChessPieceTester {

	public static void main(String[] args) {

        // Create a pawn
        Pawn pawn = new Pawn();
        pawn.setPosition("d2");
        ArrayList<String> pawnMoves = pawn.canMoveTo();
        System.out.println("Pawn moves: " + pawnMoves);

        // Create a knight
        Knight knight = new Knight();
        knight.setPosition("g8");
        ArrayList<String> knightMoves = knight.canMoveTo();
        System.out.println("Knight moves: " + knightMoves);

        // Create a bishop
        Bishop bishop = new Bishop();
        bishop.setPosition("c4");
        ArrayList<String> bishopMoves = bishop.canMoveTo();
        System.out.println("Bishop moves: " + bishopMoves);

        // Create a rook
        Rook rook = new Rook();
        rook.setPosition("a1");
        ArrayList<String> rookMoves = rook.canMoveTo();
        System.out.println("Rook moves: " + rookMoves);

        // Create a queen
        Queen queen = new Queen();
        queen.setPosition("e5");
        ArrayList<String> queenMoves = queen.canMoveTo();
        System.out.println("Queen moves: " + queenMoves);

        // Create a king
        King king = new King();
        king.setPosition("h1");
        ArrayList<String> kingMoves = king.canMoveTo();
        System.out.println("King moves: " + kingMoves);
	
	}

}
