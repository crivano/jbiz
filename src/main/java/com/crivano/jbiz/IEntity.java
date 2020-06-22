package com.crivano.jbiz;

import java.util.Date;
import java.util.SortedSet;

public interface IEntity extends IItem {
	Date getBegin();

	void setBegin(Date dt);

	SortedSet<? extends IEvent<?>> getEvent();

	// SortedSet<IAction> getActions();
}
