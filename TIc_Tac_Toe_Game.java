package tic_tac_toe;

public class TIc_Tac_Toe_Game {

	public void Board_game() {

		char[] Board = new char[10];
		for (int i = 1; i < Board.length; i++) {
			Board[i] = ' ';
			System.out.println(Board[i]);
		}
	}

	    public static void main(String[] args) {
		TIc_Tac_Toe_Game obj = new TIc_Tac_Toe_Game();
		obj.Board_game();

		System.out.println("board has been created");
	}
}
