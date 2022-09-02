
public class Cat {
    private String name;
    public int age;

    private double poops = 10.0;

    public Cat(String name) {
        this.name = name;
        age = 0;

        System.out.println("Your cat's name is: " + name);
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Your cat's name is: " + name + " and " + "it's " + age + " years old");
    }

    public void eat(int numMeals) {
        if (numMeals > 5) {
            System.out.println("Your cat is going to get fat bruh");
        } else {
            System.out.println("Nom nom yum");
        }
    }
    /**
     * peee pee poop poo onichaan meow meow uwu- raymond
     * @return
     */
    public void meow() {
        System.out.println("MEOW ~ Raymond");
    }

    public void meow(boolean isLoud) {
        if (isLoud) {
            System.out.println("MEOW");
        } else {
            System.out.println("meow");
        }
    }


    public double poop() {
        poops--;
        return poops;
    }

    public boolean hasIntestinalWorms() {
        return poops < 0;
    }

    public int getAge() {
        return age;
    }
}
