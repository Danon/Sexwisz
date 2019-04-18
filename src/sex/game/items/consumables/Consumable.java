package sex.game.items.consumables;

import sex.game.Player;
import sex.game.items.Item;

public abstract class Consumable extends Item {
    protected Consumable(String name) {
        super(name);
    }

    public abstract void eat(Player player);
}
