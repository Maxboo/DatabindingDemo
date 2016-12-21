package com.xiaobao.databindingdemo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import com.xiaobao.databindingdemo.databinding.ActivityMainBinding;
import com.xiaobao.databindingdemo.model.User;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        User u = new User("xiaobao");
        binding.setUser(u);

        EventHandler eventHandler = new EventHandler();
        eventHandler.desc="the event handler has show desc";
        binding.setEh(eventHandler);
        binding.setPresenter(new Presenter());
        binding.setPtitle("hello,i am title");


    }



}
