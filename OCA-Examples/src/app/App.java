package app;

public class App {
    public static void main(String[] args) throws Exception {
        Array array = new Array(100);
        array.insert(10);
        array.insert(2);
        array.insert(4);
        array.insert(21);
        array.display();
        array.bSort();
        int key = 21;
        if (array.find(key) != array.size()) {
            System.out.println("Found " + key);
        } else {
            System.out.println("Opps...");
        }
        ArrayPerson person = new ArrayPerson(100);
        person.insert("Dawit", "Abera", 21);
        person.insert("Henok", "Girma", 30);
        person.display();
        String search = "Henok";
        Person found;
        found = person.find(search);
        if (found != null) {
            System.out.print("Found ");
            found.displayPerson();
        } else {
            System.out.println("Can't find " + search);
        }

    }
}