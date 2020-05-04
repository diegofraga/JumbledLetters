package cesar2;

import java.io.IOException;
import java.util.Scanner;

public class Main {
	

	public static void main(String args[]) throws IOException {

		
		System.out.println("test 2: \n");
		
		String word1 = null;
		String word2 = null;
		
		
		

		Scanner scan=new Scanner(System.in); 
		 
		word1 = scan.nextLine();
		
		word2 = scan.nextLine();
		 
		
		isPermutation(word1,word2);
	
		 
	}
	static void scan(String s1, String s2) {
		 
		Scanner scan=new Scanner(System.in); 
		 
		s1 = scan.nextLine();
		
		s2 = scan.nextLine();
		 
		
		System.out.print(s1 +" "+ s2);
		
		 
	}
	
	
	static void isPermutation(String word1,String word2) {
		
		
		Boolean permutation;
		
		if(word1.codePointAt(0) == word2.codePointAt(0)) {
					
					if(word1.length()>3) {
						
						float cont=0;
						float proportion = (float) 0.6667;
						for(int i=0;i<word1.length();i++) {
							 if(word1.codePointAt(i) != word2.codePointAt(i)) 
								 cont++;
							 
						 }
						 cont = cont/word1.length();
						 if (cont < proportion) 
							 permutation = true;
						 else 
							 permutation = false;
					}else {
						permutation = true;
					}
		}
		else {
			permutation = false;
		}
			
		if(permutation)
			System.out.print(word1 + ", " + word2 + " -> " + permutation);
		else
			System.out.print(word1 + ", " + word2 + " -> " + permutation);
				
	}
	
}