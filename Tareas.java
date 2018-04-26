import java.text.*;
import java.util.*;

public class Tareas
{	
	Tareas tareas;
	DateFormat fechaFormato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	RobotsAvanzados t1 = new RobotsAvanzados();
	RobotsAvanzados t2 = new RobotsAvanzados();
	RobotsAvanzados t3 = new RobotsAvanzados();
	RobotsAvanzados t4 = new RobotsAvanzados();
	
	public Tareas cocinarHamburguesas(Thread thread)
	{
		Date fecha = new Date();
		this.t1 = (RobotsAvanzados) thread;
		t1.setName("Robot 1");
		t1.randomWait();
		System.out.println(thread.getName() + " esta cocinando hamburguesas veganas " + fechaFormato.format(fecha) + "\n");
		return tareas;
	}
	
	public Tareas pintarAutos(Thread thread)
	{
		Date fecha = new Date();
		this.t2 = (RobotsAvanzados) thread;
		t2.setName("Robot 2");
		t2.randomWait();
		System.out.println(thread.getName() + " esta pintando autos " + fechaFormato.format(fecha) + "\n");
		return tareas;
	}
	
	public Tareas repararCercas(Thread thread)
	{
		Date fecha = new Date();
		this.t3 = (RobotsAvanzados) thread;
		t3.setName("Robot 3");
		t3.randomWait();
		System.out.println(thread.getName() + " esta reparando cercas " + fechaFormato.format(fecha) + "\n");
		return tareas;
	}
	
	public Tareas bajarGatosArboles(Thread thread)
	{
		Date fecha = new Date();
		this.t4 = (RobotsAvanzados) thread;
		t4.setName("Robot 4");
		t4.randomWait();
		System.out.println(thread.getName() + " esta bajando gatos de los arboles " + fechaFormato.format(fecha) + "\n");
		return tareas;
	}
}
