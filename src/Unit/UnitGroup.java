package Unit;

import commandHierarchy.units.Goal;
import commandHierarchy.units.SetsGoal;
import utils.Area;

import java.util.ArrayList;

public abstract class UnitGroup implements SetsGoal{

    ArrayList<Unit> units;

    public UnitGroup(Area area){
        units = getUnitsInArea(area);
    }

    @Override
    public boolean setGoal(Goal g){
        if(units.isEmpty()){
            return false;
        }

        for(int i =0; i < units.size(); i++){
            units.get(i).setGoal(g);
        }

        return true;
    }

    public void update(){

    }

    protected abstract ArrayList<Unit> getUnitsInArea(Area area);
}
