package org.eclipse.e4.ui.css.swt.dom;

import org.eclipse.e4.ui.css.core.engine.CSSEngine;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.custom.CTabItem;
import org.eclipse.swt.widgets.Item;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class CTabItemElement extends ItemElement {

	public CTabItemElement(Item item, CSSEngine engine) {
		super(item, engine);
	}

	protected void computeStaticPseudoInstances() {
		super.computeStaticPseudoInstances();
		// it's CTabFolder. Set selected as static pseudo instance.
		// because this widget define methods
		// CTabFolder#setSelectionBackground (Color color)
		// which set background Color when a CTabItem is selected.
		super.addStaticPseudoInstance("selected");
	}

	public Node getParentNode() {
		CTabItem item = getItem();
		CTabFolder parent = item.getParent();
		if (parent != null) {
			Element element = getElement(parent);
			return element;
		}
		return null;
	}

	private CTabItem getItem() {
		return (CTabItem) getNativeWidget();
	}

}
