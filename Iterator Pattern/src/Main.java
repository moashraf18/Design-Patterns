public class Main {
    public static void main(String[] args) {

        NameCollection collection = new NameCollection();

        collection.addName("Mohamed");
        collection.addName("Sara");
        collection.addName("Omar");

        Iterator iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}