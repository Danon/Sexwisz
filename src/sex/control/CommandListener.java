package sex.control;

import sex.ui.console.render.EquipmentRenderer;

public class CommandListener {
    private final EquipmentRenderer equipmentRenderer;

    CommandListener(EquipmentRenderer equipmentRenderer) {
        this.equipmentRenderer = equipmentRenderer;
    }

    public void showHelp() {
        System.out.println("'eq' - ekwipunek");
        System.out.println("'exit' - wyjście");
        System.out.println("'help' - pomoc");
        System.out.println("'w/s/a/d' - ruch");

    }

    public void showEquipment() {
        equipmentRenderer.render();
    }

    public void movePlayer(Move move) {
        System.out.println("Moving player: " + move);
    }
}
