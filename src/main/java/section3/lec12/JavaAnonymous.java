package section3.lec12;

public class JavaAnonymous {
    public static void main(String[] args) {
        moveSomething(new Movable() {
            @Override
            public void move() { System.out.println("움직인다~~");}
            @Override
            public void fly() { System.out.println("날아간다~~");}
        });
    }

    public static void moveSomething(Movable movable) {
        movable.move();
        movable.fly();
    }
}


class Movable {
    public void move() {}
    
    public void fly() {}
}