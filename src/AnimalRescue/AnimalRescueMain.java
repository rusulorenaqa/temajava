package AnimalRescue;

public class AnimalRescueMain {

    public static void main(String[] args) {
        Activity activity1 = new Activity();
        activity1.name = "eat";
        Activity activity2 = new Activity();
        activity2.name = "play";
        System.out.println(activity1.name);
        System.out.println(activity2.name);

        Rescuer rescuer1 = new Rescuer();
        rescuer1.name = "Ion Popescu";
        rescuer1.money = 500;
        Rescuer rescuer2 = new Rescuer();
        rescuer2.name = "Florin Pavel";
        rescuer2.money = 1400;
        System.out.println(rescuer1.name + " " + rescuer1.money);
        System.out.println(rescuer2.name + " " + rescuer2.money);


        Medic medic1 = new Medic();
        medic1.name = "Alexandru George";
        medic1.speciality = "Dentist";
        Medic medic2 = new Medic();
        medic2.name = "Andrei Tudor";
        medic2.speciality = "Oftalmolog";
        System.out.println(medic1.name + " " + medic1.speciality);
        System.out.println(medic2.name + " " + medic2.speciality);


        Food food1 = new Food();
        food1.name = "Cereals";
        food1.price = 20;
        food1.quantity = 2;
        food1.stock = 15;
        Food food2 = new Food();
        food2.name = "Meat";
        food2.price = 35;
        food2.quantity = 6;
        food2.stock = 9;
        System.out.println(food1.name + " " + food1.price + " " + food1.quantity + " " + food1.stock);
        System.out.println(food2.name + " " + food2.price + " " + food2.quantity + " " + food2.stock);


        Animal dog = new Animal();
        dog.name = "Rex";
        dog.age = 3;
        dog.health = 4;
        dog.hunger = 3;
        dog.joy = 2;
        dog.favoriteActivity = activity1;
        dog.favoriteFood = food1;
        Animal cat = new Animal();
        cat.name = "Ema";
        cat.age = 15;
        cat.health = 8;
        cat.hunger = 4;
        cat.joy = 6;
        cat.favoriteFood = food2;
        cat.favoriteActivity = activity2;

        System.out.println(dog.name + " " + dog.age + " " + dog.health + " " + dog.hunger + " " + dog.joy
                + " " + dog.favoriteFood.name + " " + dog.favoriteActivity.name);
        System.out.println("Mancarea preferata a lui Rex este: " + dog.favoriteFood.name);
        System.out.println("Cantitatea de mancare a lui Rex este: " + dog.favoriteFood.quantity);
        System.out.println(cat.name + " " + cat.age + " " + cat.health + " " + cat.hunger + " " + cat.joy
                + " " + cat.favoriteFood.name + " " + cat.favoriteActivity.name);
        dog.executeActivity();
        cat.executeActivity();
        dog.eatFood();
        cat.eatFood();
    }
}
