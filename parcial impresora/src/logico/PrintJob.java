package logico;

import java.time.LocalDateTime;

public class PrintJob implements Comparable<PrintJob> {
    private String userName;
    private LocalDateTime timestamp;
    private String priority;

    // Constructor
    public PrintJob(String userName, LocalDateTime timestamp, String priority) {
        this.userName = userName;
        this.timestamp = timestamp;
        this.priority = priority != null ? priority : "M"; // prioridad por defecto m (Media)
    }

    // Getters
    public String getUserName() {
        return userName;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getPriority() {
        return priority;
    }

    // metodo para compara trabajos de impresion por prioridad y luego p/hora de envio
    @Override
    public int compareTo(PrintJob other) {
        // definir el orden de prioridad: H > M > L
        String[] priorityOrder = {"H", "M", "L"};
        int thisPriorityIndex = java.util.Arrays.asList(priorityOrder).indexOf(this.priority);
        int otherPriorityIndex = java.util.Arrays.asList(priorityOrder).indexOf(other.priority);

        // comparar por prioridad
        if (thisPriorityIndex != otherPriorityIndex) {
            return Integer.compare(thisPriorityIndex, otherPriorityIndex);
        }
        // si las prioridades son iguales, comparar por tiempo de envío
        return this.timestamp.compareTo(other.timestamp);
    }

    @Override
    public String toString() {
        return "Usuario: " + userName + ", Prioridad: " + priority + ", Hora de envío: " + timestamp;
    }
}
