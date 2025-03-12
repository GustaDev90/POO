class Dog {
    String name;
    String color;

    public Dog (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void displayDog () {
        System.out.println("Dog name: " + name + "Dog color: " + color);
    }
}


public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tico", "Brown");
        myDog.displayDog();
    }
}
