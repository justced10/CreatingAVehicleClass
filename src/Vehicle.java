public class Vehicle {

    // Instance fields

    private String make;

    private String model;



    // Constructor

    public Vehicle(String make, String model) {

        this.make = make;

        this.model = model;

    }



    // Getter for make

    public String getMake() {

        return make;

    }



    // Setter for make

    public void setMake(String make) {

        this.make = make;

    }



    // Getter for model

    public String getModel() {

        return model;

    }



    // Setter for model

    public void setModel(String model) {

        this.model = model;

    }



    // Main method for testing

    public static void main(String[] args) {

        // Create a Vehicle object

        Vehicle myVehicle = new Vehicle("Toyota", "Corolla");



        // Print make and model using getters

        System.out.println("Make: " + myVehicle.getMake());  // Output: Toyota

        System.out.println("Model: " + myVehicle.getModel()); // Output: Corolla



        // Modify make and model using setters

        myVehicle.setMake("Honda");

        myVehicle.setModel("Civic");



        // Print updated make and model using getters

        System.out.println("Updated Make: " + myVehicle.getMake());  // Output: Honda

        System.out.println("Updated Model: " + myVehicle.getModel()); // Output: Civic

    }

}