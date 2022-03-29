public class Main {
    public static void main(String[] args) {
        Persona elisa = new Persona();
        elisa.setNombre( "Elisa Maria" );
        elisa.setEdad( ( byte ) 44 );
        elisa.setTelefono( "375623" );

        System.out.println(
            "Nombre: " + elisa.getNombre() +
            "\nEdad: " + elisa.getEdad() +
            "\nTelefono: " + elisa.getTelefono()
        );
    }
}

class Persona {
    private byte edad;
    private String nombre;
    private String telefono;

    /** Getters & Setters */
    public void setEdad( byte edad ) {
        this.edad = edad;
    }
    public byte getEdad() {
        return this.edad;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre( String nombre ) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return this.telefono;
    }
    public void setTelefono( String telefono ) {
        this.telefono = telefono;
    }

}