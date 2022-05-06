import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Registration {
    public static void main(String[] args) {

        System.out.println(System.console());

//
//Add registration to your login script allowing the user to add their details.
//Think about the UX and add appropriate instructions to assist the user
//With the password set rules; uppercase, lowercase, numbers, symbols
//Check the password validity (hint: ASCII table)
//Hide the password from view when the user is typing

        String username = "";
        String password = "";

        //variables to store input
        String inputUsername = "";
        String inputPassword = "";
        String inputConfPassword = "";

        final String USERNAME_PATTERN = "^[a-zA-Z/d]([._-](?![._-])|[a-zA-Z/d]){3,18}[a-zA-Z/d]$";
        final String PASSWORD_PATTERN = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*\\[-+_!@#$%^&*.,?]){6,18}";
        Scanner input = new Scanner(System.in);


        System.out.println("Enter username:");
        inputUsername = input.nextLine();

        if (!validateStrings(inputUsername.trim(), USERNAME_PATTERN)) {
            inputUsername="";
            System.out.println("Username must be 5-20 letters or numbers and can include:\".\",\" _\",\"-\" ");
            System.out.println("Enter username:");
            inputUsername = input.nextLine();
            } else {
            username = inputUsername;
        }
        //when typing the password hide each character as an *
//        Console console = System.console();
//        char[] passwordArray = console.readPassword("Enter password: ");
//        inputPassword = new String(passwordArray);
//        Arrays.fill(passwordArray, '*');
        
      System.out.println("Enter password:");
            inputPassword = input.nextLine();

             while (inputPassword.equals("")) {
                 System.out.println("Password is required");
                  System.out.println("Enter password:");
                  inputPassword = input.nextLine();
//                 passwordArray = console.readPassword("Enter password: ");
//                 inputPassword = new String(passwordArray);
             }

        if (!validateStrings(inputPassword, PASSWORD_PATTERN)) {
           
            System.out.println("Password must be minimum 8 letters and include at least 1 x uppercase, 1 x lowercase, a number and a special character");
            inputPassword="";
             System.out.println("Enter password:");
             inputPassword = input.nextLine();
//        passwordArray = console.readPassword("Enter password: ");
//        inputPassword = new String(passwordArray);
        } else {
            password= inputPassword;

        }
         System.out.println("Confirm password:");
         inputConfPassword = input.nextLine();
//        char[] passwordConfArray = console.readPassword("Confirm password: ");
//        inputConfPassword = new String(passwordConfArray);
        // while (inputConfPassword.equals("")) {
        //     System.out.println("Password confirmation is required");
        //     System.out.println("Confirm password:");
        //     inputConfPassword = input.nextLine();
        // passwordConfArray = console.readPassword("Confirm password: ");
        // inputConfPassword = new String(passwordConfArray);
        // }
        while(!inputConfPassword.trim().equals(inputPassword)){
//            System.out.println("Passwords must match");
//            passwordConfArray = console.readPassword("Confirm password: ");
//            inputConfPassword = new String(passwordConfArray);
        //     System.out.println("Confirm password:");
        //     inputConfPassword = input.nextLine();
        }
        }


    public static boolean validateStrings (String string, String PATTERN){
            // simple regex
            //private static final String USERNAME_PATTERN = "^[a-z0-9\\._-]{5,20}$";

            // strict regex
//        ^[a-zA-Z0-9]      # start with an alphanumeric character
//                (         # start of (group 1)
//       [._-](?![._-])     # follow by a dot, hyphen, or underscore, negative lookahead to
//                          # ensures dot, hyphen, and underscore does not appear consecutively
//                |               # or
//          [a-zA-Z0-9]     # an alphanumeric character
//                  )       # end of (group 1)
//        {3,18}            # ensures the length of (group 1) between 3 and 18
//        [a-zA-Z0-9]$      # end with an alphanumeric character
//
//                          # {3,18} plus the first and last alphanumeric characters,
//                          # total length became {5,20}

            final Pattern pattern = Pattern.compile(PATTERN);
            Matcher matcher = pattern.matcher(string);
            return matcher.matches();

        }

}
