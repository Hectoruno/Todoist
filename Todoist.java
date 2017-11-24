
/**
 * Clase que permite almacenar las tareas pendientes que tenemos que hacer.
 */
public class Todoist
{
    // Nuestras tres tareas.
    private String tarea0;
    private String tarea1;
    private String tarea2;

    /**
     * Constructor de la clase Todoist. Crea un gestor con las 3 tareas vacías.
     */
    public Todoist()
    {
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
    }

    /**
     * Inserta la tarea especificada en la posicion indicada
     */
    public void addTarea(String nombreTarea,int posicion)
    {
        if (posicion == 0) {
            tarea0 = nombreTarea;
        }
        else if (posicion == 1) {
            tarea1 = nombreTarea;
        }
        else if (posicion == 2) {
            tarea2 = nombreTarea;
        }
    }

    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas() 
    {
        System.out.println("Tareas existentes:");
        if (tarea0 != null) {
            System.out.println(tarea0);
        }
        if (tarea1 != null){
            System.out.println(tarea1);
        }
        if (tarea2 != null){
            System.out.println(tarea2);
        }
    }
}
