package logico;

import java.time.LocalDateTime;

public class PrintService {
    private PrintQueue printQueue;

    public PrintService() {
        this.printQueue = new PrintQueue();
    }

    // agregar un trabajo de impresion
    public void submitJob(String userName, String priority) {
        PrintJob job = new PrintJob(userName, LocalDateTime.now(), priority);
        printQueue.addJob(job);
        System.out.println("Trabajo añadido: " + job);
    }

    // procesar trabajos de impresion en la cola
    public void processJobs() {
        System.out.println("Procesando trabajos de impresión...");
        while (!printQueue.isEmpty()) {
            PrintJob nextJob = printQueue.getNextJob();
            System.out.println("Imprimiendo: " + nextJob);
            try {
                // simular el tiempo de prosesamiento
                Thread.sleep(1000); // 1 (1000) segundo por trabajo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Todos los trabajos han sido procesados.");
    }
}
