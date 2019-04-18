package sex.game.items.consumables.effective.effects;

import sex.game.Player;
import sex.game.Stats;

public class StatsEffect extends Effect {
    private final Stats effectStats;

    public StatsEffect(String name, int maxDuration, Stats effectStats) {
        super(name, maxDuration);
        this.effectStats=effectStats;
    }

    @Override
    public Stats additionalStats() {
        return effectStats;
    }

    @Override
    public void effectStart(Player player) {
    }

    @Override
    public void effectEnd(Player player) {
    }
}
