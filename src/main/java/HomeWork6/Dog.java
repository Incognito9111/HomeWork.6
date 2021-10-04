package HomeWork6;

public class Dog extends Animal{

    public Dog () {
        super();
    }

    public void dogRun() {
        if(runWay <= 500) {
            System.out.println("Собака пробежит " + runWay);
        } else {
            System.out.println("Собака не может столько пробежать!");
        }
    }

    public void dogSwim() {
        if(swimWay <= 10) {
            System.out.println("Собака проплывет " + swimWay);
        } else {
            System.out.println("Собака столько не проплывет!");
        }
    }



}
