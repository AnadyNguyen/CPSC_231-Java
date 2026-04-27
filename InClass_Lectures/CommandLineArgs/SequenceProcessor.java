public class SequenceProcessor {
    public static int process(String[] data) {
        int count = 0;
        for (String s : data) {
            if (s != null && !s.trim().isEmpty()) {
                count++;
            }
        }
        return count;
    }
    public static String transform(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append("*");
            } else {
                sb.append(Character.toUpperCase(c));
            }
        }
        return sb.toString();
    }
    public static boolean validate(String[] sequence, int minLength) {
        for (String s : sequence) {
            if (s == null || s.length() < minLength) {
                return false;
            }
        }
        return true;
    }
    public static int compare(String[] a, String[] b) {
        int matches = 0;
        int len = Math.min(a.length, b.length);
        for (int i = 0; i < len; i++) {
            if (a[i] != null && a[i].equalsIgnoreCase(b[i])) {
                matches++;
            }
        }
        return matches;
    }
}

