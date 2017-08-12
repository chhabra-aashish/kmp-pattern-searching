package kmpPatternSearching;

import java.util.Scanner;

public class KMPPattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the text in which pattern needs to be searched without spaces");
		String text=sc.next();
		System.out.println("Enter the pattern to be searched");
		String pattern=sc.next();
		sc.close();
		System.out.println("Index at which pattern is found: "+Pattern.search(text,pattern));

	}

}
