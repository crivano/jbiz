package com.crivano.jbiz;

import java.util.SortedSet;

public interface IElement extends IItem {
	SortedSet<IChange> getChange();

	// SortedSet<IAction> getActions();
}
