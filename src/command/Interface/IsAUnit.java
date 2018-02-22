package command.Interface;

import Unit.Unit;

import java.awt.geom.Point2D;

public interface IsAUnit {

    public void heal(Unit Target);

    public void attack(Unit target);

    public void moveTo(Point2D location);
}
