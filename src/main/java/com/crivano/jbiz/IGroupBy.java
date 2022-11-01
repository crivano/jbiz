package com.crivano.jbiz;

public interface IGroupBy extends IItem {
	public static final String GROUP_SEPARATOR = ": ";

	public String getGroup();

	default public String getGroupAndName() {
		return getGroup() + GROUP_SEPARATOR + getDescr();
	};
}
