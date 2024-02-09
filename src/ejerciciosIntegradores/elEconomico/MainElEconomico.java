package ejerciciosIntegradores.elEconomico;

import java.lang.reflect.Array;
import java.security.InvalidParameterException;
import java.util.*;
import java.util.stream.Collectors;

public class MainElEconomico {
    public static void main (String[] args) {

        // Parte uno

        // Punto A, B y C
        Cliente pedro = new Cliente("2345678", "Pedro", "de la costa");
        Cliente martina = new Cliente("456876798", "Martina", "Schaffer");
        Cliente luciano = new Cliente("44208598", "Luciano", "Rodriguez");

        List<Cliente> clientes = new ArrayList<>(Arrays.asList(pedro, martina, luciano));
        // Si pongo solo = Arrays.asList() me hace una lista de tamaño fijo
        // hay que poner = new ArrayList<>(Arrays.asList()) para poder crear un array
        System.out.println("----- Clientes actuales -----");
        clientes.forEach(System.out::println);

        // Punto D
        Scanner scannerBorrado = new Scanner(System.in);
        System.out.printf("Ingrese el dni de la persona que desea borrar: ");
        String dniBorrado = scannerBorrado.next();
        Optional<Cliente> clienteABorrar = clientes.stream()
                .filter(cliente -> cliente.getDni().equalsIgnoreCase(dniBorrado)).findFirst();
        if(clienteABorrar.isEmpty()) throw new IllegalArgumentException("No se encontro el usuario solicitado");
        else clientes.remove(clienteABorrar.get());
        System.out.println("----- Clientes actuales -----");
        clientes.forEach(System.out::println);

        // Punto E
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Ingrese el dni de la persona que desea buscar: ");
        String dni = scanner.next();
        Optional<Cliente> clienteBuscado = clientes.stream()
                .filter(cliente -> cliente.getDni().equalsIgnoreCase(dni))
                .findFirst();
        if(clienteBuscado.isEmpty()) throw new InvalidParameterException("No se encontro un cliente con el dni: " + dni);
        System.out.println(clienteBuscado.get().toString());

        // PARTE 2



    }
}
