package tama.care.spel.test;

import android.test.ActivityInstrumentationTestCase2;
import tama.care.spel.myMain;
import java.util.ArrayList;
import com.jayway.android.robotium.solo.Solo;
import android.view.View;

public class mySpikyTest extends ActivityInstrumentationTestCase2<myMain> {

	private static final int ACTIVITY_WAIT_MILLIS = 500;
	private Solo solo2;

	public mySpikyTest() {
		super("tama.care.spel", myMain.class);
	}

	@Override
	public void setUp() throws Exception {
		solo2 = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		try {
			solo2.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		getActivity().finish();
		super.tearDown();
	}

	public void testRecorded() throws Exception {
		//test case id: 1.01, 1.02, 1.03, 1.04, 2.01
		solo2.waitForActivity("tama.care.spel.myMain", ACTIVITY_WAIT_MILLIS);
		solo2.sleep(5000);
		solo2.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		solo2.sleep(3000);
		// test case id: 3.01, 
		solo2.clickOnView(findViewById(tama.care.spel.R.id.newgame1));
		solo2.waitForActivity("tama.care.spel.newGame", ACTIVITY_WAIT_MILLIS);
		solo2.sleep(2000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo2.clearEditText(0);
		solo2.enterText(0, "Spiky");
		solo2.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo2.sleep(3000);
		solo2.clearEditText(0);
		solo2.enterText(0, "");
		solo2.clickOnView(findViewById(tama.care.spel.R.id.rbSpiky));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo2.sleep(3000);
		solo2.clearEditText(0);
		solo2.enterText(0, "Spiky");
		solo2.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo2.waitForActivity("tama.care.spel.myGame", ACTIVITY_WAIT_MILLIS);
		// test case id: 4.0, 4.02, 4.03, 4.04, 4.05, 4.06, 4.07, 
		//5.00, 5.01, 5.02, 5.03, 5.04, 5.05, 5.06, 5.07, 5.09, 6.00,
		//6.01, 6.02, 6.03, 6.04, 7.00, 7.01, 7.03
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		//DENIED FEED
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		//38SEC
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		//DENIED PLAY ALSO UPDATE -1. 60SEC APRROX
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		//TEST SLEEPING
		solo2.sleep(30000);
		//30 SEC
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibfeed));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		//38 SEC APX
		//W( FOR HYGIENE BAR TO GO ZERO
		solo2.sleep(180000);
		//0 SEC
		//SEE STINKY CHARACTER
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibplay));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		//RETURNS TO STINKY CHARACTER IF HY IS STILL 0
		//WAIT 1 min
		solo2.sleep(60000);
		//STILL AFTER UPDATE -1 HYGIENE BAR IS STILL 0 (CANT BE DECREASED BELOW 0)
		//HY BUTTON TEST, HY BAR will GO +1 (=1)
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		//HY = 10, CLEAN DENY
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibclean));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(30000);
		//-1 AND HUNGRY BAR =0
		//EVEN WAIT FOR DEATH TIMER
		solo2.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		// reinit spiky and test leaving
		solo2.clickOnView(findViewById(tama.care.spel.R.id.newgame1));
		solo2.waitForActivity("tama.care.spel.newGame", ACTIVITY_WAIT_MILLIS);
		solo2.sleep(2000);
		solo2.enterText(0, "Spiky");
		solo2.clickOnView(findViewById(tama.care.spel.R.id.rbSpiky));
		solo2.sleep(2000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.bCreate));
		solo2.waitForActivity("tama.care.spel.myGame", ACTIVITY_WAIT_MILLIS);
		// test case id: 8.05, 7.02, 
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ibslap));
		solo2.clickOnView(findViewById(tama.care.spel.R.id.ivmyChar));
		solo2.sleep(10000);
		solo2.waitForActivity("tama.care.spel.myMenu", ACTIVITY_WAIT_MILLIS);
		solo2.sleep(3000);
		solo2.clickOnView(findViewById(tama.care.spel.R.id.exit6));
	}

	/**
	 * Enhanced view finder. First tries to find it from Activity, then from all Views under ViewRoot.
	 */
	public View findViewById(int id) {
		View view = solo2.getView(id);
		if (view != null)
			return view;

		ArrayList<View> views = solo2.getViews();
		for (View v : views) {
			if (v.getId() == id) {
				return v;
			}
		}
		return null;
	}

}
