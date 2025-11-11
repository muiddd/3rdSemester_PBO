public class PatrolRobot extends Robot {
    public Battery RobotBattery;

    public PatrolRobot (String Name, int cpuspeed, int power, Battery battery){
        this.Name = "PATROL " + Name;
        this.CPUSpeed = cpuspeed;
        this.Power = power;
        this.RobotBattery = battery;
    }

    public void increasePower(){
        Power  += 20;
    }
}
