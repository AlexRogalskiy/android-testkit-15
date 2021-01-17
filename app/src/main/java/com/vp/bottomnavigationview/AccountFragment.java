package com.vp.bottomnavigationview;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vishal Patolia on 18-Feb-18.
 */

public class AccountFragment extends Fragment {

    @BindView(R.id.home_txtTitle)
    TextView mHomeTxtTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, rootView);
        mHomeTxtTitle.setText(getString(R.string.menu_account));
        return rootView;
    }
}
