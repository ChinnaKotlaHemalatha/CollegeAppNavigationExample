package com.example.jntua_cek.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.jntua_cek.R;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_gallery, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        final ImageView image=root.findViewById(R.id.img);
        final ImageView image1=root.findViewById(R.id.img1);
        final ImageView image2=root.findViewById(R.id.img2);
        final ImageView image3=root.findViewById(R.id.img3);
        final ImageView image4=root.findViewById(R.id.img4);
        final ImageView image5=root.findViewById(R.id.img5);
        final ImageView image6=root.findViewById(R.id.img6);
        final ImageView image7=root.findViewById(R.id.img7);
        final ImageView image8=root.findViewById(R.id.img8);
        final ImageView image9=root.findViewById(R.id.img9);
        final ImageView image10=root.findViewById(R.id.img10);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}