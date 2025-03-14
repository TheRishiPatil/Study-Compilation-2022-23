public class Caesar_Cipher_Encryptor{
    public static String caesarCypherEncryptor(String str, int key) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            char newChar = (char) ((curr - 'a' + key) % 26 + 'a'); 
            newStr += newChar;
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "z";
        System.out.println(caesarCypherEncryptor(str, 2));
    }
}
