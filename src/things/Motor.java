package things;

public class Motor {
    private final String name;
    protected int power;

    public Motor(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public void voice() {
        if (this.power > 200) {
            System.out.println(this.name + " загудел. ");
        }
        else {
            System.out.println(this.name + " не смог завестись. ");
        }

    }
}
