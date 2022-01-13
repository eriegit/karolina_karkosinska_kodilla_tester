public class FirstClass {
    public static void main(String[] args) {

        Notebook notebook = new Notebook(600, 1000, 2020);
        System.out.println(notebook.weight + " g" + " " + notebook.price + " pln" + " " +  notebook.year + " r.");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYearPrice();

        Notebook heavyNotebook = new Notebook(2000, 1500, 2019);
        System.out.println(heavyNotebook.weight + " g" +  " " + heavyNotebook.price + " pln" + " " +  heavyNotebook.year + " r.");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYearPrice();

        Notebook oldNotebook = new Notebook(1200, 500, 2018);
        System.out.println(oldNotebook.weight + " g" + " " + oldNotebook.price + " pln" + " " +  oldNotebook.year + " r.");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYearPrice();

        Notebook newNotebook = new Notebook(1300, 1200, 2021);
        System.out.println(newNotebook.weight + " g" + " " + newNotebook.price + " pln" + " " +  newNotebook.year + " r.");
        newNotebook.checkPrice();
        newNotebook.checkWeight();
        newNotebook.checkYearPrice();


    }
}
