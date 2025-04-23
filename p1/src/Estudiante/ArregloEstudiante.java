package Estudiante;

import java.util.ArrayList;

import ArregloEstudiante.Arreglo;


public class ArregloEstudiante {
	private ArrayList <Arreglo>estu ;
	
	public ArregloEstudiante()
	{
		estu = new ArrayList<Arreglo>();
	}
	public int Tamaño()
	{
		return estu.size();
	}
	public void Adicionar(Arreglo x)
	{
	 estu.add(x);
	}
	public Arreglo Obtener(int x)
	{
		return estu.get(x); 
	}
	public double PromedioGeneral()
	{
		double suma =0.0;
		for(int i = 0; i<Tamaño(); i++)
		{
			suma += Obtener(i).promedio();
		}return suma/Tamaño();
	}
}
