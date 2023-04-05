package boardgame;

public class Board {
	
	
//	"starting to implement Board and Piece
//	checklist:
//	i: Classes Piece, Board[public]
//	i: OOP topics:
//		� Associations
//		� Encapsulation / Access Modifiers
//	i: Data Structures Topics:
//		� Matrix
//	
//	aula 2: criou a classe Board com o diagrama :  Board   
//													rows : int
//													columns : int
//														�piece(row : int, columns : int) : Piece
//														�piece(position : Position) : Piece
//														�placePiece(piece : Piece, position : Position) : void 
//														�removePiece(Position : Position) : Piece
//														�positionExists(Position : Position) : boolean
//														�thereisAPiece(Position : Position) : boolean
	
	
	
	private int rows;
	private int columns;
	private Piece[][] pieces;
	public Board(int rows, int columns) {
		if (rows < 1 || columns < 1) {
			throw new BoardException("Error creating board: there must be at least 1 row and 1 column");
		}
		this.rows = rows;
		this.columns = columns;
		//completar manualmente
		pieces = new Piece[rows][columns];
		
	}
	public int getRows() {
		return rows;
	}
	/*public void setRows(int rows) {
		this.rows = rows;
	}*/
	public int getColumns() {
		return columns;
	}
	/*public void setColumns(int columns) {
		this.columns = columns;
	}*/
	// como ter� metodos com a piece ent�o n�o criar getters and setters
	public Piece piece(int row, int column) {
		if (!positionExists(row, column)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[row][column];
	}
// checklist:
//   	i: Methods: Board.Piece(row,Column)and Board.Piece(position)
//		i: Enum Chess.Color
//		i: Class Chess.ChessPiece [public]
//		i: Class Chess.ChessMatch [public]
//		i: Class ChessConsole.UI 
//		i: OOP Topics:
//				� Enumerations
//				� Encapsulation / Access Modifiers
//				� Inheritance
//				� Downcasting
//				� Static members
//				� Layers pattern
//		i: Data Structures Topics:
//				� Matrix
//
//
	
	public Piece piece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return pieces[position.getRow()][position.getColumn()];
	}
	public void placePiece(Piece piece, Position position) {
		if (thereIsAPiece(position)) {
			throw new BoardException("there is already a piece on position " + position);
		}
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
	
	private boolean positionExists(int row, int column) {
		return row >= 0 && row < rows && column >= 0 && column < columns;
	}
	public boolean positionExists(Position position) {
		return positionExists(position.getRow(), position.getColumn());
	}
	
	public boolean thereIsAPiece(Position position) {
		if (!positionExists(position)) {
			throw new BoardException("Position not on the board");
		}
		return piece(position) != null;
	}
}
