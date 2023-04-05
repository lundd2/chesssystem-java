package boardgame;

public class Board {
	
	
//	"starting to implement Board and Piece
//	checklist:
//	i: Classes Piece, Board[public]
//	i: OOP topics:
//		º Associations
//		º Encapsulation / Access Modifiers
//	i: Data Structures Topics:
//		º Matrix
//	
//	aula 2: criou a classe Board com o diagrama :  Board   
//													rows : int
//													columns : int
//														ºpiece(row : int, columns : int) : Piece
//														ºpiece(position : Position) : Piece
//														ºplacePiece(piece : Piece, position : Position) : void 
//														ºremovePiece(Position : Position) : Piece
//														ºpositionExists(Position : Position) : boolean
//														ºthereisAPiece(Position : Position) : boolean
	
	
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		//completar manualmente
		pieces = new Piece[rows][columns];
		
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	public int getColumns() {
		return columns;
	}
	public void setColumns(int columns) {
		this.columns = columns;
	}
	// como terá metodos com a piece então não criar getters and setters
	public Piece piece(int row, int column) {
		return pieces[row][column];
	}
// checklist:
//   	i: Methods: Board.Piece(row,Column)and Board.Piece(position)
//		i: Enum Chess.Color
//		i: Class Chess.ChessPiece [public]
//		i: Class Chess.ChessMatch [public]
//		i: Class ChessConsole.UI 
//		i: OOP Topics:
//				º Enumerations
//				º Encapsulation / Access Modifiers
//				º Inheritance
//				º Downcasting
//				º Static members
//				º Layers pattern
//		i: Data Structures Topics:
//				º Matrix
//
//
	
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
	}
}
