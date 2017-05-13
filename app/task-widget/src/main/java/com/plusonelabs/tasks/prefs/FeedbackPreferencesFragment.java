package com.plusonelabs.tasks.prefs;

import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.preference.PreferenceScreen;

import com.plusonelabs.tasks.R;
import com.plusonelabs.tasks.calendar.CalendarQueryResultsStorage;

public class FeedbackPreferencesFragment extends PreferenceFragment {

	@Override
	public boolean onPreferenceTreeClick(PreferenceScreen preferenceScreen, Preference preference) {
		switch (preference.getKey()) {
            case CalendarPreferences.KEY_SHARE_EVENTS_FOR_DEBUGGING:
                CalendarQueryResultsStorage.shareEventsForDebugging(getActivity());
			default:
				break;
		}
		return super.onPreferenceTreeClick(preferenceScreen, preference);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences_feedback);
	}
}