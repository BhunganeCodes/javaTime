public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Frog", 3, "Ribbit");

        System.out.println(animal.getName());
        animal.setName("Dog");
        animal.setSound("Wooooof");

        System.out.println(animal.getSound());
    }

    
}