public class Square {

	private int width,
	private int length;

	public Square(width, length) {
		this.width = width;
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public int getLength() {
		return this.length;
	}

	public int area() {
		return width * length;
	}

	public int perimeter() {
		return (2 * width) + (2 * length);
	}

}