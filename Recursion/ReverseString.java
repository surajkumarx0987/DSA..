package com.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String str = "MADAM";
        System.out.println(reverse(str));
    }
    private static String reverse(String str){
        if (str.isEmpty()) {
            return str;
        }
        // recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }
/*str.substring(1) → everything except the first character

Call reverse on it → recursively reverse the rest of the string

Add str.charAt(0) → the first character at the end

return reverse(str.substring(1)) + str.charAt(0);

Step 3: Dry run with "madam"

Input: "madam"
reverse("madam") = reverse("adam") + 'm'

Input: "adam"
reverse("adam") = reverse("dam") + 'a'

Input: "dam"
reverse("dam") = reverse("am") + 'd'

Input: "am"
reverse("am") = reverse("m") + 'a'

Input: "m"
reverse("m") = reverse("") + 'm'

Input: "" → base case
returns ""
* */
}

/*public class ReverseString {
    public static void main(String[] args) {
        String str = "madam";
        char[] arr = str.toCharArray();
        reverse(arr, 0, arr.length - 1);
        System.out.println(new String(arr));
    }

    private static void reverse(char[] arr, int start, int end) {
        // base case
        if (start >= end) {
            return;
        }
        // swap characters
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverse(arr, start + 1, end - 1);
    }
}
*/
