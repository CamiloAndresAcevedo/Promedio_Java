package Promedio;

import java.io.*; //paquete de entrada y salida para importar  todas las clases del paquete io .

public class Promedi {
	public static final String delimiter = ","; //Definimimos el delimitador del archivo a leer.
	

	public static void read(String csvFile) {
		 try {
	         File file = new File(csvFile); //Creamos nuestro archivo
	         FileReader fr = new FileReader(file); //Clase para leer archivos de caracteres.
	         BufferedReader br = new BufferedReader(fr);//Lector de secuencia de caracteres para almacenarlos y ser leidos.
	         String line = ""; //Devuelve el flujo de líneas de la cadena.
	         String[] tempArr;
	         float promT = 0; //Almacenamos promT como un flotante.
	         int cont = 1; //Almacenamos el entero.
	         while((line = br.readLine()) != null) {
	        	 
	        	 float num = 0; //Almacenamos num como un flotante.
	        	 tempArr = line.split(delimiter);
	        	 for(int i = 2; i<=5;i++) { //Ciclo para leer las columnas con las calificaciones.
	                num += Float.parseFloat(tempArr[i]);
	            }
	        	 
	          float promedio = num /4; //Se divide a num entre la cantidad de notas.
	          System.out.println("El promedio del estudiante "+cont+" es: "+promedio); //Se imprime el promedio para cada estudiante.
	          promT += promedio;
	          cont ++;
	         }
	         
	         float promeTotal = promT / 19; //Se divide promT entre la cantidad de estudiantes.
	         System.out.println("El promedio general es: "+promeTotal); //Se imprime el promedio general del curso.
	         br.close(); //Cerramos nuestra secuencia.
	         
	         } catch(IOException ioe) {//Excepción que ocurre cuando hay una falla durante la búsqueda de archivo.
	            ioe.printStackTrace(); //Metodo de seguimiento de errores.
	         }

	   }
	   
	   public static void main(String[] args) {
	      String csvFile = "C:\\Users\\ASUS\\Documents\\Universidad\\IV semestre\\Programación\\java\\Programacion\\src\\Promedio\\PromedioCSV.csv"; //Se busca el archivo a leer.
	      @SuppressWarnings("unused")
		Promedi prueba1 = null;
		Promedi.read(csvFile);
	      
	   }
	}

