package lecture01;

import java.util.Scanner;

public class 중복문자제거 {

	public String Solution(String s) {
		
		String answer = "";
		
		for(int i = 0; i < s.length(); i++) {
			//i번째에 위치한 문자의 index가 i와 같다면
			if(s.indexOf(s.charAt(i))==i) answer += s.charAt(i);
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		중복문자제거 T = new 중복문자제거();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.Solution(str));
		
		scan.close();
		
	}
}
