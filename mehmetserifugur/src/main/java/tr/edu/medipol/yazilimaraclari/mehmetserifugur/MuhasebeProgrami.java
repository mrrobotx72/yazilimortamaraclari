package tr.edu.medipol.yazilimaraclari.mehmetserifugur;

public class MuhasebeProgrami {

	public static void main(String[] args) {
		System.out.println(ucretHesapla(12, 150));
	}

	
	public static Ucret ucretHesapla(int calisilanSaat, int saatlikUcret) {
		return new Ucret(calisilanSaat, saatlikUcret);
	}

	public static class Ucret {
		int calisilanSaat;
		int saatlikUcret;
		int ucret;

		public Ucret(int calisilanSaat, int saatlikUcret) {
			this.calisilanSaat = calisilanSaat;
			this.saatlikUcret = saatlikUcret;
			this.ucret = calisilanSaat * saatlikUcret;
		}

		@Override
		public String toString() {
			return "" + calisilanSaat + " * " + saatlikUcret + " = " + ucret + "";
		}
	}

}






