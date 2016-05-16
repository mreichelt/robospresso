package de.marcreichelt.robospresso;

import android.support.test.rule.ActivityTestRule;
import android.test.suitebuilder.annotation.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(JUnit4.class)
@LargeTest
public class UnicornActivityEspressoTest {

    @SuppressWarnings("unchecked")
    @Rule
    public ActivityTestRule<UnicornActivity> activityRule = new ActivityTestRule(UnicornActivity.class);

    @Test
    public void weLoveUnicorns() throws Exception {
        onView(withId(R.id.unicorns)).check(matches(withText(R.string.unicorns)));
    }

}
