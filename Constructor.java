import java.util.Random;
import java.util.Scanner;

public class Constructor {

	public static void main(String[] args) {
		
//		Random ran = new Random();
//		int num = ran.nextInt(999999)+1;
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("자연수 입력(1 ~ 999,999) : ");
		int N = sc.nextInt();
		int con = 0;
		for(int i = 1; i <= N ; i++) {
			if(i < 10) {
				if((i+i)==N ) {
					if(con==0) {
						con=i;
					}else {
						if(con > i) {
							con=i;
						}
					}
				}
			}else if(i < 100) {
				if((i+(i%10)+(i/10))==N ) {
					if(con==0) {
						con=i;
					}else {
						if(con > i) {
							con=i;
						}
					}
				}
			}else if(i < 1000) {
				if((i+(i%10)+(i/10%10)+(i/100))==N) {
					if(con==0) {
						con=i;
					}else {
						if(con > i) {
							con=i;
						}
					}
				}
			}else if(i < 10000) {
				if((i+(i%10)+(i/10%10)+(i/100%10)+(i/1000))==N) {
					if(con==0) {
						con=i;
					}else {
						if(con > i) {
							con=i;
						}
					}
				}
			}else if(i < 100000) {
				if((i+(i%10)+(i/10%10)+(i/100%10)+(i/1000%10)+(i/10000))==N) {
					if(con==0) {
						con=i;
					}else {
						if(con > i) {
							con=i;
						}
					}
				}
			}else if(i <= 1000000) {
				if((i+(i%10)+(i/10%10)+(i/100%10)+(i/1000%10)+(i/10000%10)+(i/100000))==N) {
					if(con==0) {
						con=i;
					}else {
						if(con > i) {
							con=i;
						}
					}
				}
			}
		}
		
		System.out.println(con);

	}

}
