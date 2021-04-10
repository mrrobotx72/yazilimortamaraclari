package tr.edu.medipol.yazilimaraclari.mehmetserifugur;

import org.junit.Assert;
import org.junit.Test;

import tr.edu.medipol.yazilimaraclari.mehmetserifugur.MuhasebeProgrami.Ucret;

public class MuhasebeProgramiTest {

	@Test
	public void test1() throws Exception {
		int calisilanSaat = 12;
		int saatlikUcret = 150;


		int expected = 1800;

		Ucret actual = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		Assert.assertEquals(actual.ucret, expected);


	}

	@Test
	public void test2() throws Exception {
		int calisilanSaat = 8;
		int saatlikUcret = 50;


		int expected = 400;

		Ucret actual = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		Assert.assertEquals(actual.ucret, expected);


	}

	@Test
	public void test3() throws Exception {
		int calisilanSaat = 15;
		int saatlikUcret = 60;


		int expected = 900;

		Ucret actual = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		Assert.assertEquals(actual.ucret, expected);


	}

	@Test
	public void test4() throws Exception {
		int calisilanSaat = 24;
		int saatlikUcret = 1000;


		int expected = 24000;

		Ucret actual = MuhasebeProgrami.ucretHesapla(calisilanSaat, saatlikUcret);

		Assert.assertEquals(actual.ucret, expected);


	}

}


