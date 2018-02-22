package command;

import Unit.Unit;
import command.Interface.Command;
import command.Interface.IsAUnit;

public class AttackCommand implements Command {

    private IsAUnit object;
    private Unit Target;


    public AttackCommand(IsAUnit o, Unit p){
        object = o;
        Target = p;
    }

    @Override
    public void execute() {
        object.attack(Target);
    }
}
