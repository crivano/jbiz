package com.crivano.jbiz;

import com.crivano.jlogic.Expression;

public interface IAction<E extends Expression, P extends IActionParams> {
	public E allowed(IActor actor, IActor onBehalfOf, IItem item);

	public void execute(IActor actor, IActor onBehalfOf, IItem item, P params);

	public void before(IActor actor, IActor onBehalfOf, IItem item, P params);

	public void after(IActor actor, IActor onBehalfOf, IItem item, P params);

}
