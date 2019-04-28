package sex.ui.console.render;

import sex.game.Equipment;


public class ItemsRenderer
{
    private final Equipment equipment;

    public ItemsRenderer(Equipment equipment)
    {
        this.equipment = equipment;
    }

    public String renderGold()
    {
        int goldCount = equipment.gold();
        return "Złoto: " + goldCount;
    }

    public String renderItems()
    {
        /*
        List<Item> itemsList = equipment.items();
        String water = "";
        if(itemsList<Water>)
        {
            Water waterCount = new Water();
            return water += waterCount;
        } */
    }
}
