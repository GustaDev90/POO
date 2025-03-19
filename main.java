class Dog {
    String name;

    public Dog (String name) {
        this.name = name;
    }

    public void displayDog () {
        System.out.println("Dog name: " + name);
    }
}

class Cat extends Dog {
    public Cat (String name) {
        super(name);
    }

    public void displayCat() {
        System.out.println("I have a cat to! his name is " + name);
    }
}


public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tico");
        Cat myCat = new Cat("John");
        myDog.displayDog();
        myCat.displayCat();
    }
}
