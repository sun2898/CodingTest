package lecture01;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
	
	public String Solution(String s) {
		
		String answer = "";
		char[] str = s.toCharArray();
		int lt = 0, rt= s.length()-1;
		while(lt < rt) {
			if(!Character.isAlphabetic(str[lt])) lt++;
			else if(!Character.isAlphabetic(str[rt])) rt--;
			else {
				char tmp = str[lt];
				str[lt] = str[rt];
				str[rt] = tmp;
				lt++;
				rt--;
			}
		}
		
		answer = String.valueOf(str);
		
		return answer;
	}
	
	public static void main(String[] args) {
		특정_문자_뒤집기 T = new 특정_문자_뒤집기();
		
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println(T.Solution(str));
		
	}
}
