public class Cat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void Greet() {
        System.out.printf("Мяу! Меня зовут " + getName() + ". Мне " + getAge() + " года(лет)");
    }
}