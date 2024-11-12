package animal;

import animal.Human;

public class Review04 {

    public static void main(String[] args) {
        Human human01 = new Human("田中 太郎", 25, "電車");
        Human human02 = new Human("鈴木 次郎", 30, "野球");
        Human human03 = new Human("佐藤 花子", 20, "映画");

        human01.say();
        human01.think();
        human02.say();
        human02.think();
        human03.say();
        human03.think();

    }

}
