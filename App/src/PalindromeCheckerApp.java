/**
 * --------------------------------------------------------
 * MAIN CLASS - PalindromeCheckerApp
 * --------------------------------------------------------
 *
 * Project: Palindrome Checker App
 *
 * Description:
 * This application demonstrates multiple approaches
 * to checking whether a string is a palindrome.
 *
 * The following Use Cases are implemented:
 *
 * UC1 - Application Entry & Welcome Message
 * UC2 - Hardcoded Palindrome Check (Half Comparison)
 * UC3 - Palindrome Check Using String Reverse
 * UC4 - Character Array Based Palindrome Check
 *
 * This project strengthens understanding of:
 * - String handling
 * - Loops
 * - Conditional statements
 * - Character arrays
 * - Two-pointer technique
 *
 * @author YourName
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * --------------------------------------------------------
     * MAIN METHOD
     * --------------------------------------------------------
     * Entry point of the application.
     */
    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("   PALINDROME CHECKER APPLICATION");
        System.out.println("   Version : 4.0");
        System.out.println("======================================\n");

        runUC1();
        runUC2();
        runUC3();
        runUC4();
    }

    /**
     * --------------------------------------------------------
     * UC1: Application Entry & Welcome Message
     * --------------------------------------------------------
     */
    public static void runUC1() {

        System.out.println("---- UC1: Welcome Page ----");
        System.out.println("System initialized successfully.\n");
    }

    /**
     * --------------------------------------------------------
     * UC2: Hardcoded Palindrome Check
     * --------------------------------------------------------
     * Logic: Compare first half of string with second half.
     */
    public static void runUC2() {

        System.out.println("---- UC2: Half-Length Comparison ----");

        String input = "madam";
        boolean isPalindrome = true;

        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome + "\n");
    }

    /**
     * --------------------------------------------------------
     * UC3: Palindrome Check Using String Reverse
     * --------------------------------------------------------
     * Logic: Reverse string and compare using equals().
     */
    public static void runUC3() {

        System.out.println("---- UC3: Reverse String Method ----");

        String original = "madam";
        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println("Is Palindrome: " + original.equals(reversed) + "\n");
    }

    /**
     * --------------------------------------------------------
     * UC4: Character Array Based Palindrome Check
     * --------------------------------------------------------
     * Logic: Convert to char[] and use two-pointer approach.
     */
    public static void runUC4() {

        System.out.println("---- UC4: Char Array Two-Pointer ----");

        String input = "madam";

        // Convert string to character array
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome: " + isPalindrome + "\n");
    }
}
/**
 * --------------------------------------------------------
 * UC5: Stack-Based Palindrome Checker
 * --------------------------------------------------------
 * Logic:
 * - Push characters into stack
 * - Pop characters (reversed order)
 * - Compare with original string
 */
public static void runUC5() {

    System.out.println("---- UC5: Stack-Based Palindrome Check ----");

    String input = "madam";

    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));
    }

    boolean isPalindrome = true;

    for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) != stack.pop()) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input: " + input);
    System.out.println("Is Palindrome: " + isPalindrome + "\n");
}
}
/**
 * --------------------------------------------------------
 * UC6: Queue + Stack Based Palindrome Check
 * --------------------------------------------------------
 */
public static void runUC6() {

    System.out.println("---- UC6: Queue + Stack Based Palindrome Check ----");

    String input = "madam";

    Stack<Character> stack = new Stack<>();
    Queue<Character> queue = new LinkedList<>();

    for (int i = 0; i < input.length(); i++) {
        stack.push(input.charAt(i));    // LIFO
        queue.add(input.charAt(i));     // FIFO
    }

    boolean isPalindrome = true;

    while (!stack.isEmpty()) {
        if (!stack.pop().equals(queue.remove())) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input: " + input);
    System.out.println("Is Palindrome: " + isPalindrome + "\n");
}
}
/**
 * UC7: Deque-Based Optimized Palindrome Checker
 */
public static void runUC7() {

    System.out.println("---- UC7: Deque-Based Optimized Check ----");

    String input = "madam";
    Deque<Character> deque = new ArrayDeque<>();

    // Insert characters into deque
    for (int i = 0; i < input.length(); i++) {
        deque.addLast(input.charAt(i));
    }

    boolean isPalindrome = true;

    // Compare front and rear
    while (deque.size() > 1) {
        if (!deque.removeFirst().equals(deque.removeLast())) {
            isPalindrome = false;
            break;
        }
    }

    System.out.println("Input: " + input);
    System.out.println("Is Palindrome: " + isPalindrome + "\n");
}
}
/**
 * UC8: Linked List Based Palindrome Checker
 */
public static void runUC8() {

    System.out.println("---- UC8: Linked List ----");

    String input="madam";

    Node head=null;
    Node tail=null;

    // Create linked list
    for(char c:input.toCharArray()) {

        Node newNode=new Node(c);

        if(head==null) {

            head=newNode;
            tail=newNode;

        }

        else {

            tail.next=newNode;
            tail=newNode;

        }

    }

    // Find middle
    Node slow=head;
    Node fast=head;

    while(fast!=null && fast.next!=null) {

        slow=slow.next;
        fast=fast.next.next;

    }

    // Reverse second half
    Node prev=null;
    Node current=slow;

    while(current!=null) {

        Node next=current.next;
        current.next=prev;
        prev=current;
        current=next;

    }

    // Compare
    Node first=head;
    Node second=prev;

    boolean isPalindrome=true;

    while(second!=null) {

        if(first.data!=second.data) {

            isPalindrome=false;
            break;

        }

        first=first.next;
        second=second.next;

    }

    System.out.println("Input: "+input);
    System.out.println("Is Palindrome: "+isPalindrome+"\n");

}

}


