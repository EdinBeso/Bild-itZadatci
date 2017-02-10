package zadaci09_02_2017;

public class prijestupnaGodina {

	public static void main(String[] args) {
        
		int prijestupnaGodina = 0;
		int brojac = 0;
		// Petlja ide od 101 do 2100
		for (int i = 101; i < 2100; i++) {
			// Provjeravamo da li je godina prijestupna
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0){
				// Ispisujemo korisniku prijestupne godine
				System.out.print(i+" ");
				// Povecavamo brojac i broj prijestupnih godina
				brojac++;
				prijestupnaGodina++;
			}	
			// Ako je brojac izbrojao 10 preskacemo u novi red i resetujemo brojac
			if(brojac == 10){
				System.out.println();
				brojac = 0;
			}
		    }
		// ispisujemo koliko imamo prijestupnih godina u novom redu
		System.out.printf("\n Prijestupnih godina ima: "+prijestupnaGodina);
	}
}
