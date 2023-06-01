package firstCourseInJava.Module7;

public class FlyingFish extends Animal {
    FlyingFish() {
        setCovering(SCALE);
        setSound("Blub");
        setCanFly(true);
        setName("Flying Fish");
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
