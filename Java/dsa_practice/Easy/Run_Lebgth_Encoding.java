public class Run_Lebgth_Encoding {
  public static String runLengthEncoding(String str) {
        if (str.length() == 0) {
            return "";
        }
        StringBuilder newStr = new StringBuilder();
        char imp = str.charAt(0);
        int j = 1;
        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);

            if (j >= 9 || curr != imp) {
                newStr.append(j);
                newStr.append(imp);
                j = 0;
            }
            if (curr != imp) {
                imp = curr;
                j = 1;
            } else{
                j++;
            }
        }

        newStr.append(j);
        newStr.append(imp);
        return newStr.toString();
  }

    public static void main(String[] args) {
        String str = "aA";
        System.out.println(runLengthEncoding(str));
    }
}
