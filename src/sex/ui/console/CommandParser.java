package sex.ui.console;

import sex.control.Move;
import sex.control.CommandListener;
import sex.control.EndGameListener;

public class CommandParser
{
    private final CommandListener commands;
    private final EndGameListener endGameListener;

    public CommandParser(CommandListener commandListener, EndGameListener endGameListener)
    {
        this.commands = commandListener;
        this.endGameListener = endGameListener;
    }

    public void parse(String command)
    {
        parseIgnoringCase(command.toLowerCase());
    }

    private void parseIgnoringCase(String command)
    {
        if (command.equals("exit"))
        {
            endGameListener.finishGame();
            return;
        }
        if (command.equals("help"))
        {
            commands.showHelp();
            return;
        }
        if (command.equals("equipment"))
        {
            commands.showEquipment();
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
            commands.movePlayer(Move.UP);
        }
        if (key == 's')
        {
            commands.movePlayer(Move.DOWN);
        }
        if (key == 'a')
        {
            commands.movePlayer(Move.RIGHT);
        }
        if (key == 'a')
        {
            commands.movePlayer(Move.LEFT);
        }
    }
}
