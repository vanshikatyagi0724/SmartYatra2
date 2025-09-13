package com.example.smartyatra;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class SecurityFragment extends Fragment {

    private EditText nameEditText;
    private Button startButton, stopButton;
    private Button womenHelplineBtn, sosBtn, helpdeskBtn;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_security, container, false);

        // Initialize views
        nameEditText = root.findViewById(R.id.security_name_edit);
        startButton = root.findViewById(R.id.security_start_btn);
        stopButton = root.findViewById(R.id.security_stop_btn);
        womenHelplineBtn = root.findViewById(R.id.security_women_helpline_btn);
        sosBtn = root.findViewById(R.id.security_sos_btn);
        helpdeskBtn = root.findViewById(R.id.security_helpdesk_btn);

        // Disable all caps to match UI design
        startButton.setAllCaps(false);
        stopButton.setAllCaps(false);
        womenHelplineBtn.setAllCaps(false);
        sosBtn.setAllCaps(false);
        helpdeskBtn.setAllCaps(false);

        // Set button click listeners
        startButton.setOnClickListener(v -> {
            // TODO: Start tracking or related action
        });

        stopButton.setOnClickListener(v -> {
            // TODO: Stop tracking or related action
        });

        womenHelplineBtn.setOnClickListener(v -> {
            // TODO: Launch women helpline call or details
        });

        sosBtn.setOnClickListener(v -> {
            // TODO: Trigger SOS alert or message
        });

        helpdeskBtn.setOnClickListener(v -> {
            // TODO: Open helpdesk activity or contact
        });

        return root;
    }
}
