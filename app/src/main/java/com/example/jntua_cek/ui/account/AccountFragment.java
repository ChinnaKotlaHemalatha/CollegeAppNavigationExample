package com.example.jntua_cek.ui.account;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.jntua_cek.R;
import com.example.jntua_cek.ui.account.AccountViewModel;
import com.example.jntua_cek.ui.gallery.GalleryViewModel;

import static android.content.Context.MODE_MULTI_PROCESS;
import static android.content.Context.MODE_PRIVATE;
import static android.content.Intent.getIntent;

public class AccountFragment extends Fragment {

        private AccountViewModel accountViewModel;

        public View onCreateView(@NonNull LayoutInflater inflater,
                                 ViewGroup container, Bundle savedInstanceState) {
                accountViewModel =
                        ViewModelProviders.of(this).get(AccountViewModel.class);
                View root = inflater.inflate(R.layout.fragment_account, container, false);
                final TextView textView = root.findViewById(R.id.text_account);
                accountViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
                        @Override
                        public void onChanged(@Nullable String s) {
                                textView.setText(s);
                        }

                });
                return root;
        }

}
