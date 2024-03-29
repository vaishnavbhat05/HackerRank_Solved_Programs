// In computer science, a double-ended queue (dequeue, often abbreviated to deque, pronounced deck) is an abstract data type that generalizes a queue, for which elements can be added to or removed from either the front (head) or back (tail).

// Deque interfaces can be implemented using various types of collections such as LinkedList or ArrayDeque classes. For example, deque can be declared as:

// Deque deque = new LinkedList<>();
// or
// Deque deque = new ArrayDeque<>();
// You can find more details about Deque here.

// In this problem, you are given  integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size .

// Note: Time limit is  second for this problem.

// Input Format

// The first line of input contains two integers  and : representing the total number of integers and the size of the subarray, respectively. The next line contains  space separated integers.

// Constraints




// The numbers in the array will range between .

// Output Format

// Print the maximum number of unique integers among all possible contiguous subarrays of size .

// Sample Input

// 6 3
// 5 3 5 2 3 2
// Sample Output

// 3
// Explanation

// In the sample testcase, there are 4 subarrays of contiguous numbers.

//  - Has  unique numbers.

//  - Has  unique numbers.

//  - Has  unique numbers.

//  - Has  unique numbers.

// In these subarrays, there are  unique numbers, respectively. The maximum amount of unique numbers among all possible contiguous subarrays is .

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        Set<Integer> uniqueElements = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            // Add the current element to the deque and set
            deque.addLast(num);
            uniqueElements.add(num);

            // Maintain the sliding window of size m
            if (deque.size() == m + 1) {
                int removedElement = deque.removeFirst();
                if (!deque.contains(removedElement)) {
                    // If the removed element is not present in the remaining subarray,
                    // remove it from the set
                    uniqueElements.remove(removedElement);
                }
            }

            // Update the maximum number of unique elements
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, uniqueElements.size());
            }
        }

        System.out.println(maxUnique);
    }
}
