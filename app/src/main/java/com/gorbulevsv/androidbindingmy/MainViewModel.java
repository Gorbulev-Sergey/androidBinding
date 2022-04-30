package com.gorbulevsv.androidbindingmy;

import android.content.Context;
import android.view.View;
import android.widget.Button;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public MutableLiveData<String> title = new MutableLiveData<>("Привет");

    public void buttonOnClick(View view) {
        title.setValue(title.getValue() + " 10");
    }
}
