package com.plusonelabs.tasks.prefs;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.plusonelabs.tasks.EventAppWidgetProvider;
import com.plusonelabs.tasks.R;

public class EventDetailsPreferencesFragment extends PreferenceFragment {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_event_details);
	}

	@Override
	public void onPause() {
		super.onPause();
		EventAppWidgetProvider.updateEventList(getActivity());
		EventAppWidgetProvider.updateAllWidgets(getActivity());
	}
}