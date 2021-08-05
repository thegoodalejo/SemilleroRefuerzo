package superMotors.inventario.accesoriosDigitales;

import superMotors.Constantes;
import superMotors.inventario.IMaterial;
import superMotors.inventario.Material;

public class Altavoz extends Material implements IMaterial
{
	public Altavoz()
	{
		super();
		carga();
	}
	
	public Altavoz(String... parametros)
	{
		super();
		carga();
		setValoresParmetros(parametros);
	}
	
	@Override
	public void carga()
	{
		setTipo(Altavoz.class);
		setNombreParmetros(Constantes.ALTAVOCES);
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {new Premium(), new Drive(), new Live()};
		return materiales;
	}
}