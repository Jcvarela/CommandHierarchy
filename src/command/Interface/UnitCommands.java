package command.Interface;

import Unit.Unit;

import java.awt.geom.Point2D;

public interface UnitCommands {

    public boolean heal(Unit Target);

    public boolean attack(Unit target);

    public boolean moveTo(Point2D location);
}
