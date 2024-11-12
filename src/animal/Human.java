package animal;

import animal.Thinkable;

public class Human extends Animal implements Thinkable{
    // field
    private String hobby;

    public Human() {
    }

    public Human(String name, int age, String hobby) {
        super(name,age);
        this.hobby = hobby;
    }

    @Override
    public void think() {
        System.out.println("私は" + this.hobby + "について考えています。");
    }

}
