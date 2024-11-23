package Praktikum.Tugas;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1 -> health += health * 0.1;
            case 2 -> health += health * 0.3;
            case 3 -> health += health * 0.4;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 0.02;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + super.getZombieInfo();
    }
}
