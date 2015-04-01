/**
 * <copyright>
 * </copyright>
 *
 * $Id: RefactoringGuiHandler.javajet,v 1.3 2012/11/26 15:39:40 tarendt Exp $
 */
package de.unimarburg.swt.fopra.activity.refactorings.de.pum.swt.uml.roa;

import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.core.Refactoring;
import org.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler;
import org.eclipse.ltk.ui.refactoring.RefactoringWizard;

/**
 * Class used for specifying gui topics of a specific model refactoring.
 * @generated
 */
public class RefactoringGuiHandler implements IGuiHandler {

	/**
	 * Refactoring supported by the GuiHandler.
	 * @generated
	 */
	private Refactoring parent;
	
	/**
	 * @see org.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler#getParent()
	 * @generated
	 */
	@Override
	public Refactoring getParent() {
		return parent;
	}

	/**
	 * @see oorg.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler#
	 * setParent(Refactoring)
	 * @generated
	 */
	@Override
	public void setParent(Refactoring refactoring) {
		this.parent = refactoring;
	}
		
	/**
	 * @see org.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler#show()
	 * @generated
	 */
	@Override
	public RefactoringWizard show() {
		return new de.unimarburg.swt.fopra.activity.refactorings.de.pum.swt.uml.roa.RefactoringWizard
		((RefactoringController)this.parent.getController());
	}
	
	/**
	 * @see org.eclipse.emf.refactor.refactoring.interfaces.IGuiHandler#
	 * showInMenu(java.util.List)
	 * @generated
	 */
	@Override
	public boolean showInMenu(List<EObject> selection) {
		for(EObject o:selection){
			if(null != o){
				if (o instanceof org.eclipse.uml2.uml.OpaqueAction) {
					return true;
				}
			} 
		}
		return false;
	}

}	
	