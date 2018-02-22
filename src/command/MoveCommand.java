package command;

import command.Interface.Command;
import command.Interface.UnitCommands;

import java.awt.geom.Point2D;

public class MoveCommand implements Command {

    private UnitCommands object;
    private Point2D location;

    public MoveCommand(UnitCommands o, Point2D p){
        object = o;
        location = p;
    }

    @Override
    public void execute() {
        object.moveTo(location);
    }
}
