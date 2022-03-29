public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        Animal[] animals = new Animal[4];
        animals[0] = cat1;
        animals[1] = cat2;
        animals[2] = dog1;
        animals[3] = dog2;

        for (int i = 0; i < 4; i++) {
            animals[i].voice();
            animals[i].feed();
        }

    }
}

interface Animal {
    void feed();
    void voice();
}

class Dog implements Animal {

    @Override
    public void feed () {
        System.out.println("You fed the dog");
    }

    @Override
    public void voice () {
        System.out.println("Gaw Gaw Gaw");
    }
}

class Cat implements Animal {


    public void feed () {
        System.out.println("You fed the cat");
    }


    public void voice () {
        System.out.println("Meow Meow Meow");
    }
}
