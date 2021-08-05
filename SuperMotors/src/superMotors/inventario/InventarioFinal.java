package superMotors.inventario;

import java.util.ArrayList;

public class InventarioFinal extends Inventario implements IAgregarMaterial
{
	private ArrayList<Boolean> validados;
	
	public InventarioFinal()
	{
		super();
		validados = new ArrayList<Boolean>();
	}
	
	private void agregarMaterial(Material material)
	{
		addMaterial(material);
		validados.add(true);
	}
	
	@Override
	public void ensamblar(ArrayList<Material> materiales)
	{
		for(int i = 0; i < materiales.size(); i++)
		{
			revalidar(materiales.get(i));
			agregarMaterial(materiales.get(i));
		}
	}
	
	public ArrayList<Boolean> getValidados()
	{
		return validados;
	}
	
	private void revalidar(Material material)
	{
		for(int i = 0; i < getMateriales().size(); i++)
		{
			if(getMateriales().get(i).getTipo().equals(material.getTipo()))
			{
				validados.set(i, false);
			}
		}
	}
	
	public void limpiar1()
	{
		limpiar();
		validados.clear();
	}
	
	public ArrayList<Material> mareialesAceptados()
	{
		ArrayList<Material> materiales = new ArrayList<Material>();
		for(int i = 0; i < getMateriales().size(); i++)
		{
			if(validados.get(i))
			{
				materiales.add(getMateriales().get(i));
			}
		}
		return materiales;
	}
}