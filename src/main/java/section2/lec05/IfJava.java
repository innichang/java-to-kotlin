package section2.lec05;

public class IfJava {

    public static void main(String[] args) {
    }

    public static void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalArgumentException("%s cannot be smaller than 0");
        }
    }

    public static String getPassOrFail(int score) {
        if (score > 50) {
            return "P";
        }
        return "F";
    }

    public static String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9:
                return "A";
            case 8:
                return "B";
            case 7:
                return "C";
            case 6:
                return "D";
            default:
                return "F";
        }
    }

    private boolean startsWithA(Object obj) {
        if(obj instanceof String) {
            return ((String) obj).startsWith("A");
        } else {
            return false;
        }
    }

}
