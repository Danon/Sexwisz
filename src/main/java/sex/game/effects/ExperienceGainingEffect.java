package sex.game.effects;

import sex.game.Player;

public class ExperienceGainingEffect extends Effect
{
    public ExperienceGainingEffect(int duration)
    {
        super("Zdobywanie doświadczenia", duration);
    }

    @Override
    public void effectContinuous(Player player)
    {
        player.gainExperience(1);
    }
}
