package fcu.iecs.oop.tiida;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num;
		Scanner input = new Scanner(System.in);
		NissanTiida Tiida = new NissanTiida();
		System.out.printf("Please enter a number:");
		num=input.nextInt();
		for(int i=0;i<num;i++){
			Tiida.tiida();
			System.out.printf("\n");
		}
		input.close();

	}

}
