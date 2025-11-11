package Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (health * 0.1); 
                break;
            case 2:
                health += (int) (health * 0.3); 
                break;
            case 3:
                health += (int) (health * 0.4); 
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= (int) (health * 0.2);
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\nHealth = " + health + "\nLevel = " + level;
    }
}