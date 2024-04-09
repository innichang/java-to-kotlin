package section3.lec12;

public class JavaSingleton {
    /*
    단 하나의 인스턴스만을 갖는 클래스를 Singleton이라고 한다
     */

    private static final JavaSingleton INSTANCE = new JavaSingleton();

    private JavaSingleton() {}

    public static JavaSingleton getInstance() {
        return INSTANCE;
    }
}
