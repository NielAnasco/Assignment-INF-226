public class App {
    public static void main(String[] args) throws Exception {
        
        // item in form of a rice
        GroceryItem item1 = new Rice();
        item1.name = "Sinandomeng";
        item1.showItemName();
        item1.price = 53;

        // item in form of a junkfood
        GroceryItem item2 = new Junkfood();
        item2.name = "Potato Chips";
        item2.showItemName();
        item2.price = 15;
        
        // Cashier object
        Cashier c1 = new Cashier();
       
        // Polymorphic Argument
        c1.checkOut(item1);
        c1.checkOut(item2);

        c1.showItemPrice(item1);
        c1.showItemPrice(item2);

        GroceryItem[] itemArray = new GroceryItem[2];
        itemArray[0] = item1;
        itemArray[1] = item2;
       
        double totalAmount = 0.00;
        
        for(int i = 0; i < itemArray.length; i++) {
           itemArray[i].showItemName();
           System.out.println(itemArray[i].price);

           totalAmount += itemArray[i].price;

        }
       
        System.out.println("The total amount of you bought item is: " + totalAmount + " PHP");

        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        
        Capybara myCapybara = new Capybara();
        myCapybara.walk();
        myCapybara.run();
        myCapybara.jump();
        myCapybara.swim();
    }
}
