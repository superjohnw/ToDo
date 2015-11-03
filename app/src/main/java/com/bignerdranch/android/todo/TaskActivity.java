package com.bignerdranch.android.todo;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;

import java.util.UUID;

public class TaskActivity extends SingleFragmentActivity {

    private static final String EXTRA_TASK_ID=
            "com.bignerdranch.android.todo.task_id";

    public static Intent newIntent(Context packageContext, UUID taskId) {
        Intent intent = new Intent(packageContext, TaskActivity.class);
        intent.putExtra(EXTRA_TASK_ID, taskId);
        return intent;
    }


    @Override
    protected Fragment createFregment() {
        UUID taskId = (UUID) getIntent()
                .getSerializableExtra(EXTRA_TASK_ID);
        return TaskFragment.newInstance(taskId);
    }
}
