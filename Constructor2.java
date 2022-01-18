import java.util.Scanner;

public class Constructor2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int con = 0;
		int i = 1;
		while(true) {
			
			i++;
			
			if(i < 10) {
				if((i+i)==N ) {
					con=i;
				}
			}else if(i < 100) {
				if((i+(i%10)+(i/10))==N ) {
					con=i;
				}
			}else if(i < 1000) {
				if((i+(i%10)+(i/10%10)+(i/100))==N) {
					con=i;
				}
			}else if(i < 10000) {
				if((i+(i%10)+(i/10%10)+(i/100%10)+(i/1000))==N) {
					con=i;
				}
			}else if(i < 100000) {
				if((i+(i%10)+(i/10%10)+(i/100%10)+(i/1000%10)+(i/10000))==N) {
					con=i;
				}
			}else if(i <= 1000000) {
				if((i+(i%10)+(i/10%10)+(i/100%10)+(i/1000%10)+(i/10000%10)+(i/100000))==N) {
					con=i;
				}
			}
			if(con != 0) {
				break;
			}
			
		}
		System.out.println(con);

	}

}
