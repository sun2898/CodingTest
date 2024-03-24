package lecture01;

import java.util.Scanner;

public class 대소문자변환 {
	
	String Solution(String str) {
		
		char[] arr = str.toCharArray();
		String u = "";
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 97) {
				arr[i] = (char) (arr[i] - 32);
			} else {
				arr[i] = (char) (arr[i] + 32);
			}
			u += arr[i];
		}
		
		
		return u; 
	}
	
	public static void main(String[] args) {
		대소문자변환 T = new 대소문자변환();
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		
		System.out.println(T.Solution(str));
		
		scan.close();
		
	}
}
