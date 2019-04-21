package sex.game.items.consumables;

import sex.game.Player;
import sex.game.effects.Effect;

import java.util.List;

public abstract class EffectiveConsumable extends Consumable {
    EffectiveConsumable(String name) {
        super(name);
    }

    public abstract List<Effect> getEffects();

    @Override
    public void eat(Player player) {
        getEffects().forEach(player::addEffect);
    }
}
