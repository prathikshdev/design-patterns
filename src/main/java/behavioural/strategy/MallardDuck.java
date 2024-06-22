package behavioural.strategy;

public class MallardDuck extends Duck{

    public MallardDuck() {
        super(new FlyWithWings(),new Quack());
    }

    @Override
    public void displayName() {
        System.out.println("I'm Mallard Duck!");
    }
}
