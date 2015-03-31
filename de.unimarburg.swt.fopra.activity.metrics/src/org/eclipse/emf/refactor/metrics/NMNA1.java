package org.eclipse.emf.refactor.metrics;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.metrics.interfaces.IMetricCalculator;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.MergeNode;

public final class NMNA1 implements IMetricCalculator {
		
	private List<EObject> context; 
		
	@Override
	public void setContext(List<EObject> context) {
		this.context=context;
	}	
		
	@Override
	public double calculate() {	
		org.eclipse.uml2.uml.Activity in = (org.eclipse.uml2.uml.Activity) context.get(0);
		double ret = 0.0;
		
		for(ActivityNode activity : in.getNodes()) {
			if(activity instanceof MergeNode){
				ret++;
			}
		}
		
		return ret;
	}
}