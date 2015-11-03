package com.bignerdranch.android.todo;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by Super on 11/2/2015.
 */
public class TaskLab {
    private static TaskLab sTaskLab;

    private List<Task> mTasks;
        public static TaskLab get(Context context){
            if (sTaskLab == null) {
                sTaskLab = new TaskLab(context);
            }
            return sTaskLab;
        }
    private TaskLab(Context context) {
        mTasks = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Task task = new Task();
            task.setTitle("Task #" + i);
            task.setDone(i % 2 == 0); //Every other one
            mTasks.add(task);
        }
    }

    public List<Task> getTasks(){
        return mTasks;
    }
    public Task getTask(UUID id) {
        for (Task task : mTasks) {
            if (task.getId().equals(id)){
                return task;
            }
        }
        return null;
    }
}
