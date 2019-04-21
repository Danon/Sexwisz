package sex;

import sex.control.Game;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        new Game(new Scanner(System.in)).start();
    }
}
