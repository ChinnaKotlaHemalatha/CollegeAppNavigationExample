package com.example.jntua_cek.ui.account;

        import android.content.SharedPreferences;

        import androidx.lifecycle.LiveData;
        import androidx.lifecycle.MutableLiveData;
        import androidx.lifecycle.ViewModel;


public class AccountViewModel extends ViewModel {
        private MutableLiveData<String> mText;

        public AccountViewModel() {
                mText = new MutableLiveData<>();
                mText.setValue("      Welcome this is your Account\n"+"  Fill the details that you want to store and use when we want to use.");
        }

        public LiveData<String> getText() {
                return mText;
        }

}



