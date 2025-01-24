class Dog {
    String breed;
    int age;
    String color;

    public void printDetails() {
        System.out.println("Dog details:");
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.color);
    }
}


public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();

        obj.breed = "Golden Retriever";
        obj.age = 2;
        obj.color = "Golden";

        obj.printDetails();
    }
}