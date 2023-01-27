public class App {
    public static void main(String[] args) throws Exception {
    System.out.println("Hello, World!");

    Person Me = new Person("Niel", 18);
    Person Friend = new Person("KB", 20);

    Me.addFriend(Friend);
    
    Pet Dog = new Pet("Carter", 6, Me);
    Dog.showOwner();

    Person Classmate = new Person("Anna", 19);
    
    Person Classmate1 = new Person("Mika", 19);
      
    Person Classmate2 = new Person("Aica", 19);

    Person Classmate3 = new Person("Erica", 19);
    
    Me.addClassmate(Classmate);
    Me.addClassmate(Classmate1);
    Me.addClassmate(Classmate2);
    Me.addClassmate(Classmate3);

    Car Dodge = new Car("Bop", "1970 Dodge Charger R/T", Me);
    Dodge.showOwner();

    }  
}
