// Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user. 

import java.util.Scanner;

public class EmailToUserName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email : ");
        String email = sc.next();
        System.out.println(email);

        String userName = "";
        for (int i=0;i<email.length();i++) {
            if (email.charAt(i) == '@') {
                break;
            }
            else{
                userName += email.charAt(i);
            }
        }
        System.out.println("Your Use Name is : " + userName);
        
        sc.close();
    }
}

// 2nd Method

// String email = "example@gmail.com";
// int atIndex = email.indexOf('@');
// String userName = email.substring(0, atIndex);
// System.out.println(userName);
