package si.kavica.fragments.intro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import si.kavica.R;

/**
 * Created by Gregor on 21. 11. 2016.
 */

public class MainIntroFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    private void publishFragment(AIntroFragment introFragment, boolean addToBackStack) {
        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.replace(R.id.child_intro_fragment, introFragment);
        if (addToBackStack) {
            transaction.addToBackStack(introFragment.getClass().getName());
        }
        transaction.commit();
    }
}
