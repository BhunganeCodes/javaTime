public class Car {
    // Encapsulation is when you make the attributes of a class private.
    // You can only access these attributes through methods called setters and getters.

    private String make;
    private String model;
    private int year;

    Car (String make, String model, int year) {        // This is the constructor of the class that takes in parameters.
        this.setMake(make);
        this.setModel(model);;
        this.setYear(year);
        
        }

        // In order to get values, we need to create getter methods

        public String getMake(){
            return make;
        }

        public String getModel(){
            return model;
        }

        public int getYear(){
            return year;
        }

        // To set or reassign, we use setters
        public void setMake(String make){
            this.make = make;
        }

        public void setModel(String model){
            this.model = model;
        }

        public void setYear(int year){
            this.year = year;
        }
}
