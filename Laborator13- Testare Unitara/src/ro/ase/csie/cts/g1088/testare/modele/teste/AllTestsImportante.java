package ro.ase.csie.cts.g1088.testare.modele.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.csie.cts.g1088.testare.modele.teste.categorii.TestImportant;

@RunWith(Categories.class)
@IncludeCategory({TestImportant.class})
@SuiteClasses({ TestareStudent.class, TestareStudentAlteTeste.class })
public class AllTestsImportante {

}
