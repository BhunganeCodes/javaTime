public class Main {
    public static void main(String[] args){
        // Initialize the new person instance with parameters
        Person person = new Person("Thami", 28, 171, "Football");

        System.out.println(person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getHeight());
        System.out.println(person.getSport());

        // Reassign attribute values
        person.setName("Bobby Brown");
        person.setAge(54);
        person.setHeight(200);
        person.setSport("Cricket");

        System.out.println("\n" + person.getName());
        System.out.println(person.getAge());
        System.out.println(person.getHeight());
        System.out.println(person.getSport());

    }
}