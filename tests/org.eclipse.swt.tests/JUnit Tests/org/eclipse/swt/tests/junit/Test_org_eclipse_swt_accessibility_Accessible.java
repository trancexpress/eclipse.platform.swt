/*******************************************************************************
 * Copyright (c) 2000, 2004 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.tests.junit;

import java.util.Enumeration;
import java.util.Vector;

import junit.framework.*;
import junit.textui.*;

import org.eclipse.swt.widgets.*;
import org.eclipse.swt.accessibility.*;

/**
 * Automated Test Suite for class org.eclipse.swt.accessibility.Accessible
 *
 * @see org.eclipse.swt.accessibility.Accessible
 */
public class Test_org_eclipse_swt_accessibility_Accessible extends SwtTestCase {	

public Test_org_eclipse_swt_accessibility_Accessible(String name) {
	super(name);
}

public static void main(String[] args) {
	TestRunner.run(suite());
}

@Override
protected void setUp() {
	shell = new Shell();
	accessible = shell.getAccessible();
}

@Override
protected void tearDown() {
	assertEquals(false, shell.isDisposed());
	shell.dispose();
	assertTrue(shell.isDisposed());
}

public void test_addAccessibleControlListenerLorg_eclipse_swt_accessibility_AccessibleControlListener() {
	AccessibleControlListener listener = new AccessibleControlListener() {
		public void getValue(AccessibleControlEvent e) {
		}
		public void getChild(AccessibleControlEvent e) {
		}
		public void getChildAtPoint(AccessibleControlEvent e) {
		}
		public void getChildCount(AccessibleControlEvent e) {
		}
		public void getChildren(AccessibleControlEvent e) {
		}
		public void getDefaultAction(AccessibleControlEvent e) {
		}
		public void getFocus(AccessibleControlEvent e) {
		}
		public void getLocation(AccessibleControlEvent e) {
		}
		public void getRole(AccessibleControlEvent e) {
		}
		public void getSelection(AccessibleControlEvent e) {
		}
		public void getState(AccessibleControlEvent e) {
		}
	};
	accessible.addAccessibleControlListener(listener);
	accessible.removeAccessibleControlListener(listener);
}

public void test_addAccessibleListenerLorg_eclipse_swt_accessibility_AccessibleListener() {
	AccessibleListener listener = new AccessibleListener() {
		public void getName(AccessibleEvent e) {
		}
		public void getDescription(AccessibleEvent e) {
		}
		public void getHelp(AccessibleEvent e) {
		}
		public void getKeyboardShortcut(AccessibleEvent e) {
		}
	};
	accessible.addAccessibleListener(listener);
	accessible.removeAccessibleListener(listener);
}

public void test_addAccessibleTextListenerLorg_eclipse_swt_accessibility_AccessibleTextListener() {
	AccessibleTextListener listener = new AccessibleTextListener() {
		public void getSelectionRange(AccessibleTextEvent e) {
		}
		public void getCaretOffset(AccessibleTextEvent e) {
		}
	};
	accessible.addAccessibleTextListener(listener);
	accessible.removeAccessibleTextListener(listener);
}

public void test_getControl() {
	assertEquals(shell, accessible.getControl());
}

public static Test suite() {
	TestSuite suite = new TestSuite();
	Vector<String> methodNames = methodNames();
	Enumeration<String> e = methodNames.elements();
	while (e.hasMoreElements()) {
		suite.addTest(new Test_org_eclipse_swt_accessibility_Accessible(e.nextElement()));
	}
	return suite;
}

public static Vector<String> methodNames() {
	Vector<String> methodNames = new Vector<String>();
	methodNames.addElement("test_addAccessibleControlListenerLorg_eclipse_swt_accessibility_AccessibleControlListener");
	methodNames.addElement("test_addAccessibleListenerLorg_eclipse_swt_accessibility_AccessibleListener");
	methodNames.addElement("test_addAccessibleTextListenerLorg_eclipse_swt_accessibility_AccessibleTextListener");
	methodNames.addElement("test_getControl");
	return methodNames;
}

@Override
protected void runTest() throws Throwable {
	if (getName().equals("test_addAccessibleControlListenerLorg_eclipse_swt_accessibility_AccessibleControlListener")) test_addAccessibleControlListenerLorg_eclipse_swt_accessibility_AccessibleControlListener();
	else if (getName().equals("test_addAccessibleListenerLorg_eclipse_swt_accessibility_AccessibleListener")) test_addAccessibleListenerLorg_eclipse_swt_accessibility_AccessibleListener();
	else if (getName().equals("test_addAccessibleTextListenerLorg_eclipse_swt_accessibility_AccessibleTextListener")) test_addAccessibleTextListenerLorg_eclipse_swt_accessibility_AccessibleTextListener();
	else if (getName().equals("test_getControl")) test_getControl();
}

/* custom */
private Shell shell;
private Accessible accessible;
}
