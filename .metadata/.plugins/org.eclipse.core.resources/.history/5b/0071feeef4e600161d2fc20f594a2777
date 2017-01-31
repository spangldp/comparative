
import java.util.*;
public class Sample {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        String user = System.getProperty("user.name");
        System.out.println(user);
        int printed = 0;
        while (input.hasNext() && printed < 10) {
            String line = input.nextLine();
            if (line.indexOf("zmudam") == 0 ||
                line.indexOf(user) == 0) {
                    System.out.println(line);
                    printed++;
            }
        }
        input.close();
    }
}
