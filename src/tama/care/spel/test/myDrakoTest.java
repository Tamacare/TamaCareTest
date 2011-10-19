package tama.care.spel.test;

import android.test.ActivityInstrumentationTestCase2;
import tama.care.spel.myMain;
import java.util.ArrayList;
import com.jayway.android.robotium.solo.Solo;
import android.view.View;

public class myDrakoTest extends ActivityInstrumentationTestCase2<myMain> {

	private static final int ACTIVITY_WAIT_MILLIS = 500;
	private Solo solo3;

	public myDrakoTest() {
		super("tama.care.spel", myMain.class);
	}

	@Override
	public void setUp() throws Exception {
		solo3 = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		try {
			solo3.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
	}

	public void testRecorded() throws Exception {
		//test case id: 1.01, 1.02, 1.03, 1.04, 2.01
		solo3.waitForActivity("tama.care.spel.myMain", ACTIVITY_WAIT_MILLIS);
		solo3.sleep(5000);
		solo3.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		solo3.sleep(3000);
		// test case id: 3.01,
		solo3.clickOnView(findViewById(tama.care.spel.R.id.newgame1));
		solo3.waitForActivity("tama.care.spel.newGame", ACTIVITY_WAIT_MILLIS);
		solo3.sleep(2000);
		// without entering any name or char 
		solo3.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		//show error message
		solo3.clearEditText(0);
		solo3.enterText(0, "Drako");
		//enter drako
		solo3.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		//error message about entering char
		solo3.sleep(3000);
		solo3.clearEditText(0);
		solo3.enterText(0, "");
		solo3.clickOnView(findViewById(tama.care.spel.R.id.rbDrako));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo3.sleep(3000);
		solo3.clearEditText(0);
		solo3.enterText(0, "Drako");
		solo3.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo3.waitForActivity("tama.care.spel.myGame", ACTIVITY_WAIT_MILLIS);
		// test case id: 4.0, 4.02, 4.03, 4.04, 4.05, 4.06, 4.07, 
		//5.00, 5.01, 5.02, 5.03, 5.04, 5.05, 5.06, 5.07, 5.09, 6.00,
		//6.01, 6.02, 6.03, 6.04, 7.00, 7.01, 7.03
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		//DENIED FEED
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		//38SEC
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		//DENIED PLAY ALSO UPDATE -1. 60SEC APRROX
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		//TEST SLEEPING
		solo3.sleep(30000);
		//30 SEC
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		//38 SEC APX
		//WAIT FOR HYGIENE BAR TO GO ZERO
		solo3.sleep(180000);
		//0 SEC
		//SEE STINKY CHARACTER
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		//RETURNS TO STINKY CHARACTER IF HY IS STILL 0
		//WAIT 1 min
		solo3.sleep(60000);
		//STILL AFTER UPDATE -1 HYGIENE BAR IS STILL 0 (CANT BE DECREASED BELOW 0)
		//HY BUTTON TEST, HY BAR will GO +1 (=1)
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		//HY = 10, CLEAN DENY
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(30000);
		//32 SEC APX
		//-1 AND HUNGRY BAR =0
		//EVEN WAIT FOR DEATH TIMER
		solo3.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		// reinit fluffy and test leaving
		solo3.clickOnView(findViewById(tama.care.spel.R.id.newgame1));
		solo3.waitForActivity("tama.care.spel.newGame", ACTIVITY_WAIT_MILLIS);
		solo3.sleep(2000);
		solo3.enterText(0, "Drako");
		solo3.clickOnView(findViewById(tama.care.spel.R.id.rbDrako));
		solo3.sleep(2000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo3.waitForActivity("tama.care.spel.myGame", ACTIVITY_WAIT_MILLIS);
		// test case id: 8.05, 7.02, 
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo3.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo3.sleep(10000);
		solo3.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		solo3.sleep(3000);
		solo3.clickOnView(findViewById(tama.care.spel.R.id.exit6));
	}

	/**
	 * Enhanced view finder. First tries to find it from Activity, then from all Views under ViewRoot.
	 */
	public View findViewById(int id) {
		View view = solo3.getView(id);
		if (view != null)
			return view;

		ArrayList<View> views = solo3.getViews();
		for (View v : views) {
			if (v.getId() == id) {
				return v;
			}
		}
		return null;
	}

}
