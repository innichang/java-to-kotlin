package section2.lec08;

public class FunctionJava {
    public int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public void repeat(String str, int num, boolean useNewLine) {
        for (int i = 1; i <= num; i++) {
            if (useNewLine) {
                System.out.println(str);
            } else {
                System.out.print(str);
            }
        }
    }

    public void repeat(String str, int num) {
        repeat(str, num, true);
    }

    public void repeat(String str) {
        repeat(str, 3, true);
    }

    //가변 인자(같은 타입의 여러 파라미터 받기)
    public static void printAll(String... strings) {
        for(String str : strings) {
            System.out.println(str);
        }
    }
}