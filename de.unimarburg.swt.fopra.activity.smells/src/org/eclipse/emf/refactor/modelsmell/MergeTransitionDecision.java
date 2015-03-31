package org.eclipse.emf.refactor.modelsmell;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.smells.interfaces.IModelSmellFinder;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.Model;


public final class MergeTransitionDecision implements IModelSmellFinder {

	@Override
	public LinkedList<LinkedList<EObject>> findSmell(EObject root) {
		LinkedList<LinkedList<EObject>> results = new LinkedList<LinkedList<EObject>>();
		Activity model = (Activity) root;
		System.out.println("vor schleifen passts");
			EList<ActivityEdge> allActivityEdges = getAllActivityEdges(model);
			for (ActivityEdge activityEdge : allActivityEdges) {
				if ( (activityEdge.getSource() instanceof MergeNode)
						&& (activityEdge.getTarget() instanceof DecisionNode) ) {
					LinkedList<EObject> result = new LinkedList<EObject>();
					result.add(activityEdge);
					// TODO
					results.add(result);
				}
			}
		return results;
	}

	private EList<ActivityEdge> getAllActivityEdges(Activity activity) {
		EList<Element> elems = activity.allOwnedElements();
		EList<ActivityEdge> activityEdges = new BasicEList<ActivityEdge>();
//		System.out.println("Hallo Welt, hier ist getAllActivityEdges: ");
		for(Element elem : elems) {
			if (elem instanceof ActivityEdge) {
				activityEdges.add((ActivityEdge) elem);
			}
		}
		return activityEdges;
	}

	private EList<Activity> getAllActivities(Model model) {
		EList<Element> elems = model.allOwnedElements();
		EList<Activity> activities = new BasicEList<Activity>();
//		System.out.println("Hallo Welt, hier ist getAllActivityEdges: ");
		for (Element elem : elems) {
			if (elem instanceof Activity) {
				activities.add((Activity) elem);
			}
		}
		return activities;
	}
	
}