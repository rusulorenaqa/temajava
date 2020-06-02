package AnimalRescue;

public class AnimalRescueMain {

    public static void main(String[] args) {
        Activity activity1 = new Activity();
        activity1.setName("eat");


        Activity activity2 = new Activity();
        activity2.setName("play");
        System.out.println(activity1.getName());
        System.out.println(activity2.getName());

        Rescuer rescuer1 = new Rescuer();
        rescuer1.setName("Ion Popescu");
        rescuer1.setMoney(500);


        Rescuer rescuer2 = new Rescuer();
        rescuer2.setName("Florin Pavel");
        rescuer2.setMoney(1400);
        System.out.println(rescuer1.getName() + " " + rescuer1.getMoney());
        System.out.println(rescuer2.getName() + " " + rescuer2.getMoney());


        Medic medic1 = new Medic();
        medic1.setName("Alexandru George");
        medic1.setSpeciality("Dentist");


        Medic medic2 = new Medic();
        medic2.setName("Andrei Tudor");
        medic2.setSpeciality("Oftalmolog");
        System.out.println(medic1.getName() + " " + medic1.getSpeciality());
        System.out.println(medic2.getName() + " " + medic2.getSpeciality());


        Food food1 = new Food();
        food1.setName("Cereals");
        food1.setPrice(20);
        food1.setQuantity(2);
        food1.setStock(15);


        Food food2 = new Food();
        food2.setName("Meat");
        food2.setPrice(35);
        food2.setQuantity(4);
        food2.setStock(3);
        System.out.println(food1.getName() + " " + food1.getPrice() + " " + food1.getQuantity() + " " + food1.getStock());
        System.out.println(food2.getName() + " " + food2.getPrice() + " " + food2.getQuantity() + " " + food2.getStock());


        Dog dog = new Dog();
        dog.setName("Rex");
        dog.setAge(3);
        dog.setHealth(4);
        dog.setHunger(3);
        dog.setJoy(6);
        dog.setFavoriteActivity(activity1);
        dog.setFavoriteFood(food1);


        Cat cat = new Cat();
        cat.setName("Ema");
        cat.setAge(15);
        cat.setHealth(7);
        cat.setHunger(4);
        cat.setJoy(4);
        cat.setFavoriteFood(food2);
        cat.setFavoriteActivity(activity2);

        System.out.println(dog.getName() + " " + dog.getAge() + " " + dog.getHealth() + " " + dog.getHunger() + " " + dog.getJoy()
                + " " + dog.getFavoriteFood().getName() + " " + dog.getFavoriteActivity().getName());
        System.out.println("Mancarea preferata a lui Rex este: " + dog.getFavoriteFood().getName());
        System.out.println("Cantitatea de mancare a lui Rex este: " + dog.getFavoriteFood().getQuantity());
        System.out.println(cat.getName() + " " + cat.getAge() + " " + cat.getHealth() + " " + cat.getHunger() + " " + cat.getJoy()
                + " " + cat.getFavoriteFood().getName() + " " + cat.getFavoriteActivity().getName());
        dog.executeActivity();
        cat.executeActivity();
        dog.eatFood();
        cat.eatFood();

        Duck duck = new Duck();
        duck.setName("Donald");
        duck.setFavoriteActivity(activity2);
        duck.fly();
        duck.eatFood();
        duck.executeActivity();

        medic1.doJob();
        rescuer1.doJob();
        cat.speak();
        cat.swim();
        cat.numberOfLegs();
        dog.speak();
        dog.swim();
        dog.numberOfLegs();
        duck.swim();
        duck.speak();
        duck.numberOfLegs();
    }
}
