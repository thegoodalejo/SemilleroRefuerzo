package superMotors.inventario.asientos;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Asiento extends Material implements IMaterial
{
	public Asiento()
	{
		super();
		carga();
	}
	
	public Asiento(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Asiento.class);
		setNombreParmetros(Constantes.ASIENTOS);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Competicion(), new Universal()};
		return materiales;
	}
}