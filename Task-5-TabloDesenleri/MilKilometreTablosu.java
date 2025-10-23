package KarmasıkCıktıFormatları;

public class DonusumTablosu {

	public static void main(String[] args) {
		double mil = 1.609;
		System.out.println(" __________________________________________________________________________ ");
		System.out.println("|                                                                          |");
		System.out.println("|                  MİL=>KİLOMETRE DÖNÜŞTÜRME TABLOSU                       |");
		System.out.println("|__________________________________________________________________________|");
		System.out.println("|                                                                          |");		
		System.out.println("|    1 mil     |    5 mil     |    10 mil    |    20 mil    |    50 mil    |");
		System.out.println("|--------------------------------------------------------------------------|");
		System.out.print("|    "+mil*1);
		System.out.print("km");
		System.out.print("   |    "+mil*5);
		System.out.print("km");
		System.out.print("   |    "+mil*10);
		System.out.print("km");
		System.out.print("   |    "+mil*20);
		System.out.print("km");
		System.out.print("   |    "+mil*50);
		System.out.print("km");
		System.out.println("   |");
		System.out.println("|__________________________________________________________________________|");
	}

}
