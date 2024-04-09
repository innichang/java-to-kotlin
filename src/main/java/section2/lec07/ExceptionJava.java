package section2.lec07;

import org.jetbrains.annotations.NotNull;

import java.io.*;
import java.nio.Buffer;

public class ExceptionJava {
    public static void main(String[] args) throws IOException {
        readFile();
    }

    private static int parseIntOrThrow(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("주어진 %str은 숫자가 아닙니다");
        }
    }

    private static Integer parseIntOrNull(@NotNull String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static void readFile() throws IOException {
        File currentFile = new File(".");
        File file = new File(currentFile.getAbsoluteFile() + "/a.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        System.out.println(reader.readLine());
        reader.close();
    }
    
    public void readFile(String path) throws IOException {
        //try괄호 안에 리더를 통해 파일리더를 통해 내용을 받아온다.
        //괄호 안에 외부 자원을 만들어주고
        //try가 끝나면 자동으로 외부 자원을 닫아주는 try with resources 구문이다.
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println(reader.readLine());
        }
    }
}
