/**
 * <copyright>
 * </copyright>
 *
 * $Id: RefactoringDataManagement.javajet,v 1.3 2012/11/26 15:39:40 tarendt Exp $
 */
package de.unimarburg.swt.fopra.activity.refactorings.de.pum.swt.uml.roa;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.refactoring.runtime.DataManagementAdapter;
import org.eclipse.emf.refactor.refactoring.core.Port;

/**
 * Class for specific data concerning a model refactoring.
 * @generated
 */
public class RefactoringDataManagement extends DataManagementAdapter {

	protected final String SELECTEDEOBJECT = "selectedEObject";

	/**
	 * Default constructor.
	 * @generated
	 */
	public RefactoringDataManagement() {
		this.addPorts();
	}
	
	/**
	 * Adds the ports to the data management used for parameter passing.
	 * @generated
	 */
	private void addPorts(){
		this.inPorts.add
			(new Port<org.eclipse.uml2.uml.OpaqueAction>
				(SELECTEDEOBJECT, org.eclipse.uml2.uml.OpaqueAction.class));
		this.inPorts.add
			(new Port<String>
				("newname", String.class, "unspecified"));		
	}
	
	/**
	 * @see org.eclipse.emf.refactor.refactoring.interfaces.IDataManagement#
	 * preselect(java.util.List)
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void preselect(List<EObject> selection) {
		getInPortByName(SELECTEDEOBJECT).
				setValue((org.eclipse.uml2.uml.OpaqueAction) selection.get(0));
	}

}
	