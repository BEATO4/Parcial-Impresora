package logico;

import java.util.PriorityQueue;

public class PrintQueue {
    private PriorityQueue<PrintJob> queue;

    public PrintQueue() {
        // La cola utiliza el metodo comparcion de PrintJob para ordenar los trabajos.
        this.queue = new PriorityQueue<>();
    }

    // agregar un trabajo de impresion a cola
    public void addJob(PrintJob job) {
        queue.offer(job);
    }

    // Obtener y eliminar el siguiente trabajo en la cola
    public PrintJob getNextJob() {
        return queue.poll(); // quita y devuelve el trabajo con mayor prioridad
    }

    // verificar si la cola esta vacia
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
