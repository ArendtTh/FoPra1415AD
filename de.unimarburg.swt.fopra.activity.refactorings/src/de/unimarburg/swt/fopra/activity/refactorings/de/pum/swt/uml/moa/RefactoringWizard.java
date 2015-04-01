/**
 * <copyright>
 * </copyright>
 *
 * $Id: RefactoringWizard.javajet,v 1.3 2012/11/26 15:39:40 tarendt Exp $
 */
package de.unimarburg.swt.fopra.activity.refactorings.de.pum.swt.uml.moa;

import org.eclipse.emf.refactor.refactoring.interfaces.IController;
import org.eclipse.emf.refactor.refactoring.runtime.ltk.ui.AbstractRefactoringWizard;

/**
 * Class used for providing an implementation of an LTK
 * RefactoringWizard in EMF Refactor.
 * @generated
 */
public class RefactoringWizard 
    extends AbstractRefactoringWizard {
		
	/**
	 * Default constructor implementation.
	 * @param controller Controller of the EMF model refactoring.
	 * @generated
	 */					
	public RefactoringWizard(IController controller) {
		super(controller);
	}

	/**
	 * @see org.eclipse.ltk.ui.refactoring.RefactoringWizard#
	 * addUserInputPages()
	 * @generated
	 */
	@Override
	protected void addUserInputPages() {
		addPage(new RefactoringWizardPage
			(controller.getParent().getName(), (RefactoringController)controller));
	}

}
