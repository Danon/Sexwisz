package sex.ui.console;

import sex.control.Move;
import sex.control.CommandListener;
import sex.control.GameListener;

public class CommandParser
{
    private final CommandListener commandListener;
    private final GameListener gameListener;

    public CommandParser(CommandListener commandListener, GameListener gameListener)
    {
        this.commandListener = commandListener;
        this.gameListener = gameListener;
    }

    public void parse(String command)
    {
        parseIgnoringCase(command.toLowerCase());
    }

    private void parseIgnoringCase(String command)
    {
        if (command.equals("exit"))
        {
            gameListener.finishGame();
            return;
        }
        if (command.equals("help"))
        {
            System.out.println(commandListener.showHelp());
            return;
        }
        if (command.equals("equipment"))
        {
            System.out.println(commandListener.showEquipment());
            return;
        }

        parseManyMovesAtOnce(command);
    }

    private void parseManyMovesAtOnce(String command)
    {
        for (int i = 0; i < command.length(); i++)
        {
            char key = command.charAt(i);
            parseMove(key);
        }
    }

    private void parseMove(char key)
    {
        if (key == 'w')
        {
            gameListener.movePlayer(Move.UP);
        }
        if (key == 's')
        {
            gameListener.movePlayer(Move.DOWN);
        }
        if (key == 'd')
        {
            gameListener.movePlayer(Move.RIGHT);
        }
        if (key == 'a')
        {
            gameListener.movePlayer(Move.LEFT);
        }
    }
}
