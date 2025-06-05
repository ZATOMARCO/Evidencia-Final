package models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Cita {
    private Paciente paciente;
    private Doctor doctor;
    private LocalDate fecha;
    private LocalTime hora;

    public Cita(Paciente paciente, Doctor doctor, LocalDate fecha, LocalTime hora) {
        this.paciente = paciente;
        this.doctor = doctor;
        this.fecha = fecha;
        this.hora = hora;
    }

    // Getters y setters
    public Paciente getPaciente() { return paciente; }
    public void setPaciente(Paciente paciente) { this.paciente = paciente; }

    public Doctor getDoctor() { return doctor; }
    public void setDoctor(Doctor doctor) { this.doctor = doctor; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }

    @Override
    public String toString() {
        return "Cita: " + paciente + " - " + doctor + " | Fecha: " + fecha + " Hora: " + hora;
    }
}
