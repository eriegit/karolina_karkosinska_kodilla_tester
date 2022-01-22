public class UserMain {
    public static void main(String[] args) {
        User user1 = new User("Adam", 13);
        addUser(user1);
        User user2 = new User("Barbara", 27);
        addUser(user2);
        User user3 = new User("Cyprian", 43);
        addUser(user3);
        User user4 = new User("Daniela", 7);
        addUser(user4);
        User user5 = new User("Ewa", 56);
        addUser(user5);
        User user6 = new User("Filip", 78);
        addUser(user6);
        User user7 = new User("Nora", 11);
        addUser(user7);
        User user8 = new User("Sylwia", 27);
        addUser(user8);
        User user9 = new User("Jacek", 35);
        addUser(user9);
        double averageAge = getAverageAge();
        System.out.println("Names of users younger than the average users' age: ");
        printNamesOfUsersYoungerThanAverageAge(averageAge);
    }

    private static User[] users = new User[10];
    private static int pointer = 0;

    public static void addUser(User user) {
        if (pointer == 10) {
            return;
        }
        users[pointer++] = user;
    }

    public static double getAverageAge() {
        double sum = 0;
        for (int i = 0; i < pointer; i++) {
            sum = sum + users[i].age;
        }
//        System.out.println("sum: " + sum + " pointer " + pointer);
        return sum / pointer;

    }

    public static void printNamesOfUsersYoungerThanAverageAge(double averageAge) {
        for (int i = 0; i < pointer; i++) {
            if (users[i].age < averageAge) {
                System.out.println(users[i].name);
            }
        }
    }
}