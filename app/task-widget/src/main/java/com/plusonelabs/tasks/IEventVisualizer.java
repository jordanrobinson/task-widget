package com.plusonelabs.tasks;

import android.widget.RemoteViews;

import com.plusonelabs.tasks.widget.WidgetEntry;

import java.util.List;

public interface IEventVisualizer<T extends WidgetEntry> {

	RemoteViews getRemoteView(WidgetEntry eventEntry);

	int getViewTypeCount();

	List<T> getEventEntries();

	Class<? extends T> getSupportedEventEntryType();

}
