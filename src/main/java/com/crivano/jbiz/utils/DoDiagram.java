package com.crivano.jbiz.utils;

import com.crivano.jbiz.IActor;
import com.crivano.jbiz.IChange;
import com.crivano.jbiz.IElement;
import com.crivano.jbiz.IItem;
import com.crivano.jbiz.IPerson;
import com.crivano.jbiz.IUnit;

public class DoDiagram {

	public static void main(String[] args) throws Exception {
		Diagram d = new Diagram();
		addClasses(d);
		d.createGraphML("jbiz.graphml", true, true);
	}

	public static void addClasses(Diagram d) {
		d.addClass(IActor.class, true, true);
		d.addClass(IChange.class, true, true);
		d.addClass(IElement.class, true, true);
		d.addClass(IItem.class, true, true);
		d.addClass(IPerson.class, true, true);
		d.addClass(IUnit.class, true, true);
	}

}
