package Assignment_02;


class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int calculatePersonYears() {
        return age * 7;
    }

    @Override
    public String toString() {
        return "Dog(name='" + name + "', age=" + age + ", person_years="
                + this.calculatePersonYears() + ')';
    }
}


public class Kennel {
    public static void main(String[] args) {
        Dog dog_1 = new Dog("Max", 1);
        Dog dog_2 = new Dog("Dan", 2);
        Dog dog_3 = new Dog("Joe", 3);

        System.out.println("Dog 1: " + dog_1);
        System.out.println("Dog 2: " + dog_2);
        System.out.println("Dog 3: " + dog_3);

        dog_1.setAge(4);
        dog_2.setName("Charlie");
        dog_3.setAge(3);

        System.out.println("\nUpdated Dog Information:");
        System.out.println("Dog 1: " + dog_1);
        System.out.println("Dog 2: " + dog_2);
        System.out.println("Dog 3: " + dog_3);
    }
}
