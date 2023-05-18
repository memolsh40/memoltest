package com.memol.mvvm.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.memol.mvvm.R;
import com.memol.mvvm.viewmodel.UserViewModel;
import com.memol.mvvm.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding= DataBindingUtil
                .setContentView(this,R.layout.activity_main);

        UserViewModel userViewModel=new UserViewModel();
        activityMainBinding.setMyTest(userViewModel);
    }
}