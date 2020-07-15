package sex.ui.console.render;

public class HpRenderer
{
    public String render(int actual, int max)
    {
        if (actual < 0 || max < 0 || actual > max)
        {
            throw new IllegalArgumentException();
        }
        return renderHp(actual, max);
    }

    private String renderHp(int actual, int max)
    {
        String result = "|";
        for (int i = 0; i < max; i++)
        {
            result += i < actual ? "X" : "-";
        }
        return result + "|";
    }
}
