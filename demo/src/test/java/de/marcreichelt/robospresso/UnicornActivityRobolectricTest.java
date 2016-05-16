package de.marcreichelt.robospresso;

import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 22)
public class UnicornActivityRobolectricTest {

    @Test
    public void doWeLoveUnicorns() throws Exception {
        UnicornActivity activity = Robolectric.setupActivity(UnicornActivity.class);
        TextView unicorns = (TextView) activity.findViewById(R.id.unicorns);

        assertNotNull(unicorns);
        assertEquals(activity.getString(R.string.unicorns), unicorns.getText().toString());
    }

}
