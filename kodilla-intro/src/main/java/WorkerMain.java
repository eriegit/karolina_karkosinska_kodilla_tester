public class WorkerMain {
    public static Worker[] workers = new Worker[10];
    public static int pointer = 0;


    public static void addWorker (Worker worker){
        if (pointer == 10) {
            return;
        }
        workers[pointer++] = worker;
    }

    public static double calculateAverageWorkerAge() {
        double sum = 0;
        for (int i = 0; i < pointer; i++) {
            sum = sum + workers[i].workerAge;
        }
        System.out.println("average worker age is: " + sum + "/ pointer  " + pointer);
// chcę zobaczyć jak działa obliczanie i wynik
        System.out.println("giving result: " + ( sum / pointer));
        return sum / pointer;
    }
    public static void printNamesOfWorkersYoungerThanAverageAge(double averageWorkerAge) {
        for (int i = 0; i < pointer; i++) {
            if (workers[i].workerAge < averageWorkerAge) {
                System.out.println("Workers younger than average worker age: " + workers[i].workerName);
            }
        }
    }


    public static void main(String[] args) {


        Worker worker1 = new Worker("Adam", 13);
        addWorker(worker1);
        Worker worker2 = new Worker("Barbara", 27);
        addWorker(worker2);
        Worker worker3 = new Worker("Cyprian", 43);
        addWorker(worker3);
        Worker worker4 = new Worker("Daniela", 7);
        addWorker(worker4);
        Worker worker5 = new Worker("Ewa", 56);
        addWorker(worker5);
        Worker worker6 = new Worker("Filip", 78);
        addWorker(worker6);
        Worker worker7 = new Worker("Nora", 11);
        addWorker(worker7);
        Worker worker8 = new Worker("Sylwia", 27);
        addWorker(worker8);
        Worker worker9 = new Worker("Jacek", 35);
        addWorker(worker9);

        double averageWorkerAge = calculateAverageWorkerAge();

        // !!!! tutaj zmiennej averageWorkerAge przypisujemy wynik dzialania metody calculateAverage...

        printNamesOfWorkersYoungerThanAverageAge(averageWorkerAge);

        // !!!! tutaj wywołujemy metodę printNamesOf... której zmienną jest averageWorkerAge
    }
}



