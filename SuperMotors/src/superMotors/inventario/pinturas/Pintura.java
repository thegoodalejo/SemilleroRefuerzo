package superMotors.inventario.pinturas;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Pintura extends Material implements IMaterial
{
	public Pintura()
	{
		super();
		carga();
	}
	
	public Pintura(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Pintura.class);
		setNombreParmetros(Constantes.PINTURAS);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Amarillo(), new Azul(), new Blanco(), new Negro(), new Rojo(), new Verde()};
		return materiales;
	}
}