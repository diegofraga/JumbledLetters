# JumbledLetters

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
