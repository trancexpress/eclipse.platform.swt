/*******************************************************************************
 * Copyright (c) 2000, 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.swt.internal;

import java.io.*;
import java.net.*;
import java.util.jar.*;

public class Library {

	/* SWT Version - Mmmm (M=major, mmm=minor) */
	
	/**
	 * SWT Major version number (must be >= 0)
	 */
    static int MAJOR_VERSION = 4;
	
	/**
	 * SWT Minor version number (must be in the range 0..999)
	 */
    static int MINOR_VERSION = 412;
	
	/**
	 * SWT revision number (must be >= 0)
	 */
	static int REVISION = 0;
	
	/**
	 * The JAVA and SWT versions
	 */
	public static final int JAVA_VERSION, SWT_VERSION;

static {
	JAVA_VERSION = parseVersion(System.getProperty("java.version"));
	SWT_VERSION = SWT_VERSION(MAJOR_VERSION, MINOR_VERSION);
}

static int parseVersion(String version) {
	if (version == null) return 0;
	int major = 0, minor = 0, micro = 0;
	int length = version.length(), index = 0, start = 0;
	while (index < length && Character.isDigit(version.charAt(index))) index++;
	try {
		if (start < length) major = Integer.parseInt(version.substring(start, index));
	} catch (NumberFormatException e) {}
	start = ++index;
	while (index < length && Character.isDigit(version.charAt(index))) index++;
	try {
		if (start < length) minor = Integer.parseInt(version.substring(start, index));
	} catch (NumberFormatException e) {}
	start = ++index;
	while (index < length && Character.isDigit(version.charAt(index))) index++;
	try {
		if (start < length) micro = Integer.parseInt(version.substring(start, index));
	} catch (NumberFormatException e) {}
	return JAVA_VERSION(major, minor, micro);
}

/**
 * Returns the Java version number as an integer.
 * 
 * @param major
 * @param minor
 * @param micro
 * @return the version
 */
public static int JAVA_VERSION (int major, int minor, int micro) {
	return (major << 16) + (minor << 8) + micro;
}

/**
 * Returns the SWT version number as an integer.
 * 
 * @param major
 * @param minor
 * @return the version
 */
public static int SWT_VERSION (int major, int minor) {
	return major * 1000 + minor;
}

static boolean isLoadable () {
	URL url = Platform.class.getClassLoader ().getResource ("org/eclipse/swt/internal/Library.class"); //$NON-NLS-1$
	if (!url.getProtocol ().equals ("jar")) { //$NON-NLS-1$
		/* SWT is presumably running in a development environment */
		return true;
	}

	try {
		url = new URL (url.getPath ());
	} catch (MalformedURLException e) {
		/* should never happen since url's initial path value must be valid */
	}
	String path = url.getPath ();
	int index = path.indexOf ('!');
	File file = new File (path.substring (0, index));

	Attributes attributes = null;
	try {
		JarFile jar = new JarFile (file);
		attributes = jar.getManifest ().getMainAttributes ();
	} catch (IOException e) {
		/* should never happen for a valid SWT jar with the expected manifest values */
		return false;
	}

	String os = System.getProperty ("os.name"); //$NON-NLS-1$;
	String arch = System.getProperty ("os.arch"); //$NON-NLS-1$
	String manifestOS = attributes.getValue ("SWT-OS"); //$NON-NLS-1$
	String manifestArch = attributes.getValue ("SWT-Arch"); //$NON-NLS-1$
	return arch.equals (manifestArch) && os.equals (manifestOS);
}

/**
 * Loads the shared library that matches the version of the
 * Java code which is currently running.  SWT shared libraries
 * follow an encoding scheme where the major, minor and revision
 * numbers are embedded in the library name and this along with
 * <code>name</code> is used to load the library.  If this fails,
 * <code>name</code> is used in another attempt to load the library,
 * this time ignoring the SWT version encoding scheme.
 *
 * @param name the name of the library to load
 */
public static void loadLibrary (String name) {
	loadLibrary (name, true);
}

/**
 * Loads the shared library that matches the version of the
 * Java code which is currently running.  SWT shared libraries
 * follow an encoding scheme where the major, minor and revision
 * numbers are embedded in the library name and this along with
 * <code>name</code> is used to load the library.  If this fails,
 * <code>name</code> is used in another attempt to load the library,
 * this time ignoring the SWT version encoding scheme.
 *
 * @param name the name of the library to load
 * @param mapName true if the name should be mapped, false otherwise
 */
public static void loadLibrary (String name, boolean mapName) {
}

}
