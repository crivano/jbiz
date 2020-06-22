package com.crivano.jbiz;

import com.crivano.jlogic.Expression;

public interface IAction<E extends IEntity, A extends IActor> {
	Expression allowed(A actor, A onBehalfOf, E entity);

	void before(A actor, A onBehalfOf, E entity);

	void after(A actor, A onBehalfOf, E entity);

	String getName();

	String getIcon();

	void execute(A actor, A onBehalfOf, E element) throws Exception;

	void init(E element);

	void beforeValidate(E element);
}
