package sex.ui.console.render;

public class ProportionalHpRenderer
{
    private final int width;
    private final HpRenderer hpRenderer;

    public ProportionalHpRenderer(int width)
    {
        this.hpRenderer = new HpRenderer();
        this.width = width;

        if (width < 2)
        {
            throw new IllegalArgumentException();
        }
    }

    public String render(int actual, int max)
    {
        double ratio = Math.round((double) actual / max * width);
        return hpRenderer.render((int) ratio, width);
    }
}
