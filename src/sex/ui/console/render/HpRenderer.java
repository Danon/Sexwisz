package sex.ui.console.render;
import java.lang.IllegalArgumentException;

public class HpRenderer
{
    public String render(int actual, int max)
    {
        String CurrentHP = "|";
        for (int x = 0; x < actual; x++)
        {
            CurrentHP += "X";
        }


        if (actual < max)
        {
            int actMaxDiff = max - actual;
            for (int z = 0; z < actMaxDiff; z++)
            {
                CurrentHP += "-";
            }
        }

        if (actual < 0 || max < 0 || actual > max )
        {
            throw new IllegalArgumentException();
        }

        return CurrentHP + "|";
    }
}