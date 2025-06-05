package consultorio;

import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Consultorio consultorio = new Consultorio();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese identificador de administrador: ");
        String user = scanner.nextLine();

        System.out.print("Ingrese contraseña de administrador: ");
        String pass = scanner.nextLine();

        if (consultorio.autenticarAdministrador(user, pass)) {
            System.out.println("✅ Acceso concedido");

            boolean salir = false;

            while (!salir) {
                System.out.println("\n--- MENÚ PRINCIPAL ---");
                System.out.println("1. Registrar nuevo paciente");
                System.out.println("2. Registrar nuevo doctor");
                System.out.println("3. Crear nueva cita");
                System.out.println("4. Listar pacientes");
                System.out.println("5. Listar doctores");
                System.out.println("6. Listar citas");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opción: ");

                String opcion = scanner.nextLine();

                switch (opcion) {
                    case "1":
                        System.out.print("Nombre del paciente: ");
                        String nombrePaciente = scanner.nextLine();
                        Paciente nuevoPaciente = consultorio.darDeAltaPaciente(UUID.randomUUID().toString(), nombrePaciente);
                        System.out.println("✅ Paciente registrado: " + nuevoPaciente);
                        break;
                    case "2":
                        System.out.print("Nombre del doctor: ");
                        String nombreDoctor = scanner.nextLine();
                        System.out.print("Especialidad del doctor: ");
                        String especialidad = scanner.nextLine();
                        Doctor nuevoDoctor = consultorio.darDeAltaDoctor(UUID.randomUUID().toString(), nombreDoctor, especialidad);
                        System.out.println("✅ Doctor registrado: " + nuevoDoctor);
                        break;
                    case "3":
                        System.out.print("ID del doctor: ");
                        String idDoctor = scanner.nextLine();
                        System.out.print("ID del paciente: ");
                        String idPaciente = scanner.nextLine();
                        System.out.print("Fecha y hora (ej: 2025-06-01 10:00): ");
                        String fechaHora = scanner.nextLine();
                        System.out.print("Motivo: ");
                        String motivo = scanner.nextLine();
                        Cita cita = consultorio.crearCita(UUID.randomUUID().toString(), fechaHora, motivo, idDoctor, idPaciente);
                        System.out.println("✅ Cita creada: " + cita);
                        break;
                    case "4":
                        consultorio.listarPacientes();
                        break;
                    case "5":
                        consultorio.listarDoctores();
                        break;
                    case "6":
                        consultorio.listarCitas();
                        break;
                    case "0":
                        salir = true;
                        break;
                    default:
                        System.out.println("❌ Opción no válida.");
                }
            }

        } else {
            System.out.println("❌ Acceso denegado");
        }

        scanner.close();
    }
}