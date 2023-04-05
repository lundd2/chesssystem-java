package chess;

import boardgame.Board;
import boardgame.Piece;
//aula 3: criar a classe ChessPiece
public class ChessPiece extends Piece{
	
	private Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
// apagar o setColor para que o cor da peça não seja modificada
	
	
	
}
