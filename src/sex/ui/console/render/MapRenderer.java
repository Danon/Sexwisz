package sex.ui.console.render;

import sex.game.Board;
import sex.game.Player;

public class MapRenderer {
    private static final int VIEWPORT_WIDTH = 50;
    private static final int VIEWPORT_HEIGHT = 15;

    private final Player player;
    private final Board map;

    public MapRenderer(Board map, Player player) {
        this.player = player;
        this.map = map;
    }

    public String render() {
        String map = "";

        for (int i = 0; i < VIEWPORT_HEIGHT; i++) {
            for (int j = 0; j < VIEWPORT_WIDTH; j++) {
                map += " ";
            }
            map += "\n";
        }

        map += String.format("Player position: (%d, %d)", player.getX(), player.getY());

        return map;
    }
}
