import java.io.InputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        InputStream resourceAsStream = getClass().getClassLoader().getResourceAsStream("test.txt");

        Scanner scanner = new Scanner(resourceAsStream);
        while (scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
    }
}
