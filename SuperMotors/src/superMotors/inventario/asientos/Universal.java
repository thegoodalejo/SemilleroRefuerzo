package superMotors.inventario.asientos;

public class Universal extends Asiento
{
	public Universal()
	{
		super();
		setValoresParmetros(this.getClass().getSimpleName(), "Si", "No", "Si");
	}
}