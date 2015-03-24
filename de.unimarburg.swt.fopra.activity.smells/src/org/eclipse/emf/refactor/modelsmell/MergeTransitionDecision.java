package org.eclipse.emf.refactor.modelsmell;

import java.util.LinkedList;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.refactor.smells.interfaces.IModelSmellFinder;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Model;


public final class MergeTransitionDecision implements IModelSmellFinder {

	@Override
	public LinkedList<LinkedList<EObject>> findSmell(EObject root) {
		LinkedList<LinkedList<EObject>> results = new LinkedList<LinkedList<EObject>>();
		Model model = (Model) root;
		EList<Activity> allActivities = getAllActivities(model);
		for (Activity activity : allActivities) {
			EList<ActivityEdge> allActivityEdges = getAllActivityEdges(activity);
			for (ActivityEdge activityEdge : allActivityEdges) {
				// TODO
				if (true) {
					LinkedList<EObject> result = new LinkedList<EObject>();
					result.add(activityEdge);
					// TODO
					results.add(result);
				}
			}
		}
		return results;
	}

	private EList<ActivityEdge> getAllActivityEdges(Activity activity) {
		// TODO Auto-generated method stub
		return null;
	}

	private EList<Activity> getAllActivities(Model model) {
		EList<Element> elems = model.allOwnedElements();
		EList<Activity> activities = new BasicEList<Activity>();
		for (Element elem : elems) {
			if (elem instanceof Activity) {
				activities.add((Activity) elem);
			}
		}
		return activities;
	}
	
}