package set;

public class GC {
    public static void main(String[] args) {
        // Your code here
        Phone phone = new Phone("Iphone", "13 Pro Max");
        System.out.println(phone);
        phone = null;
        System.gc();
        System.out.println(phone);
    }
}

class Phone {
    String brand;
    String model;
    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    
}