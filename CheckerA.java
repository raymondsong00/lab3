public class CheckerA implements StringChecker {
    public boolean checkString(String s) {
        if (s.contains("a")) {
            return true;
        }
        else {
            return false;
        }
    }
}
