package com.example.imitative_music;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DrawMenuFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.drawmenufragment, container, false);
    }

    @Override
    public void onClick(View v) {
//        switch(v.getId()){
//            case R.id.drawer_third_1:
//            case R.id.drawer_third_2:
//        }
        Toast.makeText(getContext(), "点击了", Toast.LENGTH_SHORT).show();
    }
}
