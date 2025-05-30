package consultorio;

public class Cita {
    private String id;
    private String fechaHora;
    private String motivo;
    private Doctor doctor = null;
    private Paciente paciente = null;

    public Cita(String id, String fechaHora, String motivo) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
    }

    public void asignarDoctor(Doctor doctor) {
        this.doctor = doctor;
        doctor.agregarCita(this);
    }

    public void asignarPaciente(Paciente paciente) {
        this.paciente = paciente;
        paciente.agregarCita(this);
    }

    @Override
    public String toString() {
        String nombreDoctor = (doctor != null) ? doctor.getNombre() : "No asignado";
        String nombrePaciente = (paciente != null) ? paciente.getNombre() : "No asignado";
        return "Cita ID: " + id + ", Fecha/Hora: " + fechaHora + ", Motivo: " + motivo +
                ", Doctor: " + nombreDoctor + ", Paciente: " + nombrePaciente;
    }
}
