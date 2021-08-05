package superMotors.inventario;

import java.util.ArrayList;

public class Inventario
{
	private ArrayList<Material> materiales;
	
	public Inventario()
	{
		materiales = new ArrayList<Material>();
	}
	
	public void addMaterial(Material material)
	{
		materiales.add(material);
	}
	
	public ArrayList<Material> getMateriales()
	{
		return materiales;
	}
	
	public void limpiar()
	{
		materiales.clear();
	}
	
	public void mostrarMateriales(boolean mostrar, ArrayList<Boolean> validados)
	{
		for(int i = 0; i < materiales.size(); i++)
		{
			if(mostrar)
			{
				if(!validados.get(i))
				{
					System.out.print("NO ");
				}
				System.out.print("aceptado = ");
			}
			System.out.println(materiales.get(i).imprimir());
		}
	}
}