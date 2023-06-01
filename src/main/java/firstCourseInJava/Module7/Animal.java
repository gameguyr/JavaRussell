package firstCourseInJava.Module7;

abstract class Animal {
    String covering;
    String sound;
    boolean canFly;
    int numberOfLegs;
    String name;  //What is the best way to get the name of the class?



    public void setCovering(String covering) {
        this.covering = covering;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String FUR="fur";

    String FEATHER = "feather";

    String SCALE = "scale";

    String SHELL = "shell";

    String SKIN = "skin";



    abstract String getCovering( );

    abstract void makeSound ( );

    abstract boolean canFly( );

    int howManyLegs() {
        if (getNumberOfLegs() != 0 ) {
            System.out.println("A " + name + " has number of legs: " + getNumberOfLegs());
            return getNumberOfLegs();
        } else {
            System.out.println("A " + name + " has no legs! ");
            return 0;
        }
    }


}
