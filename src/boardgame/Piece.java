package boardgame;

public class Piece {
	
	
//	"starting to implement Board and Piece
//	checklist:
//	i: Classes Piece, Board[public]
//	i: OOP topics:
//		� Associations
//		� Encapsulation / Access Modifiers
//	i: Data Structures Topics:
//		� Matrix
//	
//	aula 2: criou a classe Piece  com o diagrama  Piece															
//	                                                          #position : Position
//	                                                          		�possibleMove() : Piece[][]
//	                                                          		�possibleMove(position : Position) : boolean
//	                                                          		�isThereAnyPossibleMove() : boolean
//	                                                          
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	
	protected Board getBoard() {
		return board;
	}
	

}
