package ro.ase.csie.cts.g1088.testare.modele.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.csie.cts.g1088.testare.modele.Student;
import ro.ase.csie.cts.g1088.testare.modele.exceptii.ExceptieNota;
import ro.ase.csie.cts.g1088.testare.modele.exceptii.ExceptieVarsta;
import ro.ase.csie.cts.g1088.testare.modele.teste.categorii.TestImportant;

public class TestareStudentAlteTeste {
	
	//test fixture
	static Student student;
	static ArrayList<Integer> noteInitiale= new ArrayList<Integer>();
	static String numeInitial;
	static int varstaInitiala;
	static int nrNoteInitiale;
	static ArrayList<Integer> noteRandom;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		numeInitial="Gigel";
		varstaInitiala=Student.MIN_VARSTA +1;
		nrNoteInitiale=3;
		for(int i=0; i <nrNoteInitiale; i++) {
			noteInitiale.add(Student.MAX_NOTA-i);
		}
		
		noteRandom = new ArrayList<>();
		int nrNote = (int) 1e6;
		Random random = new Random();
		for (int i = 0; i < nrNote; i++) {
			noteRandom.add(random.nextInt(Student.MAX_NOTA) + 1);
		}
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	
    //se executa inainte de fiecare unit test
	@Before
	public void setUp() throws Exception {
		student= new Student(numeInitial, varstaInitiala, noteInitiale);
	}

	@After
	public void tearDown() throws Exception {
		student=null;
	}
	
	//TEST RANGE
	@Test(expected=ExceptieVarsta.class)
	public void testSetVarstaRangeMinValue() throws ExceptieVarsta {
		int varstaNoua=Integer.MIN_VALUE;
		student.setVarsta(varstaNoua);
	}
	//TEST RANGE
	@Test(expected=ExceptieVarsta.class)
	public void testSetVartaRangeValoarePozitivaMare() throws ExceptieVarsta {
		int varstaNoua=200;
		student.setVarsta(varstaNoua);
	}

	//TEST BOUNDARY LIMITA INFERIOARA
	@Test
	public void testSetVarstaBoundaryLimitaInferioara() throws ExceptieVarsta {
		int varstaNoua=Student.MIN_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("Test pentru varsta minima", varstaNoua, varstaStudent);
	}
	//TEST BOUNDARY LIMITA SUP
	@Test
	public void testSetVarstaBoundaryLimitaSuperioara() throws ExceptieVarsta {
		int varstaNoua=Student.MAX_VARSTA;
		student.setVarsta(varstaNoua);
		int varstaStudent=student.getVarsta();
		assertEquals("Test pentru varsta maxima", varstaNoua, varstaStudent);
	}
	
	//TEST REFERENCE
	@Test
	public void testSetNoteReferenceShallowCopy() throws ExceptieNota {
		int[] noteStudent= new int[] {9,9,10};
		ArrayList<Integer> refNote= new ArrayList<Integer>(Arrays.asList(9,9,10));
		
		student.setNote(refNote);
		refNote.set(0, 5);
		
		int noteExistente[] = new int[student.getNrNote()];
		for(int i=0; i<student.getNrNote(); i++) {
			noteExistente[i]=student.getNota(i);
		}
		
		assertArrayEquals("Test shallow copy pe setNote", noteStudent, noteExistente);
		
		
	}
	//TEST PERFORMANCE(de performanta sau de timp) - cat de repede calculeaza
	@Test 
	public void testGetMediePerformance() throws ExceptieNota {
		ArrayList<Integer> note = new ArrayList<>();
		int nrNote = (int) 1e6;
		Random random = new Random();
		for (int i = 0; i < nrNote; i++) {
			note.add(random.nextInt(Student.MAX_NOTA) + 1);
		}
		student.setNote(note);

		long tStart = System.currentTimeMillis();
		student.getMedie();
		long tFinal = System.currentTimeMillis();

		long durata = tFinal - tStart;

		if (durata <= 10) {
			assertTrue(true);
		} else {
			fail("Calculul mediei dureaza mai mult de 10 milisecunde");
		}
	}
	
	//TEST PERFORMANCE
	@Category(TestImportant.class)
	@Test(timeout=20)
	public void testGetMediePerformance2() throws ExceptieNota {
		
		student.setNote(noteRandom);
		
		student.getMedie();
	}
	
	//TEST INVERSE
	@Test
	public void testSetVarstaInverse() throws ExceptieVarsta {
		int varstaNoua= varstaInitiala +1;
		student.setVarsta(varstaNoua);
		assertNotEquals("Set nu modifica valoarea atributului",varstaInitiala, student.getVarsta());
	}
	
	@Test
	public void setGetNotaMinima() throws ExceptieNota {
		ArrayList<Integer> note= new ArrayList<Integer>();
		Random random= new Random();
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		
		student.setNote(note);
		
		int notaMinima=student.getNotaMinima();
		
		for(int i=0; i< student.getNrNote(); i++) {
			if(notaMinima > student.getNota(i)) {
				fail("Minimul nu e calculat corect");
			}
		}
		
		assertTrue(true);
	}
	
	//TEST CROSS
	@Test
	public void testGetMedieCrossCheck() throws ExceptieNota {
		ArrayList<Integer> note= new ArrayList<Integer>();
		Random random= new Random();
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		note.add(random.nextInt(Student.MAX_NOTA)+1);
		
		student.setNote(note);
		
		int notaMinima=Collections.min(note);
		int notaMinimaCalculata=student.getNotaMinima();
		
		assertEquals("Nota minima nu e ok", notaMinima, notaMinimaCalculata);
	}
}
