package sex.game;

public class Stats
{
    public final int armor, attack, speed;

    public Stats(int armor, int attack, int speed)
    {
        this.armor = armor;
        this.attack = attack;
        this.speed = speed;
    }

    public Stats join(Stats stats)
    {
        return new Stats(
                this.armor + stats.armor,
                this.attack + stats.attack,
                this.speed + stats.speed
        );
    }
}
