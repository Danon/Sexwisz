package sex.ui.console.render.map;

class DimensionalArray
{
    static char[][] twoDimensionalArray(int width, int height)
    {
        char[][] map = new char[width][];
        for (int i = 0; i < width; i++)
        {
            map[i] = new char[height];
        }
        return map;
    }
}
