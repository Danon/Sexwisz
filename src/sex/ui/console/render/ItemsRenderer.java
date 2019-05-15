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
        String equipmentItems = "";
        for(int x = 0; x < items.size(); x++)
        {
            Item item = items.get(x);
            if (item instanceof Weapon)
            {
                equipmentItems += renderWeapon((Weapon) item);
            }
            if (item instanceof Food)
            {
                equipmentItems += renderFood((Food) item);
            }
        }
        return equipmentItems;
    }

    private String renderWeapon(Weapon weapon)
    {
        if (weapon.attackPhysicalMax() == 0 && weapon.attackMagicalMax() == 0)
        {
            return " - Broń: " + weapon.getName() + " (useless)\n";
        }
        if (weapon.attackPhysicalMax() == 0)
        {
            return " - Broń: " + weapon.getName() + " (" + weapon.attackMagicalMin() + "-" + weapon.attackMagicalMax() + " magicznych)\n";
        }
        if (weapon.attackMagicalMax() == 0)
        {
            return " - Broń: " + weapon.getName() + " (" + weapon.attackPhysicalMin() + "-" + weapon.attackPhysicalMax() + " fizycznych)\n";
        }
        return " - Broń: " + weapon.getName() + " (" + weapon.attackPhysicalMin() + "-" + weapon.attackPhysicalMax() + " fizycznych, " + weapon.attackMagicalMin() + "-" + weapon.attackMagicalMax() + " magicznych)\n";
    }

    private String renderFood(Food item)
    {
        return " - " + item.getName() + " (+" + item.healing() + " hp)\n";
    }
}
