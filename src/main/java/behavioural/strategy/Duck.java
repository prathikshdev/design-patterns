package behavioural.strategy;

public abstract class Duck {
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly(){
        System.out.println(flyBehaviour.fly());
    }

    public void performQuack(){
        System.out.println(quackBehaviour.Quack());
    }

    public abstract void displayName();
}
