package superMotors;

import java.util.ArrayList;

import superMotors.inventario.IAgregarMaterial;
import superMotors.inventario.Inventario;
import superMotors.inventario.Material;

public class Vehiculo extends Inventario implements IAgregarMaterial
{
	public Vehiculo()
	{
		super();
	}
	
	@Override
	public void ensamblar(ArrayList<Material> materiales)
	{
		getMateriales().addAll(materiales);
	}
}