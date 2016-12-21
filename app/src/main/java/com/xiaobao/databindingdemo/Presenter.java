package com.xiaobao.databindingdemo;

import android.util.Log;
import android.view.View;

/**
 * Created by maxiaobao on 2016/12/21.
 */

public class Presenter {

    public void saveSth(View view,String title){

        StringBuilder sb = new StringBuilder("the view id is:")
                .append(view.getTag())
                .append(", the title:")
                .append(title);


        Log.d("AAA",sb.toString());
    }

    public void getEventDesc(EventHandler eventHandler) {
        Log.d("AAA",eventHandler.desc);
    }
}
