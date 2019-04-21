package sex.game.items.consumables;

import sex.game.effects.Effect;
import sex.game.effects.ExperienceGainingEffect;

import java.util.List;

import static java.util.Collections.singletonList;

public class LearningPotion extends EffectiveConsumable
{
    private final int duration;

    public LearningPotion(int duration)
    {
        super("Napój uczący");
        this.duration = duration;
    }

    public List<Effect> getEffects()
    {
        return singletonList(new ExperienceGainingEffect(duration));
    }
}
