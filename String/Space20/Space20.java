class Space20 {

    public static void spaceReplace(String s, String r) {

        int len = r.length();
        int spaces = 0;
        int newlen = 0;
        char[] array;

        if (len > 1) {
            // find out how many spaces
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    spaces += 1;
                }
            }

            // calculate how many more reqiured
            newlen = s.length() + (3 * spaces);
            array = new char[newlen + 1];

            // replace
            for (int i = s.length() - 1; i >= 0; i--) {
                if (s.charAt(i) == ' ') {
                    array[newlen] = 0;
                    array[newlen - 1] = 2;
                    array[newlen - 2] = '%';
                    newlen = newlen - 3;
                }
                if (s.charAt(i) != ' ') {
                    array[newlen] = s.charAt(i);
                    newlen--;
                }
            }
            System.out.println(array);
        }
    }

    public static void main(String args[]) {
        String s = "Hello World,  How are you?";
        spaceReplace(s, "%20");
    }

}