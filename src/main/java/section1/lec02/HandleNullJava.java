package section1.lec02;

public class HandleNullJava {
    public boolean startsWithA1(String str) {
        if(str == null) {
            throw new IllegalArgumentException("str is null");
        }

        return str.startsWith("A");
    }

    public Boolean startsWithA2(String str) {
        if(str == null) {
            return null;
        }

        return str. startsWith("A");
    }

    public boolean startsWithA3(String str) {
        if(str == null) {
            return false;
        }

        return str.startsWith("A");
    }
}
