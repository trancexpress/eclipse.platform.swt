/*******************************************************************************
 * Copyright (c) 2000, 2021 IBM Corporation and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    IBM Corporation - initial API and implementation
 *******************************************************************************/

/* Note: This file was auto-generated by org.eclipse.swt.tools.internal.JNIGenerator */
/* DO NOT EDIT - your changes will be lost. */

#ifdef NATIVE_STATS
extern int GTK4_nativeFunctionCount;
extern int GTK4_nativeFunctionCallCount[];
extern char* GTK4_nativeFunctionNames[];
#define GTK4_NATIVE_ENTER(env, that, func) GTK4_nativeFunctionCallCount[func]++;
#define GTK4_NATIVE_EXIT(env, that, func) 
#else
#ifndef GTK4_NATIVE_ENTER
#define GTK4_NATIVE_ENTER(env, that, func) 
#endif
#ifndef GTK4_NATIVE_EXIT
#define GTK4_NATIVE_EXIT(env, that, func) 
#endif
#endif

typedef enum {
	gdk_1content_1formats_1builder_1add_1mime_1type_FUNC,
	gdk_1content_1formats_1builder_1free_1to_1formats_FUNC,
	gdk_1content_1formats_1builder_1new_FUNC,
	gdk_1toplevel_1focus_FUNC,
	gdk_1toplevel_1get_1state_FUNC,
	gdk_1toplevel_1lower_FUNC,
	gdk_1toplevel_1set_1icon_1list_FUNC,
	gtk_1box_1append_FUNC,
	gtk_1box_1insert_1child_1after_FUNC,
	gtk_1box_1prepend_FUNC,
	gtk_1button_1new_1from_1icon_1name_FUNC,
	gtk_1button_1set_1child_FUNC,
	gtk_1calendar_1get_1date_FUNC,
	gtk_1calendar_1select_1day_FUNC,
	gtk_1calendar_1set_1show_1day_1names_FUNC,
	gtk_1calendar_1set_1show_1heading_FUNC,
	gtk_1calendar_1set_1show_1week_1numbers_FUNC,
	gtk_1check_1button_1get_1active_FUNC,
	gtk_1check_1button_1set_1active_FUNC,
	gtk_1check_1button_1set_1group_FUNC,
	gtk_1check_1button_1set_1inconsistent_FUNC,
	gtk_1check_1button_1set_1use_1underline_FUNC,
	gtk_1drag_1source_1new_FUNC,
	gtk_1drag_1source_1set_1actions_FUNC,
	gtk_1drag_1source_1set_1icon_FUNC,
	gtk_1drop_1target_1async_1new_FUNC,
	gtk_1drop_1target_1async_1set_1formats_FUNC,
	gtk_1file_1chooser_1get_1file_FUNC,
	gtk_1file_1chooser_1get_1files_FUNC,
	gtk_1file_1chooser_1set_1current_1folder_FUNC,
	gtk_1file_1chooser_1set_1file_FUNC,
	gtk_1hsv_1to_1rgb_FUNC,
	gtk_1icon_1paintable_1get_1file_FUNC,
	gtk_1icon_1theme_1get_1for_1display_FUNC,
	gtk_1icon_1theme_1lookup_1icon_FUNC,
	gtk_1im_1context_1filter_1keypress_FUNC,
	gtk_1init_1check_FUNC,
	gtk_1keyval_1trigger_1new_FUNC,
	gtk_1named_1action_1new_FUNC,
	gtk_1native_1get_1surface_FUNC,
	gtk_1picture_1new_FUNC,
	gtk_1picture_1set_1can_1shrink_FUNC,
	gtk_1picture_1set_1paintable_FUNC,
	gtk_1popover_1menu_1bar_1new_1from_1model_FUNC,
	gtk_1popover_1menu_1new_1from_1model_1full_FUNC,
	gtk_1popover_1menu_1set_1menu_1model_FUNC,
	gtk_1popover_1set_1has_1arrow_FUNC,
	gtk_1rgb_1to_1hsv_FUNC,
	gtk_1scrolled_1window_1get_1has_1frame_FUNC,
	gtk_1scrolled_1window_1new_FUNC,
	gtk_1scrolled_1window_1set_1child_FUNC,
	gtk_1scrolled_1window_1set_1has_1frame_FUNC,
	gtk_1shortcut_1controller_1add_1shortcut_FUNC,
	gtk_1shortcut_1controller_1new_FUNC,
	gtk_1shortcut_1controller_1remove_1shortcut_FUNC,
	gtk_1shortcut_1controller_1set_1scope_FUNC,
	gtk_1shortcut_1new_FUNC,
	gtk_1text_1get_1buffer_FUNC,
	gtk_1window_1destroy_FUNC,
	gtk_1window_1get_1icon_1name_FUNC,
	gtk_1window_1minimize_FUNC,
	gtk_1window_1new_FUNC,
	gtk_1window_1set_1child_FUNC,
	gtk_1window_1set_1default_1widget_FUNC,
	gtk_1window_1set_1icon_1name_FUNC,
	gtk_1window_1unminimize_FUNC,
} GTK4_FUNCS;
