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

import com.brazoft.foundation.gwt.client.component.*;
import com.brazoft.foundation.gwt.client.component.api.Component;
import com.brazoft.foundation.gwt.client.event.Events;
import com.brazoft.foundation.gwt.client.ui.api.*;
import com.google.gwt.dom.client.*;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.event.dom.client.*;

public final class Button
    extends Bootstrap<Button>
    implements UIButton<Button> {

	private HTML<SpanElement> text = HTML.asSpan().hidden();

	private ButtonOptions     option;

	public Button() {
		this(ButtonOptions.BUTTON);
	}

	public Button(ButtonOptions option) {
		super(option.resolveElement());
		this.option = option;
		this.add(this.text).setStyleName("btn");
		this.inline();
	}

	@Override
	public Button onKeyPress(KeyPressHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onKeyDown(KeyDownHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onKeyUp(KeyUpHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onFocus(FocusHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onBlur(BlurHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onClick(ClickHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onDoubleClick(DoubleClickHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onMouseDown(MouseDownHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onMouseMove(MouseMoveHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onMouseOut(MouseOutHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onMouseOver(MouseOverHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onMouseUp(MouseUpHandler handler) {
		return Events.on(this, handler);
	}

	@Override
	public Button onMouseWheel(MouseWheelHandler handler) {
		return Events.on(this, handler);
	}

	public Button disable() {
		this.option.disable(this);
		return this;
	}

	public Button enable() {
		this.option.enable(this);
		return this;
	}

	public Button loadingText(String text) {
		return this.attribute("data-loading-text", text);
	}

	public Button behaveAsToggle() {
		return this.attribute("data-toggle", "button");
	}

	public Button block() {
		this.text.style().clearMarginLeft().clearMarginRight().clearDisplay();
		return this.className("btn-block");
	}

	public Button inline() {
		this.text.style().display(Display.INLINE_BLOCK).marginLeft(4, Unit.PX).marginRight(4, Unit.PX);
		return this;
	}

	public Button size(Size size) {
		return Widgets.setSize(this, size);
	}

	public Button primary() {
		return Widgets.setPrimary(this);
	}

	public Button info() {
		return Widgets.setInfo(this);
	}

	public Button success() {
		return Widgets.setSuccess(this);
	}

	public Button warning() {
		return Widgets.setWarning(this);
	}

	public Button danger() {
		return Widgets.setDanger(this);
	}

	public Button inverse() {
		return Widgets.setInverse(this);
	}

	public Button link() {
		return Widgets.setLink(this);
	}

	public Button expanded() {
		return Widgets.setExpanded(this);
	}

	public Button icon(Icon icon) {
		return Widgets.setIcon(this, icon, true);
	}

	@Override
	public Button text(String text) {
		Component.Util.setHTML(this.text.visible(), " " + text.trim() + " ");
		return this;
	}

	@Override
	public String getText() {
		return Component.Util.getHTML(this.text);
	}

	public enum ButtonOptions {
		ANCHOR, BUTTON, SUBMIT, RESET;

		Element resolveElement() {
			switch (this) {
				case ANCHOR:
					return ElementResolver.a();
				case BUTTON:
					return ElementResolver.button();
				case SUBMIT:
					return ElementResolver.submit();
				case RESET:
					return ElementResolver.reset();
			}

			return ElementResolver.button();
		}

		void disable(Button button) {
			switch (this) {
				case ANCHOR:
					Widgets.disabledClass(button);
					break;
				default:
					button.attribute("disabled", "disabled");
			}
		}

		void enable(Button button) {
			switch (this) {
				case ANCHOR:
					Widgets.enabledClass(button);
					break;
				default:
					button.removeAttribute("disabled");
			}
		}
	}
}
