package SS3_Array_Method;

import java.util.Scanner;

public class FindCharAtString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Enter the character you want to find: ");
        char c = sc.next().charAt(0);
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                count++;
            }
        }
        System.out.println("The character " + c + " appears " + count + " times in the string");
    }
}
