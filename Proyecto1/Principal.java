import java.util.Scanner;

public class Principal {

    public void mostrarMenu(int numZom) {
        Scanner sc = new Scanner(System.in);
        Listas lista = new Listas();
        while (numZom >= 0) {
            System.out.println("Por favor, digite un numero");
            System.out.println("0 = Finalizacion del programa");
            System.out.println("1 = Crear un Zombie");
            System.out.println("2 = Registro de Zombies almacenados");
            System.out.println("3 = Cantidad de Zombies creados");
            System.out.println("4 = Zombies con sangre O+ y AB+");
            System.out.println("5 = Zombies nacidos después del 2000");
            System.out.println("6 = Lanzar bomba para reducir la vida de los Zombies");
            System.out.println("7 = Crear ubicacion");
            System.out.println("8 = Registro de ubicaciones almacenadas");
            System.out.println("9 = Ubicación mas segurada");
            System.out.println("10 = Ordenar ubicaciones por distancia");
            System.out.println("11 = Frases");
            System.out.println("12 = Ubicacion menos segura");

            numZom = sc.nextInt();

            if (numZom == 0) {
                break;
            } else if (numZom == 1) {
                String nombre, tipoSangre;
                int salud, nacimiento;
                System.out.println("Ingrese nombre:");
                nombre = sc.next();
                System.out.println("Ingrese tipo de sangre:");
                tipoSangre = sc.next();
                System.out.println("Ingrese salud del zombie:");
                salud = sc.nextInt();
                System.out.println("Ingrese año de nacimineto del Zombie:");
                nacimiento = sc.nextInt();
                Zombies zombie = new Zombies(nombre, salud, nacimiento, tipoSangre);
                lista.agregarZombies(zombie);
                System.out.println("Se agrego Zombie");
            } else if (numZom == 2) {
                lista.verListaUno();
            } else if (numZom == 3) {
                lista.size();
            } else if (numZom == 4) {
                lista.sangreOPositivo();
                lista.sangreABPositivo();
            } else if (numZom == 5) {
                lista.zombiesDosmil();
            } else if (numZom == 6) {
                lista.bomba();
                System.out.println("La bomba fue lanzada");
            } else if (numZom == 7) {
                String nombre;
                int distancia, cantZom;
                System.out.println("Ingrese nombre:");
                nombre = sc.next();
                System.out.println("Ingrese distancia de Alexandria en metros:");
                distancia = sc.nextInt();
                System.out.println("Ingrese numero de Zombies en la ubicacion:");
                cantZom = sc.nextInt();
                Ubicacion ubicacion = new Ubicacion(nombre, distancia, cantZom);
                lista.agregarUbicacion(ubicacion);
                System.out.println("Se agrego Ubicacion");
            } else if (numZom == 8) {
                lista.verListaDos();
            } else if (numZom == 9) {
                lista.ubicacionSegura();
            } else if (numZom == 10) {
                lista.ordenUbicaciones();
            } else if (numZom == 11) {
                lista.frasesZom();
            } else if (numZom == 12) {
                lista.ubicacionNoSegura();
            }
        }
        sc.close();
    }
}
