package superMotors.inventario;

public class Material
{
	private String[] nombreParametros;
	private String[] valorParametros;
	private String tipo;
	
	public void setTipo(Class tipo)
	{
		this.tipo = tipo.getSimpleName();
	}
	
	public void setTipo(String tipo)
	{
		this.tipo = tipo;
	}
	
	public String getValor() {
		return valorParametros[0];
	}

	public String getTipo() {
		return tipo;
	}

	public void setNombreParmetros(String... parametros)
	{
		nombreParametros = parametros;
	}
	
	public void setValoresParmetros(String... parametros)
	{
		valorParametros = parametros;
	}
	
	private String reescribir(String texto)
	{
		String t = "";
		
		return t;
	}
	
	public String imprimir()
	{
		String  s = tipo + " [";
		for(int i = 0; i < nombreParametros.length; i++)
		{
			s += nombreParametros[i] + ": " + valorParametros[i] + ", ";
		}
		s= s.substring(0, s.length() - 2);
		s += "]";
		return s;
	}
}