package lecture01;

import java.util.Scanner;

public class Main {
	public String Solution(String s, int t) {
		String answer = "";
		
		for(int i = 0; i < t; i++) {
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2); // 2진수로 변환
			answer += (char)num;
			s = s.substring(7);
		}
		
		return answer;
	}
		
	public static void main(String[] args) {
		
		Main T = new Main();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String str = scan.next();
		System.out.println(T.Solution(str, n));
		scan.close();
	}
}
