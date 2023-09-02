package factory_method;



public class Main {
    public static void main(String[] args) {
       Animal animal = Animal_Factory.createAnimal(Animal_Factory.Animal_Type.DOG);
        animal.getInfo();

    }
}
