package sex.game.items.consumables;

import sex.game.Stats;
import sex.game.effects.Effect;
import sex.game.effects.StatsEffect;

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
