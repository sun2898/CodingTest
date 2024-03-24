package lecture01;

import java.util.Scanner;

public class 문장_속_단어 {
	public String Solution (String str) {
		String answer = "";
		int m = Integer.MIN_VALUE;
		String[] arr = str.split(" ");
		
		for(String x : arr) {
			int len = x.length();
			if(len > m) {
				m = len;
				answer = x;
			}
			
		}
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		문장_속_단어 T = new 문장_속_단어();
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		
		
		System.out.println(T.Solution(str));
		
	}
}
