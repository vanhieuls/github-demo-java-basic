
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int index=0;
        int cnt=0;
        int ok=1;
        while(index<n){
            if(a[index]==25){
                cnt++;
            }
            else if(a[index]==50){
                if(cnt<2) {ok=0;System.out.println("NO");
                break;}
                else{
                    cnt--;
                }
            }
            else if(a[index]==100){
                if(cnt<3) {ok=0;System.out.println("NO");
                break;}
                else{
                    cnt-=3;
                }
            }
            index++;
        }
        if(ok==1)System.out.println("YES");
    }
}
