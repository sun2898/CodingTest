package lecture01;

import java.util.Scanner;

public class 문자열_압축 {
	
	public String Solution(String s) {
		
		String answer = "";
		
		for(int i = 0, n = 1; i < s.length(); i++) {
			if(i < s.length()-1 && s.charAt(i)==s.charAt(i+1)) {
				n++;
			} else {
				answer += s.charAt(i);
				if(n != 1) {
					answer += n;
					n = 1;
				}
			}
		}
		
		return answer;
	}
	
	
	public static void main(String[] args) {
		문자열_압축 T = new 문자열_압축();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println(T.Solution(str));
		scan.close();
	}
}
