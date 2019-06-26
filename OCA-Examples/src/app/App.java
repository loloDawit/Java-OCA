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
    }
}