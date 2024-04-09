package section3.lec12;

public class Lec12Main {
    public static void main(String[] args) {
        Person.Factory.newBaby("ABC");
        //companion object 명이 없을 경우 'Companion'으로 쓸 수 있다.


        //코틀린쪽에 @JvmStatic을 사용하면 바로 사용가능
        Person.newBaby("Inseok");
    }
}
