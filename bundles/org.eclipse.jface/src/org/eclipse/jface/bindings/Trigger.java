/*******************************************************************************
 * Copyright (c) 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jface.bindings;

/**
 * <p>
 * Any object that can be used as a trigger for a binding. This ensures that
 * trigger conform to certain minimum requirements. Namely, triggers need to be
 * hashable.
 * </p>
 * <p>
 * To assist with the hashing, some member fields have been provided:
 * <code>HASH_FACTOR</code>,<code>hashCode</code> and
 * <code>hashCodeComputed</code>.
 * </p>
 * <p>
 * <em>EXPERIMENTAL</em>. The commands architecture is currently under
 * development for Eclipse 3.1. This class -- its existence, its name and its
 * methods -- are in flux. Do not use this class yet.
 * </p>
 * 
 * @since 3.1
 */
public abstract class Trigger implements Comparable {

    /**
     * Tests whether this object is equal to another object. A handle object is
     * only equal to another trigger with the same properties.
     * 
     * @param object
     *            The object with which to compare; may be <code>null</code>.
     * @return <code>true</code> if the objects are equal; <code>false</code>
     *         otherwise.
     */
    public abstract boolean equals(final Object object);

    /**
     * Computes the hash code for this object.
     * 
     * @return The hash code for this object.
     */
    public abstract int hashCode();
}
