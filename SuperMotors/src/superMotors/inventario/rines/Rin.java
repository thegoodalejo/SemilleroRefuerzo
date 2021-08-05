package superMotors.inventario.rines;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Rin extends Material implements IMaterial
{
	public Rin()
	{
		super();
		carga();
	}
	
	public Rin(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Rin.class);
		setNombreParmetros(Constantes.RINES);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Abs(), new Corsa(), new Spark()};
		return materiales;
	}
}