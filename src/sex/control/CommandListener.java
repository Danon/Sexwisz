package sex.control;

import sex.ui.console.render.ItemsRenderer;

public class CommandListener
{
    private final ItemsRenderer itemsRenderer;

    CommandListener(ItemsRenderer itemsRenderer)
    {
        this.itemsRenderer = itemsRenderer;
    }

    public void showHelp()
    {
        System.out.println("'help'    - Pokaż pomoc");
        System.out.println("'eq'      - Wyświetl ekwipunek");
        System.out.println("'w/s/a/d' - Ruch gracza (można wpisać na raz np. 'wwwww' - 5 razy w górę");
        System.out.println("'exit'    - Wyjście");
    }

    public void showEquipment()
    {
        itemsRenderer.render();
    }
}
