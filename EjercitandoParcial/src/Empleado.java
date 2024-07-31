public class Empleado {
    private String nombre;
    private int sueldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public Empleado(String nombre, int sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public double calcularSalarioNeto() {
        return sueldo + (sueldo * 0.1);
    }
    public double calcularSalarioNeto(int bono) {
         return calcularSalarioNeto() + bono;
    }


    public void mostrarInformacion(){
       System.out.println("Nombre: " + nombre);
       System.out.println("Salario Base: " + sueldo);
       System.out.println("Salario Neto: " + calcularSalarioNeto());

    }



}
