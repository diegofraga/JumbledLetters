# JumbledLetters

2. Check words with jumbled letters :
Our brain can read texts even if letters are jumbled, like the following sentence: “ Yuo
cna porbalby raed tihs esaliy desptie teh msispeillgns.” Given two strings, write a
method to decide if one is a partial­permutation of the other. Consider a
partial­permutation only if:
­
­
The first letter hasn’t changed place
If word has more than 3 letters, up to 2/3 of the letters have changed place
Examples:
you, yuo ­> true
probably, porbalby ­> true
despite, desptie ­> true
moon, nmoo ­> false
misspellings, mpeissngslli ­> false

Function T(n) = O(n)


static void isPermutation(String word1,String word2) {
		
		
		Boolean permutation;
		
		if(word1.codePointAt(0) == word2.codePointAt(0)) {                1
					
					if(word1.length()>3) {                                      1
						
						float cont=0;                                             1
						float proportion = (float) 0.6667;                        1           
						for(int i=0;i<word1.length();i++) {                       n+1
							 if(word1.codePointAt(i) != word2.codePointAt(i))       n
								 cont++;                                              n
							 
						 }
						 cont = cont/word1.length();                              1
						 if (cont < proportion)                                   1
							 permutation = true;                                    1
						 else                   
							 permutation = false;                                   1
					}else {
						permutation = true;                                       1
					}
		}
		else {
			permutation = false;                                            1
		}                                                                 = 3n+10
			
		if(permutation)
			System.out.print(word1 + ", " + word2 + " -> " + permutation);
		else
			System.out.print(word1 + ", " + word2 + " -> " + permutation);
				
	}
	
}
