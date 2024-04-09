package section4.lec15;

public class JavaArray {
    public static void main(String[] args) {
        int[] array = {100, 200};

        for(int i = 0; i<array.length; i++) {
            System.out.printf("%s %s ", i, array[i]);
        }
    }
}
