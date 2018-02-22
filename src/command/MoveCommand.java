package command;

import command.Interface.Command;
import command.Interface.IsAUnit;

import java.awt.geom.Point2D;

public class MoveCommand implements Command {

    private IsAUnit object;
    private Point2D location;

    public MoveCommand(IsAUnit o, Point2D p){
        object = o;
        location = p;
    }

    @Override
    public void execute() {
        object.moveTo(location);
    }
}
