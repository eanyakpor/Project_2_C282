

public class Game
{
    String[][] cardColors = {
            // use are values as index for Symbols array
            {Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BOLD, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.CYAN_BRIGHT},
            {Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT, Colors.CYAN_BRIGHT}
    };
    int[][][] card = {
            {{90, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 63},
    {51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 51},
    {51, 0, 0, 0, 0, 0,0, 78, 0, 0, 0, 0, 0, 0, 51},
    {51, 0, 0, 0, 0, 0, 0, 78, 0, 0, 0, 0, 0, 0, 51},
    {51, 0, 0, 0, 0, 0, 0, 78, 0, 0, 0, 0, 0, 0, 51},
    {51, 0, 0, 78, 78, 78, 78, 78, 78, 78, 78, 78, 0, 0, 51},
    {51, 0, 0, 0, 0, 0, 0, 78, 0, 0, 0, 0, 0, 0, 51},
    {51, 0, 0, 0, 0, 0, 0, 78, 0, 0, 0, 0, 0, 0, 51},
    {51, 0, 0, 0, 0, 0, 0, 78, 0, 0, 0, 0, 0, 0, 51},
    {64, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 89}},


            {{90, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 63},
                    {51, 0, 96, 0, 0, 0, 0, 96, 0, 0, 96, 0, 0, 0, 51},
                    {51, 0, 0, 96, 0, 0, 0, 0, 0, 0, 96, 0, 0, 0, 51},
                    {51, 0, 0, 0, 96, 0, 0, 96, 0, 96, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 96, 0, 0, 0, 96, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 96, 0, 96, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 0, 96, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 96, 0, 0, 96, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 96, 0, 0, 0, 0, 0, 96, 0, 0, 51},
                    {64, 68, 68, 68, 68, 68, 68, 68, 68, 68, 96, 68, 68, 68, 89}

},
            {
                    {90, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 63},
                    {51, 0, 0, 97, 97, 97, 97, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 0, 0, 0, 97, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 96, 0, 97, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 97, 97, 97, 0, 0, 28, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 97, 97, 97, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 0, 0, 97, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 0, 97, 0, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 97, 97, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51},
                    {64, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 89}
            },
            {
                    {90, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 63},
                    {51, 0, 0, 0, 0, 0, 0, 66, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 21, 0, 0, 0, 0, 0, 21, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 0, 74, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 92, 92, 92, 92, 92, 92, 92, 92, 92, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51},
                    {51, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 51},
                    {64, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 68, 89}
            }
};

public static void cls()
    {
        // cls
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
    public static void printxy(int col, int row, String val)
    {
        char escCode = 0x1B;
        System.out.print(String.format("%s[%d;%df",escCode,row,col));
        System.out.print(val);
    }

    void DisplayCard(int x, int y, int cardNumber)
{
    for(int i = 0; i < 10; i++)
    {
        for(int j = 0; j < 15; j++)
        {
            // for black spacing on console
            if(card[cardNumber][i][j] == 0)
            {
                //System.out.print(Colors.RED_BACKGROUND+ " ");
                printxy(x+j,y+i,Colors.RED_BACKGROUND+ " ");
            }
            // for
            else if((card[cardNumber][i][j] >= 1) && (card[cardNumber][i][j] <= 9))
            {
                // showing edge colors and symbols on edge
                //System.out.print(card[cardNumber][i][j]);
                //System.out.print(Symbols.EXTENDED[cardSymbols[i][j]]);
                printxy(x+j,y+i,card[cardNumber][i][j] + cardColors[i][j]);

            }
            // for showing symbols and colors
            else
            {
               // System.out.print(cardColors[i][j] + Symbols.EXTENDED[card[cardNumber][i][j]]);
                printxy(x+j,y+i,cardColors[i][j] + Symbols.EXTENDED[card[cardNumber][i][j]] );
            }

        }
        System.out.println("");
    }
}
    public void Run()
    {
        cls();
        //should call this the function 10 times
        // with 3 arguments
        DisplayCard(5,5,0);
        DisplayCard(15,10,1);


    }

}
