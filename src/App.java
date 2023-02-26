import java.lang.reflect.Array;
import java.util.ArrayList;

public class App
{
    public static void LoadsCards()
    {
        ArrayList<Object> cards = new ArrayList<Object>();
        cards.add(new Game());
        cards.add(new GameV2());
        cards.add(new GameV3());
        cards.add(new GameV4());
        // call game class
        for(Object card: cards)
        {
            if (card instanceof Game)
            {
                ((Game) card).Run();
            }
            else if (card instanceof GameV2)
            {
                ((GameV2) card).Run();
            }
            else if (card instanceof GameV3)
            {
                ((GameV3) card).Run();
            }
            else if (card instanceof GameV4)
            {
                ((GameV4) card).Run();
            }

        }
    }
    public static final char getAscii(int code)
    {
        return Symbols.EXTENDED[code];
    }

    public static final void printChar(int ascii)
    {
        System.out.printf("%c%n", getAscii(ascii) );
    }



    public static void printxy(int col, int row, String val)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%s[%d;%df",escCode,row,col));
        System.out.print(val);
    }

    public static void Box(int x, int y, int w, int h, int ascii, String fcolor,String bcolor)
    {
        char val = getAscii(ascii);
        for (int i=0; i < w; i++)
        {
            for (int j=0; j< h; j++)
            {

                printxy(x+i,y+j,fcolor + bcolor + val);
            }
        }
    }

    public static void main(String[] args)
    {
        // game summary
        //user picks first then computer picks
        //whoever has the high card value wins
        //cards picked are deleted from the list
        //
        // Run() will do everything
        LoadsCards();
        System.out.println("Game Over");
        //g.Run();
        //cls();
        //Symbols.PrintSymbols();

        //Box(5,5,10,10,91, tools.Colors.RED, tools.Colors.YELLOW_BACKGROUND);
        //Box(10,10,10,10,91, tools.Colors.YELLOW, tools.Colors.GREEN_BACKGROUND);


        while (true);
    }
}