
public class Car {

    int maxSpeed = 120;
    int minSpeed = 10;
    double weight = 1000;
    boolean isTheCarON = false;
    String license = "ABC-123";
    char condition = 'A';
    double currentPrice = 3000;
    int mileagePassed = 50000;

    String model;
    int maxFuel;
    int currentFuel;
    int Consumption;
    int distance;
    int currentPassengers;
    int maxPassengers;

    public Car() {

        this.model = "default";
        this.currentFuel = 0;
        this.maxFuel = 100;
        this.currentPassengers = 1;
        this.maxPassengers = 5;

    }

    public Car(int maxSpeed, int minSpeed, double weight, boolean isTheCarOn, String license, char condition, double currentPrice,
            int mileagePassed) {

        this.maxSpeed = maxSpeed;
        this.minSpeed = minSpeed;
        this.weight = weight;
        this.isTheCarON = isTheCarOn;
        this.license = license;
        this.condition = condition;
        this.currentPrice = currentPrice;
        this.mileagePassed = mileagePassed;

    }

    public void printMainAttributes() {
        System.out.println("Model: " + this.model);
        System.out.println("Kapacitet rezervoara: " + this.maxFuel);

        System.out.println("Trenutno gorivo: " + this.currentFuel);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);
        System.out.println("Trenutni broj putnika : " + this.currentPassengers + ",maksimalno: " + this.maxPassengers);
        System.out.println();

    }

    public void printAttributes() {
        System.out.println("Maksimalna brzina je: " + this.maxSpeed);
        System.out.println("Minimalna brzina je: " + this.minSpeed);
        System.out.println("Registracioni broj je: " + this.license);
        System.out.println("Tezina je: " + this.weight);
        System.out.println("Trenutna cena: " + this.currentPrice);
        System.out.println("Predjena kilometraza: " + this.mileagePassed);

    }

    public void changeModel(String customModel) {
        this.model = customModel;

    }

    public void ChangeMaxFuel(int customMaxFuel) {

        this.maxFuel = customMaxFuel;

    }

    public void fuelUp() {

        this.currentFuel = this.maxFuel;

    }

    public void changeConsumption(int customConsumption) {

        this.Consumption = customConsumption;
    }

    public void travel(int distance) {

        if (this.currentFuel > distance * this.Consumption) {
            this.mileagePassed = this.mileagePassed + distance;
            this.currentFuel = this.currentFuel - distance * this.Consumption;
            System.out.println("putovali ste:" + distance);
        } else {
            System.out.println("Nema dovoljno goriva");

        }

    }

    public void getIn() {
        if (this.currentPassengers < this.maxPassengers) {

            this.currentPassengers = this.currentPassengers + 1;
            System.out.println("Neko je usao u auto");

        } else {
            System.out.println("U automobilu nema mesta");
        }
    }

    public void getOut() {
        if (this.currentPassengers > 0) {
            this.currentPassengers = this.currentPassengers - 1;
            System.out.println("Neko je izasao iz automobila");
        } else {
            System.out.println("Automobil je prazan");
        }
    }

    public void getIn(int numberOfPassengers) {
        if (this.currentPassengers + numberOfPassengers > this.maxPassengers) {
            System.out.println("Nema dovoljno mesta u autu");
        } else {
            this.currentPassengers = this.currentPassengers + numberOfPassengers;
            System.out.println("Broj putnika u autu je: " + this.currentPassengers);
        }
    }

    public void getOut(int numberOfPassengers) {
        if (this.currentPassengers - numberOfPassengers > 0) {
            this.currentPassengers = this.currentPassengers - numberOfPassengers;
            System.out.println("Broj putnika u autu je: " + this.currentPassengers);
        } else {
            System.out.println("Automobil je prazan");
        }

    }
}
