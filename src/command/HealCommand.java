package command;

import Unit.Unit;
import command.Interface.Command;
import command.Interface.IsAUnit;

public class HealCommand implements Command {
    private IsAUnit object;
    private Unit target;

    public HealCommand(IsAUnit o, Unit t){
        object = o;
        target = t;
    }

    @Override
    public void execute() {
        object.heal(target);
    }
}
