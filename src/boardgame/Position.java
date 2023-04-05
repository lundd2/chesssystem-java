package boardgame;

public class Position {
	
	//encapsulamento privados e inteiros
	private int row;
	private int column;
	
//	public Position(){
//		
//	}
// aula 1: criou classe Position com   diagrama  	row : int 
//									 				column : int
//									 				setValue(row int, column int) void
//  "first class: Position"
//  i: Class Position[public]
//	i: OOP Topics:
//		º Encapsulation
//		º Constructors
//		º toString (Object/ overrinding) fim.. ir para a classe Piece
	
	
	//construtor recebendo os argumentos
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	// faz parte do encapsulamento
	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int column) {
		this.column = column;
	}
	//o conceito de Object é uma clase sobre as classes
	@Override
	public String toString() {
	return row + ", " + column;	
	}
}
