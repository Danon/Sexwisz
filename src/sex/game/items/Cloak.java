package sex.game.items;

public class Cloak extends Item
{
    private final int magicResist;

    public Cloak(String name, int magicResist)
    {
        super(name);
        this.magicResist = magicResist;
    }
}
