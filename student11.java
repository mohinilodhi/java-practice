class Vehicle{
    String brand;
    int speed;

    void showVehicle(){
        System.out.println("Brand:" + brand);
        System.out.println("Speed:" + speed);

    }

}

class Car extends Vehicle {
    String model;


    void ShowCar() {
        System.out.println("Model:" + model);

    }
}

public class student11{
    public static void main(String[]args) {
        Car c1 = new Car();


        c1.brand = "Toyota";
        c1.speed = 120;
        c1.model = "Fortuner";

        c1.showVehicle();
        c1.ShowCar();
    }
}