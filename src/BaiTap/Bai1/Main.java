import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Nhập cạnh thứ nhất của tam giác: ");
            double side1 = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ hai của tam giác: ");
            double side2 = scanner.nextDouble();
            System.out.println("Nhập cạnh thứ ba của tam giác: ");
            double side3 = scanner.nextDouble();
            daobenem(side1, side2, side3);
            IllegalTriangleException.Triangle triangle = new IllegalTriangleException.Triangle();
            triangle.triangle(side1, side2, side3);
            triangle.display();
        } catch (IllegalTriangleException e) {
            System.err.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Đã xảy ra lỗi: " + e.getMessage());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }

    }

    static void daobenem(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
            throw new IllegalTriangleException("Các cạnh của tam giác phải lớn hơn 0");
        }
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1) {
            throw new IllegalTriangleException("Tổng của hai cạnh phải lớn hơn cạnh còn lại");
        }
    }
}
