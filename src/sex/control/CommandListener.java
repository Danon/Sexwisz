package sex.control;

import sex.ui.console.render.ItemsRenderer;

public class CommandListener
{
    private final ItemsRenderer itemsRenderer;

    CommandListener(ItemsRenderer itemsRenderer)
    {
        this.itemsRenderer = itemsRenderer;
    }

    public String showHelp()
    {
        return "'help'    - Pokaż pomoc\n" +
                "'eq'      - Wyświetl ekwipunek\n" +
                "'w/s/a/d' - Ruch gracza (można wpisać na raz np. 'wwwww' - 5 razy w górę\n" +
                "'exit'    - Wyjście\n";
    }

    public String showEquipment()
    {
        String actualGold = itemsRenderer.renderGold();
        String actualEquipment = itemsRenderer.renderItems();
        return actualGold + "\nTwoje przedmioty:\n" + actualEquipment;
    }
}
