import java.util.*;

public class McPatitoApp 
{
	static List<Tareas> listaTareas = new ArrayList<Tareas>();
	static Tareas tareas = new Tareas();
	static RobotsAvanzados t1 = new RobotsAvanzados();
	static RobotsAvanzados t2 = new RobotsAvanzados();
	static RobotsAvanzados t3 = new RobotsAvanzados();
	static RobotsAvanzados t4 = new RobotsAvanzados();
	
	public static void main (String args[]) throws InterruptedException
	{
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		tareas();		
	}
	
	public static void tareas() throws InterruptedException
	{
		listaTareas.add(tareas.bajarGatosArboles(t1));
		listaTareas.add(tareas.cocinarHamburguesas(t2));
		listaTareas.add(tareas.pintarAutos(t3));
		listaTareas.add(tareas.repararCercas(t4));
		listaTareas.add(tareas.bajarGatosArboles(t1));
		listaTareas.add(tareas.cocinarHamburguesas(t2));
		listaTareas.add(tareas.pintarAutos(t3));
		listaTareas.add(tareas.repararCercas(t4));
		listaTareas.add(tareas.bajarGatosArboles(t1));
		listaTareas.add(tareas.cocinarHamburguesas(t2));
		listaTareas.add(tareas.pintarAutos(t3));
		listaTareas.add(tareas.repararCercas(t4));
		listaTareas.add(tareas.bajarGatosArboles(t1));
		listaTareas.add(tareas.cocinarHamburguesas(t2));
		listaTareas.add(tareas.pintarAutos(t3));
		listaTareas.add(tareas.repararCercas(t4));
		listaTareas.add(tareas.bajarGatosArboles(t1));
		listaTareas.add(tareas.cocinarHamburguesas(t2));
		listaTareas.add(tareas.pintarAutos(t3));
		listaTareas.add(tareas.repararCercas(t4));
	}

}
