package commandHierarchy.units;



public interface Action {

    // will start the Action with a new target
    public abstract boolean setTarget(String target);

    public abstract void update();

    public abstract boolean isDone();
}
