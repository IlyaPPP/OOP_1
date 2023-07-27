public class Rectangle {

    private int width;
    private int height;

    public void Create() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void calculateArea() {
        System.out.println("Площадь прямоугольника -> " + width * height);
    }

    public void calculatePerimeter() {
        System.out.println("Периметр прямоугольника -> " + ((width + height) * 2));
    }
}
