public class Main {
    public static void main(String[] args) {
        flower[]bucket = new flower[3];
        bucket[0] = new rose(23,"white");
        bucket[1] = new pions(30,"pink");
        bucket[2] = new tulpan(20,"yellow");
    }
}
abstract class flower{
    protected int price;
    protected String color;

    public flower(int price,String color){
        this.color = color;
        this.price=price;
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class rose extends flower{
    public rose(int price,String color){
        super(price,color);
    }
}

class romashka extends flower{
    public romashka(int price,String color){
        super(price,color);
    }
}

class pions extends flower{
    public pions(int price,String color){
        super(price,color);
    }
}
class tulpan extends  flower{
    public tulpan(int price ,String color){
        super(price,color);
    }
}






























//class Person {
//    private String name;
//
//    public Person(String name){
//        System.out.println("Const 1");
//        this.name = name;
//    }
//
//    public Person(){
//        System.out.println("Hello");
//    }
//
//    public void sayHello(){
//        System.out.println("Hello");
//    }
//
//}
//
//class Developer extends Person{
//
//}
