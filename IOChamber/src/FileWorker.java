import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileWorker {

    public String [] fileReader(String path) {
        String fileText[] = new String[100];
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            byte i = 0;
            while ((line = reader.readLine()) != null && i < 100){
                fileText[i] = line;
//                System.out.println(fileText[i]);
                i++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        int k = 0;
        while (fileText[k] != null){
            k++;
        }

        String strings[] = new String[k];

        for (byte i = 0; i < strings.length; i++){
            strings[i] = fileText[i];
        }
        fileText = null;
        System.gc();
        return strings;
    }
}
