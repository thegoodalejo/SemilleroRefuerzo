package superMotors.inventario.motores;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Motor extends Material implements IMaterial
{
	public Motor()
	{
		super();
		carga();
	}
	
	public Motor(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}

	@Override
	public void carga()
	{
		setTipo(Motor.class);
		setNombreParmetros(Constantes.MOTORES);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Gasolina(), new Diesel(), new Gas()};
		return materiales;
	}
}