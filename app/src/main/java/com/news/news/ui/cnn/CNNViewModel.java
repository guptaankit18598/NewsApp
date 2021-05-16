package com.news.news.ui.cnn;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CNNViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CNNViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is CNN fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}