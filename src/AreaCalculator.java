public class AreaCalculator {
    // Luas lingkaran (dengan parameter jari-jari)
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    // Luas persegi panjang (dengan parameter panjang dan lebar)
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Luas segitiga (dengan parameter alas dan tinggi, menggunakan flag agar berbeda tanda tangan)
    public double calculateArea(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        }
        return 0;
    }

    public static void main(String[] args) {
        AreaCalculator ac = new AreaCalculator();
        System.out.println("Luas lingkaran (radius 5): " + ac.calculateArea(5));
        System.out.println("Luas persegi panjang (4 x 6): " + ac.calculateArea(4, 6));
        System.out.println("Luas segitiga (alas=3, tinggi=7): " + ac.calculateArea(3, 7, true));
    }
}
