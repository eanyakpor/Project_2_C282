public class GameV4 {
    String[][] cardColors = {
            // use are values as index for Symbols array
            {Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.GREEN_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.GREEN_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.RED_BRIGHT, Colors.RED_BRIGHT, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD_BRIGHT},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.BLACK, Colors.WHITE_BOLD},
            {Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD, Colors.WHITE_BOLD}
    };
    int[][] cardSymbols =
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
            };

    void DisplayCard()
    {
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 15; j++)
            {
                // for black spacing on console
                if(cardSymbols[i][j] == 0)
                {
                    System.out.print(" ");
                }
                // for
                else if((cardSymbols[i][j] >= 1) && (cardSymbols[i][j] <= 9))
                {

                    // showing edge colors and symbols on edge
                    System.out.println( Colors.YELLOW_BACKGROUND_BRIGHT+cardSymbols[i][j]);
                    //System.out.print(Symbols.EXTENDED[cardSymbols[i][j]]);

                }
                // for showing symbols and colors
                else
                {
                    System.out.print(cardColors[i][j]+Symbols.EXTENDED[cardSymbols[i][j]]);

                }

            }
            System.out.println("");
        }
    }
    public void Run()
    {
        cls();
        DisplayCard();


    }
    public static void cls()
    {
        // cls
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
