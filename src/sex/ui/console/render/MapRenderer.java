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
            for (int column = 0; column < VIEWPORT_WIDTH; column++)
            {
                map += renderPosition(row, column);
            }
            map += "\n";
        }

        map += String.format("Player position: (%d, %d)", player.getX(), player.getY());

        return map;
    }

    private char renderPosition(int row, int column)
    {
        if (row == 0 && column == 0)
        {
            return '┌';
        }
        else if (row == 0 && column < VIEWPORT_WIDTH - 1)
        {
            return '-';
        }
        else if (row == 0)
        {
            return '┐';
        }
        else if (row < VIEWPORT_HEIGHT - 1 && column == 0)
        {
            return '│';
        }
        else if (row < VIEWPORT_HEIGHT - 1 && column == VIEWPORT_WIDTH - 1)
        {
            return '│';
        }
        else if (row == VIEWPORT_HEIGHT - 1 && column == 0)
        {
            return '└';
        }
        else if (row == VIEWPORT_HEIGHT - 1 && column < VIEWPORT_WIDTH - 1)
        {
            return '-';
        }
        else if (row == VIEWPORT_HEIGHT - 1)
        {
            return '┘';
        }
        else
        {
            return ' ';
        }
    }
}
