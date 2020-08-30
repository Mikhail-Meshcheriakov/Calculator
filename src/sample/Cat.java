package sample;

public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Cat setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Cat setAge(int age) {
        this.age = age;
        return this;
    }

    public void voice() {
        System.out.println("Meof");
    }
}
