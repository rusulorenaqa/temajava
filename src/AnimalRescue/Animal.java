package AnimalRescue;

public abstract class Animal {
    private String name;
    private int age;
    private int health;
    private int hunger;
    private int joy;
    private Food favoriteFood;
    private Activity favoriteActivity;

    public void executeActivity() {
        System.out.println("Animalul numit " + this.name + " executa activitatea " +
                this.favoriteActivity.getName());
        joy = joy + 1;
        System.out.println("Noul nivel de joy pentru " + this.name + " este: " + joy);
    }

    public void eatFood() {
        System.out.println("Animalul " + this.name + " mananca.");
        hunger = hunger - 1;
        favoriteFood.setQuantity(favoriteFood.getQuantity() - 1);
        System.out.println("Noul nivel de hunger al animalului " + this.name + " este: " + hunger);
        System.out.println("Cantitatea de mancare ramasa pentru " + this.name +
                " este: " + favoriteFood.getQuantity());
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    public int getHunger() {
        return hunger;
    }

    public int getJoy() {
        return joy;
    }

    public Food getFavoriteFood() {
        return favoriteFood;
    }

    public Activity getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public void setJoy(int joy) {
        this.joy = joy;
    }

    public void setFavoriteFood(Food favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public void setFavoriteActivity(Activity favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }

    public abstract void speak();

    public abstract void numberOfLegs();

    public abstract void swim();

}
