package sex.ui.console.render;

import sex.game.Equipment;

public class ItemsRenderer
{
    private final Equipment equipment;

    public ItemsRenderer(Equipment equipment)
    {
        this.equipment = equipment;
    }

    public String renderGold()
    {
        // TODO Kaczor
        // Przerób tak żeby faktycznie wyświetlało prawidziwą ilość złota
        // Już jest napisany pod to test
        return "Złoto: 9";
    }

    public String renderItems()
    {
        // TODO Kaczor
        // Przerób tak żeby faktycznie wyświetlało prawdziwy ekwipunek
        // Już jest napisany pod to test
        return " - Laska\n" +
                " - Chlyp\n";
    }
}
