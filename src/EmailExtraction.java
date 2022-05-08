import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtraction {
    /**
     *
     * @param br
     * @param pw
     * @param p
     * @throws IOException
     */

    public static void extractEmail(BufferedReader br, PrintWriter pw, Pattern p) throws IOException {
        String line = br.readLine();

        while(line != null) {
            Matcher m = p.matcher(line);

            // If find match
            while(m.find()) {

                // write the email in output.txt file
                pw.println(m.group());
            }

            // Goto next line in input.txt file
            line = br.readLine();
        }

        pw.flush();

    }
}
