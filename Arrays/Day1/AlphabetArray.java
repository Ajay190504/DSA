public class AlphabetArray {
    public static void main(String[] args) {

        char[] arr = new char[26];

         //Way 1
        for (int i = 0; i < 26; i++) {
            arr[i] = (char) ('a' + i);  // 97+i for small letters and 65+i for capital letters
        }

        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}