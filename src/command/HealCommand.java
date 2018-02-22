package command;

import Unit.Unit;
import command.Interface.Command;
import command.Interface.UnitCommands;

public class HealCommand implements Command {
    private UnitCommands object;
    private Unit target;

    public HealCommand(UnitCommands o, Unit t){
        object = o;
        target = t;
    }

    @Override
    public void execute() {
        object.heal(target);
    }
}
