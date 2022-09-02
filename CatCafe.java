public class CatCafe {

    public static void feeds(Cat cat1, Cat cat2, int meals) {
        for (int i = 0; i < 30; i++) {
            cat1.eat(meals);
            cat2.eat(meals);
        }
    }

    public static void main(String[] args) {
        Cat bubbles = new Cat("Bubbles", 17);
        Cat oreo = new Cat("Oreo");
        Cat eunchan = new Cat("Eunchan", 2);

        Siamese thing = new Siamese("Tihg");
        thing.eat(3);

        bubbles.eat(100);
        oreo.eat(0);
        eunchan.eat(6);

        oreo.meow();
        bubbles.meow(true);

        bubbles.poop();

        for (int i = 0; i < 30; i++) {
            oreo.poop();
        }

        boolean oreoWorms = oreo.hasIntestinalWorms();
        System.out.println("oreo has intestinal worms: " + oreoWorms);

        feeds(bubbles, oreo, 5);
    }
}
