public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
                }
        public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price < 1000) {
        System.out.println("The price is good.");
          } else {
            System.out.println("This notebook is expensive.");
            }
        }
        public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println ("This notebook is light.");
        } else if (this.weight > 1000 && this.weight < 1500) {
            System.out.println("This notebook is quite heavy.");
        } else {
            System.out.println("This notebook is very heavy.");
        }
        }
        public void checkYearPrice() {
        if (this.year < 2020 && this.price < 1000) {
            System.out.println("This is a good deal.");
        } else if (this.year > 2020 && this.price < 2000) {
            System.out.println("This is a quite good offer.");
        }else if (this.year > 2019 && this.price < 2500){
            System.out.println("This is not a bad deal.");
        } else {
            System.out.println("Continue searching for a better deal.");
        }

        }

    }
