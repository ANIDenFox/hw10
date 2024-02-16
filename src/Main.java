public class Main {
    public static void main(String[] args) {
        String str = "hello world";
        String str1 = "abracadabra";

        String reversed = reverseString(str);
        System.out.println(reversed);

        int vowelCount = countVowels(str);
        System.out.println(vowelCount);

        boolean isPal = isPal(str);
        System.out.println(isPal);


        String withoutDuplicates = removeDuplicates(str1);
        System.out.println(withoutDuplicates);

        splitString(str);

    }
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static boolean isPal(String str) {
        if (str.length() <= 1) {
            return true;
        }
        return str.charAt(0) == str.charAt(str.length() - 1) && isPal(str.substring(1, str.length() - 1));
    }
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplc = false;
            for (int j = 0; j < i; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplc = true;
                    break;
                }
            }
            if (!isDuplc) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void splitString(String str) {
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
    }

}