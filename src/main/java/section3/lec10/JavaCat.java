package section3.lec10;

import section3.lec10.JavaAnimal;

public class JavaCat extends JavaAnimal {
    public JavaCat(String species) {
        super(species, 4);
    }
    @Override
    public void move() {
        System.out.println("고양이가 걸어가~");
    }
}
