package ro.ase.csie.cts.g1088.testare.modele.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1088.testare.modele.Student;
import ro.ase.csie.cts.g1088.testare.modele.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1088.testare.modele.exceptii.ExceptieNume;
import ro.ase.csie.cts.g1088.testare.modele.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1088.testare.modele.teste.categorii.TestImportant;
import ro.ase.csie.cts.g1088.testare.modele.teste.categorii.TestPerformanta;

public class TestareStudent {

	// test fixture
	static Student student;
	static ArrayList<Integer> note;
	static String numeIntial = "Gigel";
	static int varstaInitiala = 21;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		note = new ArrayList<>();
		note.add(9);
		note.add(7);
		note.add(10);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		note.clear();
		note = null;
	}

	@Before
	public void setUp() throws Exception {
		student = new Student(numeIntial, varstaInitiala, note);
	}

	@After
	public void tearDown() throws Exception {
		student = null;
	}

	@Ignore //sau @Disabled
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetVarstaConformanceRight() throws ExceptieVarsta {

		int varstaNoua = 23;
		student.setVarsta(varstaNoua);

		assertEquals("Test cu valori corecte", varstaNoua, student.getVarsta());
	}

	@Test
	public void testSetNumeRight() {
		String numeNou = "Ana";
		try {
			student.setNume(numeNou);
			assertEquals("Test cu valori corecte", numeNou, student.getNume());
		} catch (ExceptieNume e) {
			fail("Genereaza exceptie pentru valori vorecte");
		}
	}

	@Test
	public void testSetVarstaErrpeCondition() {
		int varstaNoua = Student.MIN_VARSTA - 1;
		try {
			student.setVarsta(varstaNoua);
			fail("NU genereaza execptie pentru varsta in afara limitelor");
		} catch (ExceptieVarsta e) {
			assertTrue(true);
		}
	}
	
	@Test(expected = ExceptieNume.class)
	public void testSetNumeErrorCondition() throws ExceptieNume {
		String numeNou = "Io";
		student.setNume(numeNou);
	}
	
	@Category({TestPerformanta.class, TestImportant.class})
	@Test
	public void testGetNotaMinimaOrderingSetSortatCrescator() throws ExceptieNota {
		int notaMinima=4;
		ArrayList<Integer> note= new ArrayList<>();
		for(int i=0; i< 5; i++) {
			note.add(i+notaMinima);
		}
		student.setNote(note);
		
		int notaMinimaCalculata=student.getNotaMinima();
		//la prima avem nota minima asteptata si apoi calculata
		assertEquals("Test cu valori sortate crescator",notaMinima, notaMinimaCalculata);
	}
	
	@Category(TestImportant.class)
	@Test
	public void testGetNotaMinimaCardinalitatyZero() throws ExceptieNota {
		ArrayList<Integer> note= new ArrayList<>();
		student.setNote(note);
		int notaMinima=0;
		int notaMinimaCalculata=student.getNotaMinima();
		assertEquals("Test fara note",notaMinima, notaMinimaCalculata);
	}
	
	@Test
	public void testGetNotaMinimaCardinalitatyUnu() throws ExceptieNota {
		ArrayList<Integer> note= new ArrayList<>();
		note.add(Student.MAX_NOTA);
		student.setNote(note);
		
		int notaMinima=student.MAX_NOTA;
		int notaMinimaCalculata=student.getNotaMinima();
		assertEquals("Test cu o nota",notaMinima, notaMinimaCalculata);
	}
	
	@Test
	public void testGetNotaMinimaExistenceReferintaNoteNull() throws ExceptieNota {
		student.setNote(null);
		int notaMinima=0;
		int notaMinimaCalculata= student.getNotaMinima();
		assertEquals("Test referinta null pentru note",notaMinima, notaMinimaCalculata);
	}
}
