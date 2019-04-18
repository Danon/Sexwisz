package sex.game.items.consumables.effective.effects;

import sex.game.Player;
import sex.game.Stats;

public abstract class Effect {
    private final String name;
    private final int maxDuration;
    private int remainingTime;

    Effect(String name, int maxDuration) {
        this.name = name;
        this.maxDuration = maxDuration;
        this.remainingTime = maxDuration;
    }

    public String getName() {
        return name;
    }

    public int getMaxDuration() {
        return maxDuration;
    }

    public int getRemainingTime() {
        return remainingTime;
    }

    public void tickDown() {
        this.remainingTime -= 1;
    }

    public Stats additionalStats() {
        return new Stats(0, 0, 0);
    }

    public void effectStart(Player player) {
    }

    public void effectContinuous(Player player) {
    }

    public void effectEnd(Player player) {
    }
}
