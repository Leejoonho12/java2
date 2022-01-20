import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution2 {

	public static void main(String[] args) {
		String[] id_list = {"muzi","frodo","apeach","neo"};
		String[] report = {"muzi frodo", "apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		int[] arr  = solution(id_list, report, k);
		System.out.println(Arrays.toString(arr));

	}

	private static int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = new int[id_list.length];
		int[] num = new int[id_list.length];
		ArrayList<String> name = new ArrayList<>();
		report = Arrays.stream(report).distinct().toArray(String[]::new);
		for(int i = 0; i < report.length; i++) {
			String[] a = report[i].split(" ");
			for(int j = 0; j < id_list.length; j++) {
				if(a[1].equals(id_list[j])) {
					num[j]+=1;
					if(num[j] == k) {
						name.add(a[1]);
						for(int o = 0; o < report.length; o++) {
							String[] b = report[o].split(" ");
							if(b[1].equals(a[1])) {
								for(int n = 0; n < id_list.length; n++) {
									if(b[0].equals(id_list[n])) {
										answer[n] += 1;
										break;
									}
								}
							}
						}
					}
					break;
				}
			}
		}
		return answer;
	}

}
