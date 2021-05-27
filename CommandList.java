
	package scl.edu.gt;

	public class CommandList {
		String InfoSistemas [] = new String [5];
		String command 		[] = new String [7];
		String information 	[] = new String [7];
		String Sistemas [] = new String [5];
		
		int cantidadDeComandos;
		
		CommandList() {
			
			command[0]= "suma";
			command[1]= "resta";
			command[2]= "multiplicacion";
			command[3]= "division";
			command[4]= "residuo";
			command[5]= "help";
			command[6]= "exit";
			
			
			information[0]= "		El comando puede realzar la suma de dos \n		números ya sean enteres o decimales, el valor \n		a retornar es un doublé.";
			information[1]= "";
			information[2]= "";
			information[3]= "";
			information[4]= "";
			information[5]= "";
			information[6]= "";
			
			InfoSistemas[0]= "CPU";
			InfoSistemas[1]= "RAM";
			InfoSistemas[2]= "Nucleo";
			InfoSistemas[3]= "Tarjeta de Video";
			InfoSistemas[4]= "Ventilador";
			
			Sistemas[0]="este comando sirve para encontrar infomacion de CPU";
			Sistemas[1]="este comando sirve para encontrar infomacion de RAM";
			Sistemas[2]="este comando sirve para encontrar infomacion de Nucleo";
			Sistemas[3]="este comando sirve para encontrar infomacion de Tarjeta de video";
			Sistemas[4]="este comando sirve para encontrar infomacion de Ventilador";
		}
	}


