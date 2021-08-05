package superMotors.inventario.chasises;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Chasis extends Material implements IMaterial
{
	public Chasis()
	{
		super();
		carga();
	}
	
	public Chasis(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Chasis.class);
		setNombreParmetros(Constantes.CHISISES);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Independiente(), new Tubular()};
		return materiales;
	}
}