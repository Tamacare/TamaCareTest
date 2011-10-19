package tama.care.spel.test;

import android.test.ActivityInstrumentationTestCase2;
import tama.care.spel.myMain;
import java.util.ArrayList;
import com.jayway.android.robotium.solo.Solo;
import android.view.View;

public class myMenuTest extends ActivityInstrumentationTestCase2<myMain> {

	private static final int ACTIVITY_WAIT_MILLIS = 500;
	private Solo solo4;

	public myMenuTest() {
		super("tama.care.spel", myMain.class);
	}

	@Override
	public void setUp() throws Exception {
		solo4 = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		try {
			solo4.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
	}

	public void testRecorded() throws Exception {
		// test case id : 1.01, 1.02, 1.03, 1.04, 2.01
		solo4.waitForActivity("tama.care.spel.myMain", ACTIVITY_WAIT_MILLIS);
		solo4.sleep(5000);
		solo4.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		// test case id: 2.03, 
		solo4.sleep(1000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.options3));
		solo4.waitForActivity("tama.care.spel.options", ACTIVITY_WAIT_MILLIS);
		// test case id: 7.07, 7.06
		solo4.clickOnView(findViewById(tama.care.spel.R.id.soundBoff));
		solo4.sleep(4000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.soundBon));
		solo4.sleep(3000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.updatespeedBslow));
		solo4.sleep(3000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.updatespeedBnormal));
		solo4.goBack();
		solo4.sleep(3000);
		// test case id: 2.04, 8.0, 8.01	 
		solo4.clickOnView(findViewById(tama.care.spel.R.id.help4));
		solo4.waitForActivity("tama.care.spel.myHelp", ACTIVITY_WAIT_MILLIS);
		solo4.sleep(3000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.bNext));
		solo4.sleep(2000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.bNext));
		solo4.sleep(2000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.bBack));
		solo4.sleep(2000);
		solo4.clickOnView(findViewById(tama.care.spel.R.id.bBack));
		solo4.goBack();
		solo4.sleep(5000);
		// test case id: 2.05
		solo4.clickOnView(findViewById(tama.care.spel.R.id.credits5));
		solo4.waitForActivity("tama.care.spel.credits", ACTIVITY_WAIT_MILLIS);
		solo4.goBack();
		solo4.clickOnView(findViewById(tama.care.spel.R.id.exit6));
	}

	/**
	 * Enhanced view finder. First tries to find it from Activity, then from all Views under ViewRoot.
	 */
	public View findViewById(int id) {
		View view = solo4.getView(id);
		if (view != null)
			return view;

		ArrayList<View> views = solo4.getViews();
		for (View v : views) {
			if (v.getId() == id) {
				return v;
			}
		}
		return null;
	}

}
