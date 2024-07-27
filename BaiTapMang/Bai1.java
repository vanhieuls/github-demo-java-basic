import java.util.Scanner;
/*input: 1 6 2 3 9 9
 * output: 1 6 9
 */
public class Bai1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        int max_value=a[0];
        System.out.println(a[0]);
        for(int i=1; i<n; i++){
            if(a[i]>max_value){
                System.out.println(a[i]);
                max_value=a[i];
            }
            
        }
    }
}
