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

        if (items.size() == 0)
        {
            return "Nie masz żadnych przedmiotów w ekwipunku NOOBIE";
        }

        String equipmentItems = "";
        for (int x = 0; x < items.size(); x++)
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
        return " - " + weapon.getName() + " (" + renderWeaponStats(weapon) + ")\n";
    }

    private String renderWeaponStats(Weapon weapon)
    {
        if (weapon.attackPhysicalMax() == 0 && weapon.attackMagicalMax() == 0)
        {
            return "useless";
        }
        if (weapon.attackPhysicalMax() == 0)
        {
            return weapon.attackMagicalMin() + "-" + weapon.attackMagicalMax() + " magicznych";
        }
        if (weapon.attackMagicalMax() == 0)
        {
            return weapon.attackPhysicalMin() + "-" + weapon.attackPhysicalMax() + " fizycznych";
        }
        return weapon.attackPhysicalMin() + "-" +
                weapon.attackPhysicalMax() + " fizycznych, "
                + weapon.attackMagicalMin() + "-"
                + weapon.attackMagicalMax() + " magicznych";
    }

    private String renderFood(Food item)
    {
        return " - " + item.getName() + " (+" + item.healing() + " hp)\n";
    }
}
