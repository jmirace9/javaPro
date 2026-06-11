package com.util;

public class Graphic2D {



	public static void drawLine() {
		System.out.println("=---------------=");
	}
	public static void drawLine(int length) {
		for (int i = 1; i <= length; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
	public static void drawLine(int length, char style) {
		for (int i = 1; i <= length; i++) {
			
			System.out.print(style);
		}
		System.out.println();
	}
}


