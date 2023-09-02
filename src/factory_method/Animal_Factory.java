package factory_method;

public class Animal_Factory {
        public enum Animal_Type{
            CAT,
            DOG
        }
        public static Animal createAnimal(Animal_Type animalType){
            switch (animalType){
                case CAT : {
                    return new Cat();
                }
                case DOG : {
                    return new Dog();
                }

            }
            return null;

        }
}
