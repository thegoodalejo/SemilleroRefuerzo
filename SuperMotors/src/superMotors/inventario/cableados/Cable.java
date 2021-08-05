package superMotors.inventario.cableados;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Cable extends Material implements IMaterial
{
	public Cable()
	{
		super();
		carga();
	}
	
	public Cable(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Cable.class);
		setNombreParmetros(Constantes.CABLES);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Corto(), new Medio(), new Largo()};
		return materiales;
	}
}