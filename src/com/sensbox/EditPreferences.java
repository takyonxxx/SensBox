/*T�RKAY B�L�YOR   turkaybiliyor@hotmail.com*/
package com.sensbox;
import android.os.Bundle;
import android.preference.PreferenceActivity;
public class EditPreferences extends PreferenceActivity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.preferences);
	}	
}
