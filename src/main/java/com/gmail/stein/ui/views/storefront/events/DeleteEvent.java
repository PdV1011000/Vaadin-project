package com.gmail.stein.ui.views.storefront.events;

import com.vaadin.flow.component.ComponentEvent;
import com.gmail.stein.ui.views.orderedit.OrderItemEditor;

public class DeleteEvent extends ComponentEvent<OrderItemEditor> {
	public DeleteEvent(OrderItemEditor component) {
		super(component, false);
	}
}