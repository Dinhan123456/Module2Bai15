
public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String message) {
        super(message);
    }

    public static class Triangle {
        private double side1;
        private double side2;
        private double side3;

        public void triangle(double side1, double side2, double side3) throws IllegalTriangleException {
            Main.daobenem(side1, side2, side3);
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }

        public void display() {
            System.out.println("Tam giác với các cạnh: " + side1 + ", " + side2 + ", " + side3);
        }
    }
}
