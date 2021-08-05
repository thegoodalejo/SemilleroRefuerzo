package superMotors.inventario.cojines;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Cojin extends Material implements IMaterial
{
	public Cojin()
	{
		super();
		carga();
	}
	
	public Cojin(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Cojin.class);
		setNombreParmetros(Constantes.COJINES);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Malla(), new Almoadilla(), new Descansacuellos()};
		return materiales;
	}
}