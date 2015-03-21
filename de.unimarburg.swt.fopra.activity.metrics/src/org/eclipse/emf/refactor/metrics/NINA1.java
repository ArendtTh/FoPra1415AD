package org.eclipse.emf.refactor.metrics;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.metrics.interfaces.IMetricCalculator;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.InitialNode;

public final class NINA1 implements IMetricCalculator {
		
	private List<EObject> context; 
		
	@Override
	public void setContext(List<EObject> context) {
		this.context=context;
	}	
		
	@Override
	public double calculate() {	
		org.eclipse.uml2.uml.Activity in = (org.eclipse.uml2.uml.Activity) context.get(0);
		double ret = 0.0;
		// begin custom code
		for (ActivityNode node : in.getNodes()) {
			if (node instanceof InitialNode) {
				ret++;
			}
		}
		// end custom code
		return ret;
	}
}