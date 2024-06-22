package behavioural.strategy;

public class Strategy {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.displayName();
        mallardDuck.performFly();
        mallardDuck.performQuack();
        DecoyDuck decoyDuck = new DecoyDuck();
        decoyDuck.displayName();
        decoyDuck.performFly();
        decoyDuck.performQuack();
    }
}
