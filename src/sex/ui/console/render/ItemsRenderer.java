package sex.ui.console.render;

import sex.game.Equipment;
import sex.game.items.Item;
import sex.game.items.Weapon;
import sex.game.items.consumables.food.Food;

import java.util.List;

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
        List<Item> items = equipment.items();
        Item item = items.get(0);
        if (item instanceof Weapon)
        {
            Weapon weapon = (Weapon) item;
            if (weapon.attackPhysicalMax() == 0 && weapon.attackMagicalMax() == 0)
            {
                return " - Broń: " + item.getName() + " (useless)\n";
            }
            if (weapon.attackPhysicalMax() == 0)
            {
                return " - Broń: " + item.getName() + " (" + weapon.attackMagicalMin() + "-" + weapon.attackMagicalMax() + " magicznych)\n";
            }
            if (weapon.attackMagicalMax() == 0)
            {
                return " - Broń: " + item.getName() + " (" + weapon.attackPhysicalMin() + "-" + weapon.attackPhysicalMax() + " fizycznych)\n";
            }
            return " - Broń: " + item.getName() + " (" + weapon.attackPhysicalMin() + "-" + weapon.attackPhysicalMax() + " fizycznych, " + weapon.attackMagicalMin() + "-" + weapon.attackMagicalMax() + " magicznych)\n";
        }
        if (item instanceof Food)
        {
            Food food = (Food) item;
            return " - " + food.getName() + " (+" + food.healing() + " hp)\n";
        }

        return "niebroń :(";
    }
}