package com.crivano.jbiz;

import java.util.Date;

public interface IEvent<E extends IEntity> {

	public abstract IActor getActor();

	public abstract Date getBegin();

	public abstract Date getFinish();

	public abstract IEvent getCanceledBy();

}
