package Unit;

import commandHierarchy.units.Action;
import commandHierarchy.units.Goal;

import java.util.HashMap;

public abstract class Unit {

    HashMap<String,Action> actionsSet;

    Action activeAction;

    public Unit(HashMap<String,Action> actionsSet){
        this.actionsSet = actionsSet;
    }

    public boolean setGoal(Goal g){

        if(!actionsSet.containsKey(g.getActionName())){
            return false;
        }

        activeAction = actionsSet.get(g.getActionName());
        activeAction.setTarget(g.getTarget());

        return true;
    }

    public void update(){
        activeAction.update();

        if(activeAction.isDone()){
            this.findNewGoal();
        }
    }

    protected abstract void findNewGoal();
}
