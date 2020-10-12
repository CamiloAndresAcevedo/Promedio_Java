package Promedio;

import  java.io. * ;
import  java.util.Scanner ;

public class Prom {
	 public static final String delimiter = ",";

	 public static void read(String csvFile) {
		try {
	         //A continuación el proceso para pedir la cantidad de notas por estudiante//
	         @SuppressWarnings("resource")
			Scanner entrada = new Scanner(System.in);
	         int cantNot;
	         System.out.print("Ingrese la cantidad de notas por estudiante: ");
	         cantNot = entrada.nextInt();
	         System.out.println();
	         //Ahora abriremos el archivo y creamos el string que almacenará la linea //
	         File file = new File(csvFile);
	         FileReader fr = new FileReader(file);
	         @SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(fr);
	         String line;
	         String[] tempArr;
	         // Creamos variables que nos servirán para almacenar las sumas y acumulados del promedio //
	         @SuppressWarnings("unused")
			float sum = 0;
	         int nest = 0;
	         int i =0;
	         float n[] = new float[cantNot+2];
	         float nt[]= new float[cantNot+2];
	         // En este while leeremos linea por linea nuestro archivo//
	         while((line = br.readLine()) != null) {
	             float num = 0;
	             tempArr = line.split(delimiter);
	             // Ahora leeremos la primera columna que contiene notas y leeremos hasta la columna +1 de la cantidad de notas que el usuario indicó //
	             for(i=2; i<=cantNot+1 ;i++) {
	                 num += Float.parseFloat(tempArr[i]);
	                 n[i] += Float.parseFloat(tempArr[i]);
	                }
	             // Haremos operaciones para el promedio individual y lo imprimimos y acumuladores para el promedio total //
	             float prom = num /cantNot;  
	             nest ++;
	             System.out.println("Promedio del estudiante "+nest+": "+prom);       
	             sum += prom;                           
	            }
	         System.out.println();
	         for(i=2; i<=cantNot+1 ;i++) {
	             nt[i]=n[i]/nest;
	             System.out.println("El promedio de la nota " +(i-1)+ " es: "+nt[i]); 
	             
	            }
	         // Haremos operaciones para el promedio total y lo imprimimos //
	         br.close();
	        }
	         catch(IOException ioe) {
	         ioe.printStackTrace();
	        }
	    }  
	    
	    public static void main(String[] args) {
	     String csvFile = "C:\\Users\\ASUS\\Documents\\Universidad\\IV semestre\\Programación\\java\\Programacion\\src\\Promedio\\PromedioCSV.csv";//Se busca el archivo a leer.//
	     Prom.read(csvFile);
	    }  
	}