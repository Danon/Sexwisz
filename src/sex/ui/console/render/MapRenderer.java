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
                map += renderBorders(row, column);
            }
            map += "\n";
        }


        map += String.format("Player position: (%d, %d)", player.getX(), player.getY());

        return map;
    }

    private char renderBorders(int row, int column)
    {
        if (row == 0)
        {
            if (column == 0)
            {
                return '┌';
            }
            if (column < VIEWPORT_WIDTH - 1)
            {
                return '-';
            }
            return '┐';
        }

        if (row < VIEWPORT_HEIGHT - 1)
        {
            if (column == 0 || column == VIEWPORT_WIDTH - 1)
            {
                return '│';
            }
        }

        if (row == VIEWPORT_HEIGHT - 1)
        {
            if (column == 0)
            {
                return '└';
            }
            if (column < VIEWPORT_WIDTH - 1)
            {
                return '-';
            }
            return '┘';
        }

        if (row == player.getY() && column == player.getX())
        {
            return '@';
        }

        return ' ';
    }
}
