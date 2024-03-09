package FILE_OUTPUT;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class fileoutput 
{
    public static void print(String line) throws IOException
    {
        FileWriter writer = new FileWriter("0_data.txt" , true);

        BufferedWriter bw = new BufferedWriter(writer);

        bw.write(line);

        bw.close();


    }
}
