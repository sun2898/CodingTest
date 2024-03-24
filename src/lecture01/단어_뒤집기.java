package lecture01;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {
	
	public ArrayList<String> Solution(int n, String[] str) {
		
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
	
		단어_뒤집기 m = new 단어_뒤집기();
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] str = new String[n];
		for(int i = 0; i < n; i++) {
			str[i] = scan.next();
		}
		
		for(String x : m.Solution(n, str)) {
			System.out.println(x);
		}
		
	}
}
