package sex.game.items.consumables.effective;

import sex.game.Stats;
import sex.game.items.consumables.effective.effects.Effect;
import sex.game.items.consumables.effective.effects.StatsEffect;

import java.util.List;

import static java.util.Collections.singletonList;

public class Elixir extends EffectiveConsumable {
    private final Stats stats;
    private final int duration;

    public Elixir(String name, int duration, Stats stats) {
        super(name);
        this.duration = duration;
        this.stats = stats;
    }

    public List<Effect> getEffects() {
        return singletonList(
                new StatsEffect("Efekt: " + getName(), duration, stats)
        );
    }
}
