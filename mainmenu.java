package Fourteen;

import java.util.Scanner;

public class mainmenu {
	public static void main(String[] args){
		System.out.println("Welcome to the linkedlist data stucture program");	
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. Add at the start");
		System.out.println("2. Add at the end");
		System.out.println("3. Add at the between");
		System.out.println("4. Delete first element");
		
		switch(scanner.nextInt()){
		case 1 : operations.addDataAtTheStart();
		break;
		
		case 2 : operations.addAtTheEnd();
		break;
		
		case 3 : operations.addAtTheBetween();
		break;
		
		case 4 : operations.deleteAtFirst();
		break;
		
		}
	}
}