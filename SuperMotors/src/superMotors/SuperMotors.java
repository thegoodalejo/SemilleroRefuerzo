package superMotors;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import superMotors.inventario.Inventario;
import superMotors.inventario.InventarioFinal;
import superMotors.inventario.Material;
import superMotors.inventario.NuevoMaterial;
import superMotors.inventario.Opciones;
import superMotors.inventario.accesoriosDigitales.Altavoz;
import superMotors.inventario.asientos.Asiento;
import superMotors.inventario.bombillas.Bombilla;
import superMotors.inventario.cableados.Cable;
import superMotors.inventario.chasises.Chasis;
import superMotors.inventario.cojines.Cojin;
import superMotors.inventario.mecanismos.MecanismoDeManejo;
import superMotors.inventario.motores.Motor;
import superMotors.inventario.neumaticos.Neumatico;
import superMotors.inventario.pinturas.Pintura;
import superMotors.inventario.rines.Rin;

public class SuperMotors
{
	static InventarioFinal inventario = new InventarioFinal();
	static Inventario materiales = new Inventario();
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("BIENVENIDO A SUPERMOTORS ");
		
		Map<Class, Material[]> map = new HashMap<>();
		map.put(Motor.class, Motor.opciones());
		map.put(Chasis.class, Chasis.opciones());
		map.put(MecanismoDeManejo.class, MecanismoDeManejo.opciones());
		menu(Constantes.BASICO, map);
		
		System.out.println(Constantes.BANDA + Constantes.ELECTRICO);
		map = new HashMap<>();
		map.put(Cable.class, Cable.opciones());
		map.put(Bombilla.class, Bombilla.opciones());
		map.put(Altavoz.class, Altavoz.opciones());
		menu(Constantes.ELECTRICO, map);
		
		System.out.println(Constantes.BANDA + Constantes.ESTETICO);
		map = new HashMap<>();
		map.put(Asiento.class, Asiento.opciones());
		map.put(Cojin.class, Cojin.opciones());
		map.put(Neumatico.class, Neumatico.opciones());
		map.put(Pintura.class, Pintura.opciones());
		map.put(Rin.class, Rin.opciones());
		menu(Constantes.ESTETICO, map);
		
		System.out.println("\nDesea crear un o varios materiales que no existente en el inventario para ensamblarlos a su vehiculo: \n1: Si\n2: No");
		int opcion = s.nextInt();
		if(opcion == 1)
		{
			System.out.println("Cuantos materiales nuevos quere crear: ");
			int j = s.nextInt();
			map = new HashMap<>();
			for(int i = 0; i < j ; i++)
			{
				map.put(NuevoMaterial.class, NuevoMaterial.opciones());
			}
			menu(Constantes.ESTETICO, map);
		}
		
		System.out.println("\n" + Constantes.TODO);
		inventario.mostrarMateriales(true, inventario.getValidados());
		
		System.out.println("\nEl vehiculo ensamblado quedo con los siguientes materiales:");
		Vehiculo v = new Vehiculo();
		v.ensamblar(inventario.mareialesAceptados());
		v.mostrarMateriales(false, null);
	}
	
	public static void menu(String ensamblaje, Map<Class, Material[]> map)
	{	do
		{	System.out.println("Area de " + ensamblaje);
			materiales.limpiar();
			for(Entry<Class, Material[]> e: map.entrySet())	
			{
				materiales.addMaterial(setOpciones(ensamblaje, (Class)e.getKey(), (Material[])e.getValue()));
			}
		}while(satisfaccion() != 1);
	}
	
	public static Material setOpciones(String ensamblaje, Class material, Material[] opciones)
	{
		Material opcion = null;
		System.out.println("Seleccione un(a) " + material.getSimpleName());
		Scanner s = new Scanner(System.in);
		int i= -1, leer;
		for(i = 0; i < opciones.length; i++)
		{
			System.out.println((i+1) + ": " + opciones[i].getValor());
		}
		i++;
		System.out.println(i +  ": Crear su propi@ " + material.getSimpleName());
		leer = s.nextInt();
		if(leer < i)
		{
			opcion = opciones[leer - 1];
		}
		else if(leer == i)
		{
			opcion = Opciones.nuevaOpcion(material);
		}
		System.out.println("El area de: " + ensamblaje + " solicito al invetario un(a) " + opcion.getTipo() + " de tipo: " + opcion.getValor());
		System.out.println("El inventario enviar un(a): " + opcion.getTipo() + " de tipo: " + opcion.getValor() + " al area de " + ensamblaje);
		return opcion;
	}
	
	private static int satisfaccion()
	{
		System.out.println("\nSe han ensamblado los siguientes materiale que usted a escogio:");
		materiales.mostrarMateriales(false, null);
		inventario.ensamblar(materiales.getMateriales());
		Scanner s = new Scanner(System.in);
		System.out.println("Esta satisfecho con los materiales \n1: Si\n2: No");
		return s.nextInt();
	}
}