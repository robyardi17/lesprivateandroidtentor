package com.example.lesprivatetentor.Fragment.Pertemuan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PertemuanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PertemuanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Pertemuan fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}