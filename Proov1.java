public class Proov1{
	public static void main(String[] arg){
		Kolmkola k = new Kolmkola(60);
		Kolmkola c = new CKolmkola();
		System.out.println(k.pohitoon()+", "+k.terts()+", "+k.kvint());
		System.out.println(c.pohitoon()+", "+c.terts()+", "+c.kvint());
	}
}