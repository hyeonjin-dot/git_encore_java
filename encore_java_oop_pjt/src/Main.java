import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	private static int [] up;
	private static int [] down;
	private static int height;
	private static int len;



	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        len = scan.nextInt();
        height = scan.nextInt();
        up = new int[height + 1]; // 홀수
        down = new int[height + 1]; // 짝수
        int [] u_sum = new int[height + 1];
        int [] d_sum = new int[height + 1];
        int [] sum = new int [height + 1];
        
        u_sum[0] = 0;
        d_sum[0] = 0;
        sum[0] = 0;
        
        int n = 0;
        
        for (int i = 1 ; i < len + 1; i++) {
        	n = scan.nextInt();
        	if (i % 2 == 1)
        		up[n]++;
        	else
        		down[height - n + 1]++;
        }
        scan.close();
        
        u_sum[height] = up[height];
        for (int i = height - 1 ; i > 0; i--)
        	u_sum[i] = u_sum[i + 1] + up[i];
        
        for (int i = 1 ; i < height + 1; i++) {
        	d_sum[i] = d_sum[i - 1] + down[i];
        	sum[i] = u_sum[i] + d_sum[i];
        }
        sum[0] = 200000;
        Arrays.sort(sum);
        n = 0;
        for (int i = 0; i < height + 1 ; i++) {
        	if (sum[i] == sum[0])
        		n++;
        }
        System.out.println(sum[0] + " " + n );
        
        
        System.out.println("down sum");
        for (int i = 0; i < height + 1; i++) {
        	System.out.print(d_sum[i]);
        }
        System.out.println("\nup sum");
        for (int i = 0; i < height + 1; i++) {
        	System.out.print(u_sum[i]);
        }
        System.out.println("\nsum");
        
        for (int i = 1; i < height + 1; i++) {
        	System.out.print(sum[i]);
        }
    }

} // 배열 두개 (위랑 아래)