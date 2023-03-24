
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class RecordFile {
    public void calculator() throws IOException{
        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            PrintWriter pw = new PrintWriter(file);
            pw.println("Hello world");
            pw.close();
        } catch (IOException e){
            System.out.println("Error:" + e);
        }

        try {
            br = new BufferedReader(new FileReader("newFile.txt"));
            String line;
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println("Error:" + e);
        }finally {
            assert br != null;
            br.close();
        }
    }
}