public class App {
    public static void main(String[] args) throws Exception {

        Person me = new Person();
        //System.out.println(me.name);

        // get method
        me.setName("Niel");

        System.out.println(me.getName());

        Son myself = new Son();

        System.out.println(myself.surname);

        myself.showSurname();
    }
}
