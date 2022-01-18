import java.util.ArrayList;
//import java.util.Random;
import java.util.Scanner;

public class BlackJack {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		Random random = new Random(); 
		
		ArrayList<Integer> list = new ArrayList<>();
		
//		int num1 = (random.nextInt(98))+3;
//		int num2 = (random.nextInt(299990))+10;
		int N = sc.nextInt();
		int M = sc.nextInt();

//		System.out.print(N);
//		System.out.print(" ");
//		System.out.println(M);
		
//		for(int i = 0; i < num1; i++) {
//			int a;
//			if(num2 > 100000) {
//				a = random.nextInt(100000)+1;
//			} else {
//				a = random.nextInt(num2)+1;
//			}
//			list.add(a);
//			System.out.print(list.get(i));
//			System.out.print(" ");
//		}
		
		for(int i = 0; i < N; i++) {
			int a;
			a = sc.nextInt();
			list.add(a);
		}
		
		int res = 0;
		for(int i = 0; i < list.size(); i++) {
			int a = list.get(i);
			for(int j = 0; j < list.size(); j++) {
				if(i==j) {
					j+=1;
					if(j==list.size()) {
						break;
					}
				}
				int b = a + list.get(j);
				for(int n = 0; n < list.size(); n++) {
					if(n==i || n==j) {
						n+=1;
						if(n==list.size()) {
							break;
						}
					}
					int c = b + list.get(n);
					if(c <= M) {
						if(c > res) {
							res = c;
						}
					}
				}
			}
		}
		if(res==0) {
			System.out.println("null");
		}else {
			System.out.println(res);
		}
		

	}

}
