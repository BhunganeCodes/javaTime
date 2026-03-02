public class Main {

    public static void main(String[] args){
        Car car = new Car("Toyota", "Supra", 2021);
        
        car.setMake("Lamborghini");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}