package sex.game.items.consumables.food;

import sex.game.Player;
import sex.game.items.consumables.Consumable;

public abstract class Food extends Consumable
{
    private final int healing;

    Food(String name, int healing)
    {
        super(name);
        this.healing = healing;
    }

    @Override
    public void eat(Player player)
    {
        player.healOrDamage(healing);
    }
}
