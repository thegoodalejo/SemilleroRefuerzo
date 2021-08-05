package superMotors.inventario.neumaticos;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Neumatico extends Material implements IMaterial
{
	public Neumatico()
	{
		super();
		carga();
	}
	
	public Neumatico(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Neumatico.class);
		setNombreParmetros(Constantes.NEUMATICOS);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new R16(), new R17(), new R19()};
		return materiales;
	}
}