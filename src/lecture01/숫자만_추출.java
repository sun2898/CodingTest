package lecture01;

import java.util.Scanner;

public class 숫자만_추출 {
	
	public int Solution(String s) {
		int answer = 0;
		
		String tmp = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(!Character.isAlphabetic(s.charAt(i))) {
				tmp += s.charAt(i);
			}
		}
		
		answer = Integer.valueOf(tmp);
		//answer = Integer.parseInt(tmp);
				
		return answer;
	}
	
	public static void main(String[] args) {
		숫자만_추출 T = new 숫자만_추출();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.Solution(str));
		
	}
}
