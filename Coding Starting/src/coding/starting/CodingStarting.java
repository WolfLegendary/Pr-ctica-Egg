package coding.starting;

/**
 *
 * @author Wolf Legendary
 */
public class CodingStarting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ejemplo de uso
        String[] words1 = {"racecar", "noon", "civic"};
        String[] words2 = {"racecar", "shoe", "moon"};

        System.out.println("Palabras 1: " + checkAllPalindromes(words1)); // Debería imprimir true
        System.out.println("Palabras 2: " + checkAllPalindromes(words2)); // Debería imprimir false
    }

    public static String reverseWord(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String word) {
        return word.equals(reverseWord(word));
    }

    public static boolean checkAllPalindromes(String[] arr) {
        for (String word : arr) {
            if (!isPalindrome(word)) {
                return false;
            }
        }
        return true;
    }

}
