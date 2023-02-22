public class Car {
    private double resa;
    private double levelGas;

    public Car(double resa) {
        this.resa = resa;
        this.levelGas = 0.0;
    }

    public void addGas(double amount) {
        levelGas += amount;
        System.out.println("Rifornimento di " + amount + " litri di carburante.");
    }

    public void drive(double km) {
        double litriConsumati = km / resa;
        if (levelGas >= litriConsumati) {
            System.out.print("Hai guidato per: " + km + " km. " + "Hai consumato : " +
                    String.format("%.2f", litriConsumati) + " litri");
            levelGas -= litriConsumati;
        } else {
            System.out.println("Non c'è abbastanza carburante per percorrere questa distanza!");
            return;
        }
    }

    public double getGas() {
        return Math.round(levelGas * 100.0) / 100.0;
    }

    public double getResa() {
        return resa;
    }
}