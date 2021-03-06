package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;

import com.robotium.solo.Solo;

import junit.framework.TestCase;

public class LonelyTwitterActivityTest extends ActivityInstrumentationTestCase2<LonelyTwitterActivity> {

    private Solo solo;

    public LonelyTwitterActivityTest() {
        super(ca.ualberta.cs.lonelytwitter.LonelyTwitterActivity.class);
    }

    /**
     * Runs at the beginning of the tests
     * @throws Exception
     */
    public void setUp() throws Exception{
        solo = new Solo(getInstrumentation(),getActivity());

    }

    public void testStart() throws Exception {
        Activity activity = getActivity();

    }

    public void testTweet(){
        solo.assertCurrentActivity("Wrong Activity",LonelyTwitterActivity.class);
        solo.enterText((EditText) solo.getView(R.id.body),"Test Tweet!");
        solo.clickOnButton("Save");
        assertTrue(solo.waitForText("Test Tweet!"));

    }

    /**
     * Runs at the end of the tests
     * @throws Exception
     */
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
    }

}