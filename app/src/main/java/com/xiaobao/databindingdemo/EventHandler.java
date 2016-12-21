package com.xiaobao.databindingdemo;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

/**
 * Created by maxiaobao on 2016/12/21.
 */

public class EventHandler {

    public String desc;

    public void onClickAt(View v) {
        Log.d("AAA","=============AAA===============");
       Toast.makeText(v.getContext().getApplicationContext(),"at clicked...",Toast.LENGTH_LONG).show();
    }
}
