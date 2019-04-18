package sex.ui.console.render;

import sex.game.Equipment;

public class EquipmentRenderer {
    private final Equipment equipment;

    public EquipmentRenderer(Equipment equipment) {
        this.equipment = equipment;
    }

    public String render() {
        return "Your equipment is:\n" +
                "  - Laska\n" +
                "  - Chlyp\n";
    }
}
