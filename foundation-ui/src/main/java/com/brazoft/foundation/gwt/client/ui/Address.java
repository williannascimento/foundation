/**
 * Copyright (C) 2009-2012 the original author or authors. See the notice.md file distributed with
 * this work for additional information regarding copyright ownership.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.brazoft.foundation.gwt.client.ui;

import com.brazoft.foundation.gwt.client.component.ElementResolver;
import com.brazoft.foundation.gwt.client.component.api.*;
import com.brazoft.foundation.gwt.client.ui.api.Bootstrap;

public final class Address
    extends Bootstrap<Address>
    implements HasText<Address> {

	public Address() {
		super(ElementResolver.address());
	}

	@Override
	public Address text(String text) {
		return Component.Util.setHTML(this, text);
	}

	@Override
	public String getText() {
		return Component.Util.getHTML(this);
	}
}