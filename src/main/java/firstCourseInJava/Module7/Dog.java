package firstCourseInJava.Module7;

public class Dog extends Animal {
    Dog() {
        setCovering(FUR);
        setSound("Woof");
        setCanFly(false);
        setNumberOfLegs(4);
        setName("Dog");
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
