package core.basesyntax.model;

public class Cat {
    private int age;
    private String name;
    private String ownerName;

    public Cat() {

    }

    @Override
    public String toString() {
        return "Cat{"
                + "age=" + this.age
                + ", name='" + this.name + '\''
                + ", ownerName='" + this.ownerName + '\''
                + '}';
    }
}
