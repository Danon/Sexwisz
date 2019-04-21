package sex.control;

import sex.ui.console.render.EquipmentRenderer;

public class CommandListener
{
    private final EquipmentRenderer equipmentRenderer;

    CommandListener(EquipmentRenderer equipmentRenderer)
    {
        this.equipmentRenderer = equipmentRenderer;
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
        equipmentRenderer.render();
    }

    public void movePlayer(Move move)
    {
        System.out.println("Moving player: " + move);
    }
}
