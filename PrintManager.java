package logico;

public class PrintManager {
    public static void main(String[] args) {
        PrintService printService = new PrintService();

        // simulacion de envio de trabajos
        printService.submitJob("Jostin", "M");
        printService.submitJob("Maria", "H");  // aalta prioridad
        printService.submitJob("Jose", null);   // prioridad por defecto (Media)
        printService.submitJob("Juan", "L"); // baja prioridad
        printService.submitJob("Rafael", "M");
        printService.submitJob("Javier", "H");

        // procesar los trabajos
        printService.processJobs();
    }
}
