package firstCourseInJava.Module7;

public class Assignment7 {

    public static void main(String[] args) {
        System.out.println("Let's see what the Duck's properties are!");
        Duck duck = new Duck();
        duck.getCovering();
        duck.makeSound();
        duck.canFly();
        duck.howManyLegs();
        System.out.println("\n");

        System.out.println("Let's see what the Cat's properties are!");
        Cat cat = new Cat();
        cat.getCovering();
        cat.makeSound();
        cat.canFly();
        cat.howManyLegs();
        System.out.println("\n");

        System.out.println("Let's see what the Dog's properties are!");
        Dog dog = new Dog();
        dog.getCovering();
        dog.makeSound();
        dog.canFly();
        dog.howManyLegs();
        System.out.println("\n");

        System.out.println("Let's see what the Fish's properties are!");
        Fish fish = new Fish();
        fish.getCovering();
        fish.makeSound();
        fish.canFly();
        fish.howManyLegs();
        System.out.println("\n");

        System.out.println("Let's see what the Flying Fish's properties are!");
        FlyingFish flyingFish = new FlyingFish();
        flyingFish.getCovering();
        flyingFish.makeSound();
        flyingFish.canFly();
        flyingFish.howManyLegs();
        System.out.println("\n");


    }
}
