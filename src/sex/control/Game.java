package sex.control;

import sex.game.Board;
import sex.game.Equipment;
import sex.game.LevelCalculator;
import sex.game.Player;
import sex.game.items.consumables.food.BagOfPotatoes;
import sex.game.items.consumables.food.Bread;
import sex.game.items.consumables.food.Water;
import sex.ui.console.CommandParser;
import sex.ui.console.render.ItemsRenderer;
import sex.ui.console.render.MapRenderer;
import sex.ui.console.render.ProportionalHpRenderer;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Runtime.getRuntime;
import static java.util.Arrays.asList;
import static sex.control.Move.*;

public class Game implements GameListener
{
    private final Scanner scanner;
    private final Player player;
    private final Board board;
    private final MapRenderer mapRenderer;
    private final ProportionalHpRenderer proportionalHpRenderer;
    private final CommandParser parser;

    private boolean gamePlaying = true;

    public Game(Scanner scanner)
    {
        this.scanner = scanner;
        Equipment startingEquipment = new Equipment(15, asList(new Water(), new Bread(), new BagOfPotatoes()));
        this.player = new Player(new LevelCalculator(), 10, 10, startingEquipment);
        this.board = new Board();
        this.mapRenderer = new MapRenderer(board, player);
        this.proportionalHpRenderer = new ProportionalHpRenderer(16);
        this.parser = new CommandParser(new CommandListener(new ItemsRenderer(startingEquipment)), this);
    }

    public void start()
    {
        while (gamePlaying)
        {
            clearScreen();
            //System.out.println(mapRenderer.render());
            System.out.println("Zdrowie: " + proportionalHpRenderer.render(player.health(), player.maxHealth()));
            String command = scanner.nextLine();
            parser.parse(command);
        }
    }

    @Override
    public void finishGame()
    {
        this.gamePlaying = false;
    }

    @Override
    public void movePlayer(Move move)
    {
        int x = player.getX();
        int y = player.getY();

        if (move == UP)
        {
            y -= 1;
        }
        if (move == DOWN)
        {
            y += 1;
        }
        if (move == LEFT)
        {
            x -= 1;
        }
        if (move == RIGHT)
        {
            x += 1;
        }
        player.moveTo(x, y);
    }

    private void clearScreen()
    {
        try
        {
            getRuntime().exec("cls");
        }
        catch (IOException ignored)
        {
        }
    }
}
