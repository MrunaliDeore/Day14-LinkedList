package Fourteen;

import java.util.Scanner;

public class mainmenu {
	public static void main(String[] args){
		System.out.println("Welcome to the linkedlist data stucture program");	
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add at the start");
	
		switch(scanner.nextInt()){
		case 1 : operations.addDataAtTheStart();
		break;
		
		}
	}
}
