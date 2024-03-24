package lecture01;

import java.util.Scanner;

public class 회문_문자열 {
	
	public String Solution(String s) {
		
	String answer = "NO";	
	String temp = new StringBuilder(s).reverse().toString();
	if(s.equalsIgnoreCase(temp)) answer = "YES";
	
	return answer;
	
	}
	
	public static void main(String[] args) {
		
		회문_문자열 T = new 회문_문자열();
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(T.Solution(str));
	
		scan.close();
	}
}
