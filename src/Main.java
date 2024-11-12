

public class Main {
    
    public static void main(String[] args) {
        


       byte[][] v = {{4, 2, 8, 5},
                    {9, 3, 8, 4},
                    {5, 6, 7, 8},
                    {8, 4, 5, 6}};

        byte r = 0;

        for (byte i = 0; i < v.length; i++) {
            for (byte j = 0; j < v[i].length; j++) {
                System.out.println(v[i][j]);
            }
        }
    }
}
