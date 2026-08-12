//write a program that reverses a string
//leetcode 344 - (asked by microsoft/uber)

public class ReverseString {
    
    public static void main(String[] args) {
        
        String str = "string";
        String revString = "";
        char[] newString = str.toCharArray();

        for(int i = str.length() - 1; i >= 0; i--){
            revString += newString[i];            
        }

        System.out.println(revString);

    }

}
