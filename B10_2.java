import java.util.Scanner;
public class B10_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[21];
		arr[0]=0;
		arr[1]=1;
		int res = 0;
		for(int i = 2; i <= 20; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		System.out.println(arr[n]);
	}
}