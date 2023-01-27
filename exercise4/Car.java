public class Car {
    String model;
    String name;
    Person owner;

    Car(String carName, String carModel, Person ownerName) {
        this.model = carModel;
        this.name = carName;
        this.owner = ownerName;
    }

        void showOwner() {
           System.out.println("My car name is " + this.name + " and the model of my car is " + this.model + ", The owner name of this car is " + owner.name);
        }   
}
