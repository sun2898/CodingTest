package lecture01;

import java.util.Scanner;

public class 유효한_팰린드롬 {
	
	public String Solution(String s) {
		String answer = "NO";
		s = s.toLowerCase().replaceAll("[^a-z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}
	
	public static void main(String[] args) {
		
		유효한_팰린드롬 T = new 유효한_팰린드롬();
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println(T.Solution(str));
	}
}
