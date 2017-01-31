package com.example.android.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by shankha on 1/31/17.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}