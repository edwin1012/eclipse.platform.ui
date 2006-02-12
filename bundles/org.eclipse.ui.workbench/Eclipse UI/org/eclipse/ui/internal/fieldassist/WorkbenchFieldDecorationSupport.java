/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 ******************************************************************************/

package org.eclipse.ui.internal.fieldassist;

import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.fieldassist.IWorkbenchFieldDecorationConstants;
import org.eclipse.ui.internal.WorkbenchImages;
import org.eclipse.ui.internal.WorkbenchMessages;

/**
 * WorkbenchFieldDecorationSupport initializes the JFace FieldDecorationRegistry
 * with commonly used workbench field decorations.
 * 
 * @since 3.2
 */
public class WorkbenchFieldDecorationSupport {

	/**
	 * Create the commonly used workbench field decorations and set them into
	 * the JFace FieldDecorationRegistry. The images for the decorations are
	 * retrieved directly using WorkbenchImages, so they will be disposed for
	 * us. Therefore, there are no life-cycle images to worry about with respect
	 * to the images or the decoration registry.
	 * 
	 * @see IWorkbenchFieldDecorations
	 * @see FieldDecorationRegistry
	 */
	public static void initializeFieldDecorations() {
		FieldDecorationRegistry registry = new FieldDecorationRegistry();
		FieldDecorationRegistry.setDefault(registry);
		declareDecorations(registry);
	}

	/*
	 * Register the field decorations used by the workbench in the given
	 * registry.
	 */
	private static void declareDecorations(FieldDecorationRegistry registry) {

		/*------------- Content Assist Cue ----------- */
		registry.registerFieldDecoration(
				IWorkbenchFieldDecorationConstants.CONTENT_ASSIST_CUE,
				WorkbenchMessages.ContentAssist_Cue_Description,
				ISharedImages.IMG_DEC_CONTENT_PROPOSAL,
				WorkbenchImages.getImageRegistry());
	}
}
