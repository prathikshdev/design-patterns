package behavioural.strategy;

public class NoFly implements FlyBehaviour{
    @Override
    public String fly() {
        return "I Can't Fly!";
    }
}
