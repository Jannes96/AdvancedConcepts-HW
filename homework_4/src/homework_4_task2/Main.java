package homework_4_task2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr1  = {0,1,2,3,4,6};
		int[] arr2  = {0,1,2,3,4,6};
		
		System.out.println(Arrays.equals(arr1,arr2));
		
		Scanner scanner = new Scanner(System.in);  
		
        System.out.println("Enter first String:");
        String String1 = scanner.nextLine();  
        System.out.println(Arrays.toString(countLetters(String1)));

        System.out.println("Enter second String:");
        String String2 = scanner.nextLine();
        System.out.println(Arrays.toString(countLetters(String2)));
		
        scanner.close();
        
        System.out.println(isAnagram(String1,String2));
        
        System.out.println(isAnagram2(String1,String2));
        
	}

	
    public static boolean isAnagram(String a, String b ) {
    	
    	 a = a.toLowerCase().replaceAll("\\s+", "");
         b = b.toLowerCase().replaceAll("\\s+", "");
         
         if (a.length() != b.length()) {
        	 return false;
         }
         
         /* Zwei char Arrays, welche die chars der Strings halten. Diese werden sortiert und verglichen. 
          Wenn ein Buchstabe öfter vorkommt sind die Strings keine Anagrame und .equals resultiert zu false */
         
         char[] arr1 = a.toCharArray();
         char[] arr2 = b.toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);

         return Arrays.equals(arr1, arr2);
   
    }

    public static boolean isAnagram2(String a, String b) {
    	
    	return Arrays.equals(countLetters(a),countLetters(b));
    	
    }
    
    public static int[] countLetters(String s) {
    	int[] counts = new int[26];
    	
    	for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                
                char lowercase = Character.toLowerCase(c);
                int index = lowercase - 'a'; // 'a' → 0, 'b' → 1, ..., 'z' → 25
                if (index >= 0 && index < 26) {
                    counts[index]++;
                }
            }
    	}
    	return counts;
    }
    
    
}
