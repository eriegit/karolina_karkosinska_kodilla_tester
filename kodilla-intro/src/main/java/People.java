public class People {
    public static void main(String[] args) {

        Application person1 = new Application("Adam", 40.5, 178.0);
        System.out.println("Person 1 " + person1.name + " " + person1.age + " years old, " + person1.height + " cm");
        person1.checkAgeHeight();

        Application person2 = new Application("Basia", 32, 157.0);
        System.out.println("Person 2 " + person2.name + " " + person2.age + " years old, " + person2.height + " cm");
        person2.checkAgeHeight();

        Application person3 = new Application("Czarek", 14.5, 170.0);
        System.out.println("Person 3 " + person3.name + " " + person3.age + " years old, " + person3.height + " cm");
        person3.checkAgeHeight();


    }
}
