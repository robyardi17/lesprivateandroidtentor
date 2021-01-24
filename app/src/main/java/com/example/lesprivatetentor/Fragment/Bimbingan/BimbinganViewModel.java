package com.example.lesprivatetentor.Fragment.Bimbingan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class BimbinganViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public BimbinganViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Bimbingann fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}