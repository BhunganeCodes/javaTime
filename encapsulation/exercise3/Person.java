public class Person {
    // Encapsulation is when a class has private attributes.
    // Those attributes are retrievable through methods called setters and getters.
    // Encapsulated classes have constructors

    private String name;
    private int age;
    private int height;
    private String sport;

    Person(String name, int age, int height, String sport){
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
        this.setSport(sport);
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public int getHeight(){
        return height;
    }

    public String getSport(){
        return sport;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setSport(String sport){
        this.sport = sport;
    }
}