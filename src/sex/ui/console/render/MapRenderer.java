package sex.ui.console.render;

import sex.game.Board;
import sex.game.Player;

public class MapRenderer
{
    private static final int VIEWPORT_WIDTH = 50;
    private static final int VIEWPORT_HEIGHT = 15;

    private final Player player;
    private final Board map;

    public MapRenderer(Board map, Player player)
    {
        this.player = player;
        this.map = map;
    }

    public String render()
    {
        String map = "";

        for (int row = 0; row < VIEWPORT_HEIGHT; row++)
        {
            if (row == 0)
            {
                map += "┌-----------------------┐\n";
            }
            else if (row != VIEWPORT_HEIGHT - 1)
            {
                map += "│                       │\n";
            }
            else
            {
                map += "└-----------------------┘\n";
            }
        }

        map += String.format("Player position: (%d, %d)", player.getX(), player.getY());

        return map;
    }
}
