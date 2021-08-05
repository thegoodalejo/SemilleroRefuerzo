package superMotors.inventario;

import java.util.Scanner;

import superMotors.Constantes;
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

public class Opciones
{
	public static Material nuevaOpcion(Class material)
	{
		Material materialNuevo = null; 
		String parametros[];
		if(material == Motor.class)
		{
			parametros = parametros(Constantes.MOTORES);
			materialNuevo = new Motor(parametros);
		}
		if(material == Chasis.class)
		{
			parametros = parametros(Constantes.CHISISES);
			materialNuevo = new Chasis(parametros);
		}
		if(material == MecanismoDeManejo.class)
		{
			parametros = parametros(Constantes.MECANISMOS);
			materialNuevo = new MecanismoDeManejo(parametros);
		}
		if(material == Cable.class)
		{
			parametros = parametros(Constantes.CABLES);
			materialNuevo = new Cable(parametros);
		}
		if(material == Bombilla.class)
		{
			parametros = parametros(Constantes.BOMBILLAS);
			materialNuevo = new Bombilla(parametros);
		}
		if(material == Altavoz.class)
		{
			parametros = parametros(Constantes.ALTAVOCES);
			materialNuevo = new Altavoz(parametros);
		}
		if(material == Asiento.class)
		{
			parametros = parametros(Constantes.ASIENTOS);
			materialNuevo = new Asiento(parametros);
		}
		if(material == Cojin.class)
		{
			parametros = parametros(Constantes.COJINES);
			materialNuevo = new Cojin(parametros);
		}
		if(material == Neumatico.class)
		{
			parametros = parametros(Constantes.NEUMATICOS);
			materialNuevo = new Neumatico(parametros);
		}
		if(material == Pintura.class)
		{
			parametros = parametros(Constantes.PINTURAS);
			materialNuevo = new Pintura(parametros);
		}
		if(material == Rin.class)
		{
			parametros = parametros(Constantes.RINES);
			materialNuevo = new Rin(parametros);
		}
		if(material == NuevoMaterial.class)
		{
			String nParametros[] = crearParametros();
			parametros = parametros(nParametros);
			materialNuevo = new NuevoMaterial(nParametros, parametros);
		}
		return materialNuevo;
	}
	
	private static String[] parametros(String... constantes)
	{
		Scanner s = new Scanner(System.in);
		String parametros[] = new String[constantes.length];
		for(int i = 0; i < parametros.length; i++)
		{
			System.out.println("ingrese " + constantes[i] + ":");
			parametros[i] = s.next();
		}
		return parametros;
	}
	
	private static String[] crearParametros()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Tega presente que por defecto se agregan los caracteristicas de 'Tipo' y 'Nombre'");
		System.out.println("Cuantas caracteristicas desea agregar al nuevo material: ");
		int j = s.nextInt();
		String parametros[] = new String[j + 2];
		parametros[0] = "Tipo";
		parametros[1] = "Nombre";
		for(int i = 2; i < parametros.length; i++)
		{
			System.out.println("Ingrese el nombre de la caracteristica numero " + (i + 1) + ": ");
			parametros[i] = s.nextLine();
		}
		return parametros;
	}
}