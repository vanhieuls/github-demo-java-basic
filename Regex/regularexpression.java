
import java.util.Scanner;
import java.util.regex.Pattern;

class regularexpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input: ");
            String txt = scan.nextLine();
            System.out.println("TXT: " + txt);
            Pattern p = Pattern.compile("^[a-z A-Z 0-9 ]{6,}$");
            if (p.matcher(txt).find()) {
                System.out.println("OK");
                break;
            } else
                System.out.println("NOT OK");
        }
        scan.close();
    }
}