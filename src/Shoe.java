public class Shoe {
    private String brand;
    private int size;
    private boolean hasLaces;

    public Shoe(int pSize) {

        size = pSize;
        brand = "Nike";
        hasLaces = false;

        print();

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


    public boolean getHasLaces() {
        return hasLaces;
    }

    public void setHasLaces(boolean hasLaces) {
        this.hasLaces = hasLaces;
    }

    public void print(){
        System.out.println("Brand:" + brand + "Size:" + size + "Laces?" + hasLaces );

    }




}
