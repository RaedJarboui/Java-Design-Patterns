package com.liskov.substitution;

//no need to extends Rectangle because we gonna change setWidth and setHeight methodes inside Square Class because we have only  ->
//side attribute inside square class
public class Square implements Shape {

	private int side;

	Square(int side) {

	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}

}
