import java.util.*;

public class RobotsAvanzados extends Thread implements Runnable
{
	RobotsAvanzados robotAvanzado;
	Tareas tareas;
	List<Tareas> listaTareas = new ArrayList<Tareas>();
	
	public void realizarTarea(List listaTareas)
	{
		this.listaTareas = listaTareas;
	}
	
	public void randomWait()
	{
		try
		{
			Thread.currentThread().sleep((long)(3000*Math.random()));
		}
		
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
