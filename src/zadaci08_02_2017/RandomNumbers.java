package zadaci08_02_2017;

public class RandomNumbers {

	public static void main(String[] args) {
        // Niz za uporeðivanje brojeva
		int [] niz = {0,1,2,3,4,5,6,7,8,9};
		// Niz koji broji koliko se broj puta ponavlja
		int [] broj = new int [10];
		// Petlja broji do 100
		for (int i = 0; i < 100; i++) {
			// Nasumican odabir brojeva
			int random = (int)(Math.random()* 10);
			// Petlja prolazi sve brojeve poredi sa random odabirom i broji koliko se koji broj ponavlja
			for (int j = 0; j < broj.length; j++) {
				if(random == niz[j]){
					broj[j]++;
			}
			}
		    }
		 // Petlja prolazi sve brojeve i ispisuje korisniku rezultat
		 for (int j = 0; j < broj.length; j++) {
			System.out.println("Broj "+j+" ponovio se: "+broj[j]+" puta");
		}
	    }
        }
