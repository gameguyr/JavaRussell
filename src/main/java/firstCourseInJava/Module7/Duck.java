package firstCourseInJava.Module7;

public class Duck extends Animal {
    Duck() {
        setCovering(FEATHER);
        setSound("Quack");
        setCanFly(true);
        setNumberOfLegs(2);
        setName("Duck");
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
