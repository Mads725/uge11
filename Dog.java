import java.util.ArrayList;

public class Dog {

    private String name;
    private Owner owner;
    private boolean isHungry;
    private ArrayList<Dog> offSpring;

    public Dog(String name, boolean hungry){
        this.name = name;
        this.isHungry = hungry;
        offSpring = new ArrayList<Dog>();
    }

    public void feedDog() {
        if (isHungry == true) {
            System.out.println("Feeding " + name);
            isHungry = false;
        } else {
            System.out.println("The dog is not hungry");
        }
    }

    public void setOffSpring(Dog offSpringAdd) {
        offSpring.add(offSpringAdd);

    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void getOffSpring() {
        for(Dog d : offSpring) {
            System.out.println(d);
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
