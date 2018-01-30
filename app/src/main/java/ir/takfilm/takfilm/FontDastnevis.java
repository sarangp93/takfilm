package ir.takfilm.takfilm;
/**
 * Created by developer1 on 1/29/2018.
 */
import android.app.Application;

import ir.takfilm.takfilm.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;


public class FontDastnevis extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iransansmobile.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}