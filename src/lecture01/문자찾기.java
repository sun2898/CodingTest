package lecture01;

import java.util.Scanner;

public class 문자찾기 {
	
	public int solution(String str, char t) {
		int answer = 0;
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		
		for(char x : str.toCharArray()) {
			if(x == t) answer++;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		문자찾기 T = new 문자찾기();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char s = scan.next().charAt(0);
		
		System.out.println(T.solution(str, s));
		
	}

}
