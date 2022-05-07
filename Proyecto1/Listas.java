import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Listas {

    private ArrayList<Zombies> miLista;
    private ArrayList<Ubicacion> miLista2;
    private ArrayList<String> frases;

    //constructor
    public Listas(){
        this.miLista = new ArrayList<Zombies>();
        this.miLista2 = new ArrayList<Ubicacion>();
        this.frases = new ArrayList<String>();
    }

    public void agregarZombies(Zombies item) {
        this.miLista.add(item);
    }

    public void agregarUbicacion(Ubicacion item){
        miLista2.add(item);
    }

    public void verListaUno(){
        System.out.println(miLista.toString());
    }

    public void verListaDos(){
        System.out.println(miLista2.toString());   
    }

    public void size(){
        System.out.println("Tenemos: " + miLista.size() + " Zombies");
    }

    public void sangreOPositivo(){
        System.out.println("Estos son los zombies con tipo de sangre O+: " + "\n");
        for (int i = 0; i < miLista.size(); i++){
            if(miLista.get(i).getTipoSangre().compareToIgnoreCase("O+") == 0 )
            System.out.println(miLista.get(i).toString());
        }
        System.out.println();
        System.out.println();
    }

    public void sangreABPositivo(){
        System.out.println("Estos son los zombies con tipo de sangre AB+: ");
        for (int i = 0; i < miLista.size(); i++){
            if(miLista.get(i).getTipoSangre().compareToIgnoreCase("AB+") == 0 )
            System.out.println(miLista.get(i).toString());
        }
        System.out.println();
        System.out.println();
    }

    public void zombiesDosmil(){
        System.out.println("Estos son los zombies nacidos despues del 2000: ");
        for (int i = 0; i < miLista.size(); i++){
            if(miLista.get(i).getNacimiento()>= 2000)
            System.out.println(miLista.get(i).toString());
        }
        System.out.println();
        System.out.println();
    }

    public void bomba(){
        for (int i = 0; i < miLista.size(); i++){
            int salud = miLista.get(i).getSalud()/2;
            miLista.get(i).setSalud(salud);
        }
    }

    public void ubicacionSegura (){
        int totalZombies = miLista2.get(0).getCantZom();
        int pos = 0;
        for (int i = 0; i < miLista2.size(); i++) {
            if (miLista2.get(i).getCantZom() < totalZombies){ 
                totalZombies = miLista2.get(i).getCantZom();
                pos = i;
            }
        }
        System.out.println("La posicion mas segura es: "+miLista2.get(pos).getNombre());
    }

    public void ubicacionNoSegura(){
        int totalZombies = miLista2.get(0).getCantZom();
        int pos = 0;
        for (int i = 0; i < miLista2.size(); i++) {
            if (miLista2.get(i).getCantZom() > totalZombies){ 
                totalZombies = miLista2.get(i).getCantZom();
                pos = i;
            }
        }
        System.out.println("La posicion menos segura es: "+miLista2.get(pos).getNombre());
    }

    public void ordenUbicaciones(){
        Collections.sort(miLista2, new Comparator<Ubicacion>() {
            @Override
            public int compare(Ubicacion p1, Ubicacion p2) {
                return new Integer(p1.getDistancia()).compareTo(new Integer(p2.getDistancia()));
            }
        });
        System.out.println("Lista: " + miLista2);
    }

    public void frasesZom(){
        this.frases.add("Cuando los muertos echan a andar, ¿para qué obstinarse en matarlos? No hay formas de vencerlos");
        this.frases.add("Cada ser humano que salvamos es un zombi menos que combatir");
        this.frases.add("Los zombis nos invaden y nosotros nos encerramos en una biblioteca");
        this.frases.add("Ese fue nuestro primer encuentro con mutantes de discoteca. Sabia que no seria el ultimo");
        this.frases.add("Viven para la noche, viven para matar, y ... viven siempre");
        int aleatorio = (int) (Math.random() * 5);
        System.out.println(frases.get(aleatorio));
    }
}

