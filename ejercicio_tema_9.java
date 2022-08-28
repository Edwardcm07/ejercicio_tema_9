// Crea una clase Persona con las siguientes variables:

// La edad

// El nombre

// El teléfono

// Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.

// Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

// Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.

public class ejercicio_tema_9 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();

        System.out.println("Edad del persona es " + persona.edad);
        System.out.println("Nombre del persona es " + persona.nombre);
        System.out.println("Telefono del persona es " + persona.telefono);

        cliente.edad = 21;
        cliente.nombre = "Pedro";
        cliente.telefono = "3124567887";
        cliente.credito = 4000;
        System.out.println("Edad del cliente es " + cliente.edad);
        System.out.println("Nombre del cliente es " + cliente.nombre);
        System.out.println("Telefono del cliente es " + cliente.telefono);
        System.out.println("Credito del cliente es " + cliente.credito);

        trabajador.edad = 28;
        trabajador.nombre = "Carlos";
        trabajador.telefono = "5554446677";
        trabajador.salario = 1200;
        System.out.println("Edad del trabajador es " + trabajador.edad);
        System.out.println("Nombre del trabajador es " + trabajador.nombre);
        System.out.println("Telefono del trabajador es " + trabajador.telefono);
        System.out.println("Credito del trabajador es " + trabajador.salario);

    }
}

class Persona {
    int edad = 35;
    String nombre = "Edward";
    String telefono = "3116604021";
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}