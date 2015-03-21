package org.eclipse.emf.refactor.metrics;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.metrics.interfaces.IMetricCalculator;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;

public final class NEA1 implements IMetricCalculator {
		
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
		for (ActivityEdge edge : in.getEdges()) {
			{
				ret++;
			}
		}
		// end custom code
		return ret;
	}
}