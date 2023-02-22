/**
 * Progettare e realizzare una classe Car con le seguenti proprietà.
 * - Un automobile ha una determinata resa del carburante (determinata in miglia/gallone o chilometri/litro) e
 * una certa quantità di carburante nel serbatoio.
 * - La resa è specificata dal costruttore e i il livello iniziale del carburante è a zero.
 *
 * Fornire questi metodi:
 * - un metodo Drive per simulare il percorso di un'automobile per una certa distanza, riducendo il livello
 * del carburante nel serbatoio.
 * - un metodo getGas per ispezionare il livello del carburante.
 * - un metodo addGas per fare rifornimento
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Gestione Automobile");

        // Passa il consumo dell'auto in chilometri al litro
        Car automobile1 = new Car(9);

        // Aggiungi carburante
        automobile1.addGas(30.0);

        // Immetti i chilometri da percorrere
        double kmDaPercorrere = 200.0;

        // Calcola quanti litri di carburante saranno consumati
        double litriConsumati = kmDaPercorrere / automobile1.getResa();

        // Guida l'auto
        automobile1.drive(kmDaPercorrere);

        // Stampa il livello di carburante rimanente
        System.out.println();
        System.out.println("Livello di carburante attuale: " + automobile1.getGas() + " litri");
    }
}