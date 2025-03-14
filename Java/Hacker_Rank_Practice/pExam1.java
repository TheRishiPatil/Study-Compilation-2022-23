public class pExam1 {
    public static void main(String[] args) {
        String Name = "abyz";
        int count = 0;

        do {
            for (int j = 0; j < Name.length(); j++) {
                Name = Name.substring(Name.charAt(j));
                count++;
            }
        } while (true);
    }

    public static String transformation(String Name) {
        Name = Name.toLowerCase();
        for (int i = 0; i < Name.length(); i++) {
            if (Name.charAt(i) == 'z') {
                Name = Name.replaceAll("z", "ab");
                return Name;
            } else {
                StringBuilder sb = new StringBuilder();
                for (char c : Name.toCharArray()) {
                    sb.append(++c);
                }
                return sb.toString();
            }
        }
        return Name;
    }
}
