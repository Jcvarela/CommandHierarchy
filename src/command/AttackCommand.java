package command;

import Unit.Unit;
import command.Interface.Command;
import command.Interface.UnitCommands;

public class AttackCommand implements Command {

    private UnitCommands object;
    private Unit Target;


    public AttackCommand(UnitCommands o, Unit p){
        object = o;
        Target = p;
    }

    @Override
    public void execute() {
        object.attack(Target);
    }
}
