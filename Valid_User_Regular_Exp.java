// Input Format

// The first line of input contains an integer , describing the total number of usernames. Each of the next  lines contains a string describing the username. The locked stub code reads the inputs and validates the username.

// Constraints

// The username consists of any printable characters.
// Output Format

// For each of the usernames, the locked stub code prints Valid if the username is valid; otherwise Invalid each on a new line.

// Sample Input 0

// 8
// Julia
// Samantha
// Samantha_21
// 1Samantha
// Samantha?10_2A
// JuliaZ007
// Julia@007
// _Julia007
// Sample Output 0

// Invalid
// Valid
// Valid
// Invalid
// Invalid
// Valid
// Invalid
// Invalid
// Explanation 0

// Refer diagram in the challenge statement.

import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "^[a-zA-Z]\\w{7,29}$";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}