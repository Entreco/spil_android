package nl.entreco.spil.android;

import android.os.Bundle;
import android.view.Menu;

public class MainActivity extends BaseActivity {
	
	/****************************************
	 * FIELDS
	 ***************************************/
	/****************************************
	 * CONSTRUCTORS
	 ***************************************/

	/****************************************
	 * ACTIVITY LIFECYCLE
	 ***************************************/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
}
