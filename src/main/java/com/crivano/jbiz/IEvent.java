package com.crivano.jbiz;

import java.util.Date;

public interface IEvent {

	public abstract IActor getActor();

	public abstract Date getBegin();

	public abstract Date getFinish();

	public abstract IEvent getCanceledBy();

}
