class Vehicle {
    public void move() {
        System.out.println("Kendaraan bergerak");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Mobil melaju di jalan raya");
    }
}

class Bicycle extends Vehicle {
    @Override
    public void move() {
        System.out.println("Sepeda berkeliling di jalur sepeda");
    }
}

public class Overriding{
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        Vehicle vehicle2 = new Car();
        Vehicle vehicle3 = new Bicycle();

        vehicle1.move(); // Output: Kendaraan bergerak
        vehicle2.move(); // Output: Mobil melaju di jalan raya
        vehicle3.move(); // Output: Sepeda berkeliling di jalur sepeda
    }
}
