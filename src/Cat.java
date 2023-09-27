public class Cat extends Animal{

    Cat(double weight) {
        super(weight);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                '}';
    }

    @Override
    void say() {
        System.out.println(this + ":  мррр-мяу");
    }
}
