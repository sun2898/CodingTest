package lecture01;

import java.util.Scanner;

public class 문자거리 {
	
	public int[] Solution(String s, char t) {
		int[] answer = new int[s.length()];

		//왼쪽으로 부터 떨어진 거리
		int p = 1000;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p++;
				answer[i] = p;
			}
		}
		
		//오른쪽으로부터 떨어진 거리 + 기존보다 작을 경우에만 숫자 교체
		p = 1000;
		for(int i = s.length()-1; i >= 0; i--) {
			if(s.charAt(i) == t) p = 0;
			else {
				p++;
				answer[i] = Math.min(answer[i], p);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		문자거리 T = new 문자거리();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char c = scan.next().charAt(0); //문자 한개를 읽을 때
		for(int x : T.Solution(str, c)) {
			System.out.print(x+" ");
		}
		
	}
}
