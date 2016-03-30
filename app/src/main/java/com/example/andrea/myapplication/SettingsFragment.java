package com.example.andrea.myapplication;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Andrea on 24/02/2016.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.pref_general);
    }

}
