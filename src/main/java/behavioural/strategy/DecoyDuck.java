package behavioural.strategy;

public class DecoyDuck extends Duck{


    public DecoyDuck() {
        super(new NoFly(), new Quack());
    }

    @Override
    public void displayName() {
        System.out.println("I'm a toy Duck!");
    }
}
