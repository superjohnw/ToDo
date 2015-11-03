package com.bignerdranch.android.todo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by Super on 11/3/2015.
 */
public class TaskListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFregment() {
        return new TaskListFragment();
    }
}
