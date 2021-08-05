package superMotors.inventario.mecanismos;

public class Joystick extends MecanismoDeManejo
{
	public Joystick()
	{
		super();
		setValoresParmetros(this.getClass().getSimpleName(), "25", "10", "Si");
	}
}