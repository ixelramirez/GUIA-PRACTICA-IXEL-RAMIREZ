public class Empleado {

    private String nombre;
    private String numeroIdentidad;

    public Empleado(String nombre, String nummeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;


        // Constructor
    public Empleado(String nombre, String numeroIdentificacion) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    // Método abstracto para calcular salario
    public abstract double calcularSalario();
}

// Clase derivada EmpleadoTiempoCompleto
class EmpleadoTiempoCompleto extends Empleado {
    // Atributos específicos
    private double salarioMensual;

    // Constructor
    public EmpleadoTiempoCompleto(String nombre, String numeroIdentificacion, double salarioMensual) {
        super(nombre, numeroIdentificacion);
        this.salarioMensual = salarioMensual;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public double calcularSalario() {
        return salarioMensual;
    }
}

// Clase derivada EmpleadoMedioTiempo
class EmpleadoMedioTiempo extends Empleado {
    // Atributos específicos
    private double salarioPorHora;
    private int horasTrabajadas;

    // Constructor
    public EmpleadoMedioTiempo(String nombre, String numeroIdentificacion, double salarioPorHora, int horasTrabajadas) {
        super(nombre, numeroIdentificacion);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    // Implementación del método abstracto calcularSalario
    @Override
    public double calcularSalario() {
        return salarioPorHora * horasTrabajadas;
    }
}

// Clase de prueba
public class Main {
    public static void main(String[] args) {
        // Crear un empleado a tiempo completo
        EmpleadoTiempoCompleto empleadoTC = new EmpleadoTiempoCompleto("Juan", "123", 2000.0);

        // Crear un empleado a medio tiempo
        EmpleadoMedioTiempo empleadoMT = new EmpleadoMedioTiempo("Maria", "456", 15.0, 20);

        // Calcular y mostrar salario de cada empleado
        System.out.println("Salario de " + empleadoTC.getNombre() + ": $" + empleadoTC.calcularSalario());
        System.out.println("Salario de " + empleadoMT.getNombre() + ": $" + empleadoMT.calcularSalario());
    }
}


}
