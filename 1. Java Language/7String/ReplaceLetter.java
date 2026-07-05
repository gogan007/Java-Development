// Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.println(name);

        String res = "";
        for (int i=0;i<name.length();i++) {
            if (name.charAt(i) == 'e') {
                res += 'i';
            }
            else{
                res += name.charAt(i);
            }
        }
        System.out.println(res);

        sc.close();
    }
}

        // 2nd Method
        // String str = "Gogan";
        // String res = str.replace('o','a');
        // System.out.println(str);
        // System.out.println(res);