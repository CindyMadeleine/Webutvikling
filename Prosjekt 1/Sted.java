import java.util.Scanner;
import java.io.IOException;

public class Sted {
	private static Scanner tastatur = new Scanner(System.in);
	public static void main(String[] args){
		ordrelokke();
	}

	private static void ordrelokke(){ 
		boolean fortsett = true; 
		while(fortsett){ 
			switch(lesOrdre()){ 
				case 1: leggInnSted();
					break; 
				case 2: fjernSted();
					break; 
				case 3: lagOversikt();
					break; 
				case 4:
					fortsett = false; 
			} 
		} 
	}

	private static int lesOrdre(){
		System.out.print("\nTast 1 for aa legge inn Sted\n"+ 
			"Tast 2 for aa fjerne Sted\n"+
			"Tast 3 for aa lage oversikt\n"+
			"Tast 4 for aa avslutte\n>");

		int num = 4;
		String sentenceNum;

		if((sentenceNum = tastatur.nextLine()) != null){
			try{
				num = Integer.parseInt(sentenceNum);
			} catch(NumberFormatException nfe){
				num = lesOrdre();
			}
		}


		return num;
	}
	private static void leggInnSted(){
		System.out.print("Navn: "); 
		String navn = tastatur.nextLine();
		System.out.print("Adresse: "); 
		String adresse = tastatur.nextLine(); 
		System.out.print("Beskrivelse: "); 
		String beskr = tastatur.nextLine();
	}

	private static void fjernSted(){ 
	}

	private static void lagOversikt(){

	}
}