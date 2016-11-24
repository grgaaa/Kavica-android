package si.kavica.fragments.intro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by Gregor on 21. 11. 2016.
 */

public abstract class AIntroFragment extends Fragment {
    private final String TAG = getClass().getName();

    private MainIntroFragment mainIntroFragment;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            mainIntroFragment = (MainIntroFragment)getParentFragment();
        } catch (ClassCastException e) {
            Log.e(TAG, "MainIntroFragment should be my parent");
            throw new IllegalArgumentException(e);
        }
    }
}
