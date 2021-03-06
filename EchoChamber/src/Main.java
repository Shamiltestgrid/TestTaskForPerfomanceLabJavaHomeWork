import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        boolean finish = false;
        while (finish == false){
            String elem = scanner.nextLine();

            if (elem.equals(null) || elem.equals("")){
                finish = true;
            }
            else {
                list.add(elem);
            }
        }

        for(String elem : list){
            System.out.println(elem);
        }

    }
}
