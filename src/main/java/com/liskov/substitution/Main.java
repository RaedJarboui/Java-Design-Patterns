package com.liskov.substitution;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());

		Square square = new Square(10);
		System.out.println(square.computeArea());

		useRectangle(rectangle);

		// useRectangle(square); ->change it to useSquare
		useSquare(square);

	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		if (rectangle.getHeight() == 20)
			System.err.println("Height Not equal to 20");
		if (rectangle.getWidth() == 30)
			System.err.println("Width Not equal to 30");
	}

	private static void useSquare(Square square) {
		square.setSide(20);
		if (square.getSide() != 20)
			System.err.println("side Not equal to 20");

		System.out.println("side is equal to 30");
	}

}
