package commandHierarchy.units;

public class Goal {
    private String actionName;
    private String target;

    public Goal(String actionName, String target){
        this.actionName =actionName;
        this.target = target;
    }

    public String getActionName() {
        return actionName;
    }
    public String getTarget(){
        return target;
    }
}
