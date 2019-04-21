package sex.game.items;

import sex.game.Player;

public abstract class Item
{
    private final String name;

    protected Item(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    void eat(Player player)
    {
        throw new ItemNotEatableException();
    }
}
