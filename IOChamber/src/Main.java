import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        FileWorker fileWorker = new FileWorker();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();

        try {
            String[] ss = fileWorker.fileReader(args[0]);
            for ( int i = 0; i < 100; i = i+2){
                System.out.println(ss[i]);
            }
        } catch (Exception e) {
            System.out.println("Введите ваши сообщения");
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

            for ( int i = 0; i < list.size(); i = i+2){
                System.out.println(list.get(i));
            }
        }



    }
}
