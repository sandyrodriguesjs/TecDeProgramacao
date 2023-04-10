package Lista2;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		
		 System.out.print("Informe o limite de unidades desjados: ");
		 int limite = scanner.nextInt();
		 int left = 0, right = 0;
		 
		 for(int i = 0; i <= limite;i++) {
			 right = i;
			 System.out.println(left + "-" +right);
		 }
		 for(int j = 0; j <= limite;j++) {
			 right = j;
			 left=1;
			 System.out.println(left + "-" +right);
		 }
		scanner.close();
	}

}

