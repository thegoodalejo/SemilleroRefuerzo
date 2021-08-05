package superMotors.inventario.mecanismos;

public class Manubrio extends MecanismoDeManejo
{
	public Manubrio()
	{
		super();
		setValoresParmetros(this.getClass().getSimpleName(), "10", "10", "Si");
	}
}