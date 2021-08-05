package superMotors.inventario;

public class NuevoMaterial extends Material
{
	public NuevoMaterial(String[] nParametros, String[] parametros)
	{
		super();
		setNombreParmetros(reparametrizar(nParametros));
		setTipo(parametros[0]);
		setValoresParmetros(reparametrizar(parametros));
	}
	
	public static Material[] opciones()
	{
		Material[] materiales = {};
		return materiales;
	}
	
	private String[] reparametrizar(String... parametro)
	{
		String p[] = new String[parametro.length - 1];
		for(int i = 0; i < p.length; i++)
		{
			p[i] = parametro[i + 1];
		}
		return p;
	}
}