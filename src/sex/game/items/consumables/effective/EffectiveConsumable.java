package sex.game.items.consumables.effective;

import sex.game.Player;
import sex.game.items.consumables.Consumable;
import sex.game.items.consumables.effective.effects.Effect;

import java.util.List;

public abstract class EffectiveConsumable extends Consumable {
    EffectiveConsumable(String name) {
        super(name);
    }

    public abstract List<Effect> getEffects();

    @Override
    public void eat(Player player) {
        getEffects().forEach(player::getEffect);
    }
}
