public class Animal {
    private String name;
    private int age;
    private String sound;

    Animal(String name, int age, String sound) {
        this.setName(name);
        this.setAge(age);
        this.setSound(sound);
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getSound(){
        return sound;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setSound(String sound){
        this.sound = sound;
    }
}