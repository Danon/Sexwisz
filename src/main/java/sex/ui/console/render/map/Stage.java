package sex.ui.console.render.map;

import static sex.ui.console.render.map.DimensionalArray.twoDimensionalArray;

public class Stage
{
    private final int width, height;
    public final char[][] mapStage;

    public Stage(int width, int height)
    {
        this.width = width;
        this.height = height;
        this.mapStage = twoDimensionalArray(width, height);
    }

    void clear()
    {
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                mapStage[x][y] = 0;
            }
        }
    }

    void put(int x, int y, char character)
    {
        mapStage[x][y] = character;
    }

    public String render()
    {
        String result = "";

        for (int y = 0; y < height; y++)
        {
            for (int x = 0; x < width; x++)
            {
                char character = mapStage[x][y];
                if (character == 0)
                {
                    result += ' ';
                }
                else
                {
                    result += character;
                }
            }
            result += '\n';
        }
        return result;
    }
}
