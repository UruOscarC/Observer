package com.ogcg.observer;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Subject sub = new Subject();
	        // Client configures the number and type of Observers
	        new HexObserver(sub);
	        new OctObserver(sub);
	        new BinObserver(sub);
	        Scanner scan = new Scanner(System.in);
	        for (int i = 0; i < 5; i++) {
	            System.out.print("\nEnter a number: ");
	            sub.setState(scan.nextInt());
	        }
	}

}