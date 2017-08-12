package kmpPatternSearching;

public class Pattern {
	// this method returns the temporary array that is used to see if pattern has a suufix and prefix that are same
	public static int[] TemporaryArray(String pattern) {
		int[] arr = new int[pattern.length()];  // array with size of pattern
		int j=0,i;
		for(i=1;i<pattern.length();) {
			if(pattern.charAt(i)!=pattern.charAt(j)) {
				if(j!=0) {
					j=arr[j-1];
				}
				else {
					arr[i]=0;
					j++;
					i++;
				}
			}
			else {
				arr[i]=j+1;
				i++;
				j++;
			}
		}
		return arr;
	}
	//this method compares the pattern and text supplied and returns the index where the pattern is found
	// returns -1 if pattern is not found in text
	public static int search(String text, String pattern) {
		int[] arr = TemporaryArray(pattern);
		int i=0,j=0;
		while(i<text.length() && j<pattern.length()) {
			if(text.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
			}
			else {
				if(j!=0) {
					j=arr[j-1];
				}
				else {
					i++;
				}
			}
		}
		if(j==pattern.length()) {
			return i-pattern.length();
		}
		return -1;
	}
}
