package sex.control;

import sex.ui.console.render.EquipmentRenderer;

public class CommandListener {
    private final EquipmentRenderer equipmentRenderer;

    CommandListener(EquipmentRenderer equipmentRenderer) {
        this.equipmentRenderer = equipmentRenderer;
    }

    public void showHelp() {
        System.out.println("Showing help");
    }

    public void showEquipment() {
        equipmentRenderer.render();
    }

    public void movePlayer(Move move) {
        System.out.println("Moving player: " + move);
    }
}
