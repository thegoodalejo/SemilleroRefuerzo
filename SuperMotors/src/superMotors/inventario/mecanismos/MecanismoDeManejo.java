package superMotors.inventario.mecanismos;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class MecanismoDeManejo extends Material implements IMaterial
{
	public MecanismoDeManejo()
	{
		super();
		carga();
	}
	
	public MecanismoDeManejo(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(MecanismoDeManejo.class);
		setNombreParmetros(Constantes.MECANISMOS);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Manubrio(), new Joystick(), new Timon()};
		return materiales;
	}
}