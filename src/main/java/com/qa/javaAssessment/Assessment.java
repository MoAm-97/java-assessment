package com.qa.javaAssessment;

public class Assessment {

	// Given a string, return a string where
		// for every char in the original string,
		// there are three chars.

		// multChar("The") ==> "TTThhheee"
		// multChar("AAbb") ==> "AAAAAAbbbbbb"
		// multChar("Hi-There") ==> "HHHiii---TTThhheeerrreee"

		public String multChar(String input) {
			String word = "";
			for (int i = 0; i< input.length(); i++) {
				word += input.substring(i, i+1);
				word += input.substring(i, i+1);
				word += input.substring(i, i+1);
			}
			return word;
		}
		
		
		
		
		
		
		// Return the string (backwards) that is between the first and last appearance
		// of "bert"
		// in the given string, or return the empty string "" if there is not 2
		// occurances of "bert" - Ignore Case

		// getBert("bertclivebert") ==> "evilc"
		// getBert("xxbertfridgebertyy") ==> "egdirf"
		// getBert("xxBertfridgebERtyy") ==> "egdirf"
		// getBert("xxbertyy") ==> ""
		// getBert("xxbeRTyy") ==> ""

		public String getBert(String input) {
			return "";
		}


		
		// Given three ints, a b c, one of them is small, one is medium and one is
		// large. Return true if the three values are evenly spaced, so the
		// difference between small and medium is the same as the difference between
		// medium and large. Do not assume the ints will come to you in a reasonable
		// order.

		// evenlySpaced(2, 4, 6) ==> true
		// evenlySpaced(4, 6, 2) ==> true
		// evenlySpaced(4, 6, 3) ==> false
		// evenlySpaced(4, 60, 9) ==> false

		public boolean evenlySpaced(int a, int b, int c) {
			int z[]= {a,b,c};
			int min=0;
			int max=0;
			int mid=0;
			int i=0;
			
			if(z[0]<z[1] && z[0]<z[2]) {
				min=z[0];
			}
			if(z[1]<z[0] && z[1]<z[2]) {
				min=z[1];
			}
			if(z[2]<z[0] && z[2]<z[1]) {
				min=z[2];
			}
			
			for(i=0;i<=z.length-1;i++) {
				if(max<=z[i]) {
					max=z[i];
				}
			}
			
			for(i=0;i<=z.length-1;i++) {
				if(max>z[i] && z[i]>min) {
					mid=z[i];
				}
			}
			
			int d=max-mid;
			int e=max-min;
			int f=mid-min;
			if(d==0 && e==0){
				return true;
			}
			if(d==e|d==f|e==f){
				return true;
			}
			return false;
		}

		
		
		
		
		
		
		// Given a string and an int n, return a string that removes n letters from the 'middle' of the string.
		// The string length will be at least n, and be odd when the length of the input is odd.

		// nMid("Hello", 3) ==> "Ho"
		// nMid("Chocolate", 3) ==> "Choate"
		// nMid("Chocolate", 1) ==> "Choclate"

		public String nMid(String input, int a1) {
			
			StringBuilder Z1=new StringBuilder(input);
			int L= input.length();
			int M;
			int i;
			if(a1>1) {
				M=L/3;
			}
			else {M=L/2;
			}
			for(i=0;i<a1;i++) {
				Z1.deleteCharAt(M);
			}
			return Z1.toString();
		}


		// Given a string, return the length of the largest "block" in the string.
		// A block is a run of adjacent chars that are the same.
		//
		// superBlock("hoopplla") ==> 2
		// superBlock("abbCCCddDDDeeEEE") ==> 3
		// superBlock("") ==> 0

		public int superBlock(String input) {
		String alpha=input;
		int B=0;
		int i,y=1;
		if(alpha.length()==0) {
			B=0;		
		}
		else if(alpha.length()==1) {
			B=1;
		}	
			else { 
				for(i=0;i<alpha.length()-1;i++){
						if((alpha.length()==2) && (alpha.charAt(i)!=alpha.charAt(i+1))){
								B=1;
			        	} 
						else if((alpha.length()==3) && (alpha.charAt(i)!=alpha.charAt(i+1))) {
			        				B=1;
			        	}
			        	
			        	else if(alpha.charAt(i) == alpha.charAt(i+1)) {
			        			y=y+1;
			        			
			        			if(y>B) {
			        				B=y;
			        			}	
			        	}
			        	else{ y=1;
			        	}
			      }
			}
		return B;				
	}
		
		//given a string - return the number of times "am" appears in the String ignoring case -
		// BUT ONLY WHEN the word "am" appears without being followed or proceeded by other letters
		//
		//amISearch("Am I in Amsterdam") ==> 1
		//amISearch("I am in Amsterdam am I?") ==> 2
		//amISearch("I have been in Amsterdam") ==> 0

		public int amISearch(String arg3){
			int count=0;
			String alpha2;
			String test= "am";
			int i=0;
			
			for(i=0;i<arg3.length();i++) {
				alpha2=arg3.substring(i,i+1);
				if(alpha2.equals(test)) {
						count++;
				}
			}	
		return count;}
		
		
		
		//given a number 
		// if this number is divisible by 3 return "fizz"
		// if this number is divisible by 5 return "buzz"
		// if this number is divisible by both 3  and 5return "fizzbuzz"
		//
		//fizzBuzz(3) ==> "fizz"
		//fizzBuzz(10) ==> "buzz"
		//fizzBuzz(15) ==> "fizzbuzz"
		
		public String fizzBuzz(int num) {
			if(num%3==0 && num%5==0 ) {
				return "fizzbuzz";	
			}
			else {
				if(num%3==0){
				return "fizz";
				}
				if(num%5==0) {
				return "buzz";
				}
			}
			return null;
			
		}
		

		
		
		
		
		
		
		//Given a string split the string into the individual numbers present
		//then add each digit of each number to get a final value for each number
		// String example = "55 72 86"
		//
		// "55" will = the integer 10
		// "72" will = the integer 9
		// "86" will = the integer 14
		//
		// You then need to return the highest vale
		//
		//largest("55 72 86") ==> 14
		//largest("15 72 80 164") ==> 11
		//largest("555 72 86 45 10") ==> 15
		
		
		public int largest(String arg1) {
			int i,j;
			int Numbers[] = null;
			String parts[] = arg1.split(" ");
			for(i=0;i<parts.length;i++) {
			Numbers[i]=Integer.parseInt(parts[i]);
			
				for(j=0;j<Numbers.length;j++){
					
				}
			
			}
					
			
			return -1;
		}
}
