package firstCourseInJava.Module7;

public class Cat extends Animal {
    Cat() {
        setCovering(FUR);
        setSound("Meow");
        setCanFly(false);
        setNumberOfLegs(4);
        setName("Cat");
    }

    @Override
    String getCovering() {
        System.out.println("A " + name + " is covered in: " + covering);
        return covering;
    }

    @Override
    void makeSound() {
        System.out.println("A " + name + " goes: " + getSound());
    }

    @Override
    boolean canFly() {
        System.out.println("Can a " + name + " fly? : " + isCanFly());
        return isCanFly();
    }

}
