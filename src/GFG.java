
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GFG {

    public static void main(String[] args)
            throws IOException
    {

        List<String> listOfStrings
                = new ArrayList<String>();


        BufferedReader bf = new BufferedReader(
                new FileReader("file.txt"));


        String line = bf.readLine();


        while (line != null) {
            listOfStrings.add(line);
            line = bf.readLine();
        }


        bf.close();


        String[] array = listOfStrings.toArray(new String[0]);

        boolean searchResult = false;


        for (int i = 0; i < array.length; i++) {
            if(array[i].equals("alomayriy970@outlook.com")) {
                searchResult = true;
                System.out.println("Email:"+array[i]+"\n have been found!");
            }
        }
        if(!searchResult) {
            System.out.println("not found");
        }
    }
}
