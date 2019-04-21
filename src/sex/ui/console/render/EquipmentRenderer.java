package sex.ui.console.render;

import sex.game.Equipment;

public class EquipmentRenderer {
    private final Equipment equipment;

    public EquipmentRenderer(Equipment equipment) {
        this.equipment = equipment;
    }

    public String render() {
        // TODO Kaczor
        // Przerób tak żeby faktycznie wyświetlało prawdziwy ekwipunek
        return "Your equipment is:\n" +
                "  - Laska\n" +
                "  - Chlyp\n";
    }
}
