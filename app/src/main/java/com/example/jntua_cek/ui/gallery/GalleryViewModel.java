package com.example.jntua_cek.ui.gallery;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.jntua_cek.R;

public class GalleryViewModel extends ViewModel {

private MutableLiveData<String> mText;
        public GalleryViewModel() {
                mText = new MutableLiveData<>();
                mText.setValue("Principal: Prof. N. Visali");
        }

        public LiveData<String> getText() {
                return mText;
        }
     }