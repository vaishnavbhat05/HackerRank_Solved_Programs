// Input Format

// The first line contains a string . The second line contains another string . The strings are comprised of only lowercase English letters.

// Output Format

// There are three lines of output:
// For the first line, sum the lengths of  and .
// For the second line, write Yes if  is lexicographically greater than  otherwise print No instead.
// For the third line, capitalize the first letter in both  and  and print them on a single line, separated by a space.

// Sample Input 0

// hello
// java
// Sample Output 0

// 9
// No
// Hello Java
// Explanation 0

// String  is "hello" and  is "java".

//  has a length of , and  has a length of ; the sum of their lengths is .
// When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore,  is not greater than  and the answer is No.

// When you capitalize the first letter of both  and  and then print them separated by a space, you get "Hello Java".


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
         int totalLength = A.length() + B.length();

        // Check if A is lexicographically greater than B
        String result = (A.compareTo(B) > 0) ? "Yes" : "No";

        // Capitalize the first letter of A and B
        A = A.substring(0, 1).toUpperCase() + A.substring(1);
        B = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print the results
        System.out.println(totalLength);
        System.out.println(result);
        System.out.println(A + " " + B);
    }
}
