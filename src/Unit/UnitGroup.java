package Unit;

import command.Interface.UnitCommands;
import commandHierarchy.units.Goal;
import commandHierarchy.units.SetsGoal;
import utils.Area;

import java.awt.geom.Point2D;
import java.util.ArrayList;

public abstract class UnitGroup implements SetsGoal, UnitCommands{

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

    @Override
    public boolean heal(Unit Target){
  
    }

    @Override
    public boolean attack(Unit target){

    }

    @Override
    public boolean moveTo(Point2D location){

    }


    protected abstract ArrayList<Unit> getUnitsInArea(Area area);

}
