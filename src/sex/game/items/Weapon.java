package sex.game.items;

public class Weapon extends Item
{
    private final int physicalMin, physicalMax;
    private final int magicalMin, magicalMax;

    public Weapon(String name, int physicalMin, int physicalMax, int magicalMin, int magicalMax)
    {
        super(name);
        this.physicalMin = physicalMin;
        this.physicalMax = physicalMax;
        this.magicalMin = magicalMin;
        this.magicalMax = magicalMax;
    }

    public int attackPhysicalMin()
    {
        return physicalMin;
    }

    public int attackPhysicalMax()
    {
        return physicalMax;
    }

    public int attackMagicalMin()
    {
        return magicalMin;
    }

    public int attackMagicalMax()
    {
        return magicalMax;
    }

 }
