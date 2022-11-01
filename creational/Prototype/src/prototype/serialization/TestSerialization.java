package prototype.serialization;

import java.io.*;

public class TestSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Item item = new Item("item test");
        Product product = new Product("product", "10", "category A", item,5);

        FileOutputStream fileOutputStream = new FileOutputStream("Prototype/src/prototype/serialization/testfile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(product);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Prototype/src/prototype/serialization/testfile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Product deepCopy = (Product) objectInputStream.readObject();
        objectInputStream.close();

        System.out.printf(
                "First instance: %s%n" +
                "Deep copy: %s",
                product,
                deepCopy);
    }

}
