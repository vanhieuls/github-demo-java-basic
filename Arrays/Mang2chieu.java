import java.util.Scanner;

public class Mang2chieu {
    //Tzm giac pascal
    public static int[][] c = new int[1001][10001];
    public static void khoiTao(){
        for(int n=0; n<=1000; n++){
            for(int k=0; k<=n; k++){
                if(k==0||k==n) c[n][k]=1;
                else c[n][k]=(c[n-1][k-1]+c[n-1][k])%(int)(1e9+7);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        khoiTao();
        System.out.println(c[5][2]);
    }
}
