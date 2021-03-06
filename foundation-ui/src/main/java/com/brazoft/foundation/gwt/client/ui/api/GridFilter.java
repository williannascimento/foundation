package com.brazoft.foundation.gwt.client.ui.api;

import com.google.gwt.jso.JSObject;

public abstract class GridFilter<J extends JSObject> {

	private boolean active;

	public GridFilter<J> activate() {
		this.active = true;
		return this;
	}

	public GridFilter<J> deactivate() {
		this.active = false;
		return this;
	}

	public boolean isActive() {
		return active;
	}

	public abstract boolean filter(J row);
}