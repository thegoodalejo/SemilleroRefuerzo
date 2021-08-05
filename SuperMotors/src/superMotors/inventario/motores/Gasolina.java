package superMotors.inventario.motores;

public class Gasolina extends Motor
{
	public Gasolina()
	{
		super();
		setValoresParmetros(this.getClass().getSimpleName(), "45", "700");
	}
}