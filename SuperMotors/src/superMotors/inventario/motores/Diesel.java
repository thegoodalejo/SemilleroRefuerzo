package superMotors.inventario.motores;

public class Diesel extends Motor
{
	public Diesel()
	{
		super();
		setValoresParmetros(this.getClass().getSimpleName(), "50", "800");
	}
}