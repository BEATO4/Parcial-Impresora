package logico;

public class PrintManager {
    public static void main(String[] args) {
        PrintService printService = new PrintService();

        // simulacion de envio de trabajos
        printService.submitJob("Alice", "H");  // aalta prioridad
        printService.submitJob("Bob", null);   // prioridad por defecto (Media)
        printService.submitJob("Charlie", "L"); // baja prioridad

        // procesar los trabajos
        printService.processJobs();
    }
}
