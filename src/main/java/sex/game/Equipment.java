package sex.game;

import sex.game.items.Item;

import java.util.List;

public class Equipment
{
    private int gold;
    private final List<Item> items;

    public Equipment(int gold, List<Item> items)
    {
        this.items = items;
        this.gold = gold;
    }

    public int gold()
    {
        return gold;
    }

    public void pay(int price)
    {
        this.gold -= price;
    }

    public void earn(int income)
    {
        this.gold += income;
    }

    public List<Item> items()
    {
        return items;
    }
}
