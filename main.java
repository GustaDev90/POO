//Classe principal
class Dog {
    String name;
    int age;
    double weight;

    public Dog (String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void displayDog () {
        System.out.println("Dog name: " + name);
        System.out.println("Dog age: " + age);
        System.out.println("Dog weight: " + weight);
    }
}

//Classe de herança
class Cat extends Dog {
    public Cat (String name, int age, double weight) {
        super(name, age, weight);
    }

    public void displayCat() {
        System.out.println("Cat name: " + name);
        System.out.println("Cat age: " + age);
        System.out.println("Cat weight: " + weight);

    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Tico", 12, 14.4);
        Cat myCat = new Cat("John", 4, 8.2);
        myDog.displayDog();

        System.out.println("--------------------------");

        myCat.displayCat();
    }
}
