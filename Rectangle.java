public class Rectangle {

    private int length;
    private int width;

    public Rectangle() {

        length = 1;
        width = 1;
    }

    public Rectangle(int l, int w) {

        length = l;
        width = w;
    }

    public int getWidth() {

        return width;

    }

    public int getLength() {

        return length;
    }

    public int calculateArea() {

        int area = length * width;
        return area;
    }

    public int calculatePerimeter() {

        int perimeter = (2 * length) + (2 * width);
        return perimeter;

    }
}