import java.util.Scanner;
import java.util.regex.Pattern;

class checksdt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Input phone: ");
            String phone = scan.nextLine();
            Pattern p = Pattern.compile("^[0-9]{3}-[0-9]{3}-[0-9]{4}-(ex|ext)$");
            if (p.matcher(phone).find()) {
                System.out.println("phone is ok");
                break;
            } else
                System.out.println("Not ok");
        }
    }
}