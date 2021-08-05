package superMotors.inventario.motores;

public class Gas extends Motor
{
	public Gas()
	{
		super();
		setValoresParmetros(this.getClass().getSimpleName(), "50", "650");
	}
}