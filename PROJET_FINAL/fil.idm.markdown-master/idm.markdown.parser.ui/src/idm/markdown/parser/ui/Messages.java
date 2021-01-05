/**
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package idm.markdown.parser.ui;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.papyrus.designer.languages.java.reverse.ui.messages"; //$NON-NLS-1$

	public static String ReverseCodeHandler_NoModelError_Message;

	public static String ReverseCodeHandler_NoModelError_Title;

	public static String ReverseCodeHandler_NoPapyrusEditor_Title;

	public static String ReverseCodeHandler_NoPapyrusEditor_Message;

	public static String DndReverseCodeHandler_CantDisplayResult_Title;

	public static String DndReverseCodeHandler_CantDisplayResult_Message;

	public static String DndReverseCodeHandler_CantFindService_Title;

	public static String DndReverseCodeHandler_CantFindService_Message;

	public static String ReverseCodeHandler_WrongSelectionType_Title;

	public static String ReverseCodeHandler_WrongSelectionType_Message;

	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
