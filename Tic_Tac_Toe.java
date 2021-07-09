package tic_tac_toe;

import java.util.Scanner;

public class Tic_Tac_Toe {
	public static void Board_game() {

		char[] Board = new char[10];
		for (int i = 1; i < Board.length; i++) {
			Board[i] = ' ';
			System.out.println(Board[i]);
		}
	}
	public static void Option() {
		System.out.println("Choose the Option : X or O :");
		Scanner obj1 = new Scanner(System.in);
		char user1=obj1.next().charAt(0);
//		Scanner obj2 = new Scanner(System.in);
//		int user2=obj2.nextInt();
		if(user1=='X'){
			System.out.println("User Choose the option as " +user1);
			char Comp='O';
			System.out.println("Computer chosse the option" +Comp);
		}
		else
			System.out.println("User Choose the option as "+user1);
			char Comp='X';
			System.out.println("Computer Choose the option as " +Comp);
		
	}

	    public static void main(String[] args) {
		TIc_Tac_Toe_Game obj = new TIc_Tac_Toe_Game();
		Board_game();
		Option();
		System.out.println("board has been created");
	}
		

}
