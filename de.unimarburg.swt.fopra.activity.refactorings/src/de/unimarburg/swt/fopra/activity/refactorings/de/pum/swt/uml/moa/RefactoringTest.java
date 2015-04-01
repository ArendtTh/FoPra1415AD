/**
 * <copyright>
 * </copyright>
 *
 * $Id: RefactoringTest.javajet,v 1.3 2012/11/26 15:39:40 tarendt Exp $
 */
 
package de.unimarburg.swt.fopra.activity.refactorings.de.pum.swt.uml.moa;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.runtime.test.JUnitTestCaseAdapter;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Class used for running individual JUnit test cases
 * of the specific model refactoring.
 * @generated
 */
@RunWith(value = Parameterized.class)
public class RefactoringTest extends JUnitTestCaseAdapter {

	/**
	 * Number of test cases.
	 * @generated
	 */
	private String number;

	/**
	 * Constructor implementation.
	 * @param number Number of test cases.
	 * @generated
	 */
	public RefactoringTest(String number) throws IOException {
		super("de.pum.swt.uml.moa",
			"uml",
			new File(".").getCanonicalPath(),
			new Refactoring(null, "", "http://www.eclipse.org/uml2/5.0.0/UML", new RefactoringGuiHandler(), new RefactoringController()));
		//register(info.getMetaModelName()Package.eINSTANCE);
		this.number = number;
	}
	
	@Parameters
	public static Collection<Object[]> data() {
		List<String> testNumbers = getTestNumbers();
		Object[][] data = new Object[testNumbers.size()][1];
		for (int i = 0; i < testNumbers.size(); i++) {
			data[i][0] = testNumbers.get(i);
		}
		return Arrays.asList(data);
	}
	
	private static List<String> getTestNumbers() {
		List<String> numbers = new ArrayList<String>();
		try {
			String pathPrefix = new File(".").getCanonicalPath() + "/tests/" + "de.pum.swt.uml.moa";
			File testCaseDir = new File(pathPrefix,"/");
			FilenameFilter filter = new FilenameFilter() {
				public boolean accept(File dir, String name) {
					return name.startsWith("test_");
				}
			};
			String[] children = testCaseDir.list(filter);
			if (children != null) {
				for (String child : children) {
					numbers.add(
							child.substring(
									child.indexOf('_') + 1));
					}
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		return numbers;
	}

	/**
	 * Runs the test.
	 */	
	@Test
	public void test() {
		System.out.println("running test test_" + number);
		executeTestCase(number);
	}	
	
}