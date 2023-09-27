public class Mouse extends Animal{

    Mouse(double weight) {
        super(weight);
    }

    @Override
    void say() {
        System.out.println(this + ":  пи-пи-пи");
    }

    @Override
    public String toString() {
        return "Mouse{" +
                "weight=" + weight +
                '}';
    }
}
