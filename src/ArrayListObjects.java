import java.util.ArrayList;


public class ArrayListObjects {
    public static void main(String[] args) {
        System.out.println("Hello World");
        new ArrayListObjects();

    }

    ArrayList<Shoe> shoes = new ArrayList<Shoe>();
    public ArrayListObjects(){
        System.out.println("Array Lists with objects :)");
        System.out.println(shoes.size());

        shoes.add(0, new Shoe(11));
        Shoe puma = new Shoe(11);
        puma.setHasLaces(false);
        shoes.add(puma);


    }
}
