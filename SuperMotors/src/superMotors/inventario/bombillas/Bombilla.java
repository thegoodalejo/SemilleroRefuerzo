package superMotors.inventario.bombillas;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Bombilla extends Material implements IMaterial
{
	public Bombilla()
	{
		super();
		carga();
	}
	
	public Bombilla(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Bombilla.class);
		setNombreParmetros(Constantes.BOMBILLAS);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new D1sr(), new D2sr(), new D3sr(), new H1(), new H2()};
		return materiales;
	}
}