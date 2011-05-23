package com.larvalabs.svgandroid.util;

import org.xml.sax.Attributes;

/**
 * @author Nicolas Gramlich
 * @since 14:22:28 - 22.05.2011
 */
public class SAXHelper {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	public static String getStringAttribute(final Attributes pAttributes, final String pAttributeName) {
		final int attributeCount = pAttributes.getLength();
		for (int i = 0; i < attributeCount; i++) {
			if (pAttributes.getLocalName(i).equals(pAttributeName)) {
				return pAttributes.getValue(i);
			}
		}
		return null;
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}