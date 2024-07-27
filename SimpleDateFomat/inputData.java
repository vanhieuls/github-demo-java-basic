import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
public class inputData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        try{
            System.out.println("Input Date: ");
            Date date =df.parse(sc.nextLine());
            System.out.println("Date: "+df.format(date));
        }catch(Exception e){}
        System.out.println("kkkkk");
        System.out.println("kkkhhhhkk");
        System.out.println("kkkhhhhkkthinh");
    }

}
