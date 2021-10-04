package HomeWork6;

public class Cat extends Animal{

    public Cat() {
        super();
    }

    public void catRun() {
        if(runWay <= 200) {
            System.out.println("Кот пробежит " + runWay);
        } else {
            System.out.println("Кот не может столько пробежать!");
        }
    }

    public void catSwim() {
        System.out.println("Кот не умеет плавать");
    }
}
