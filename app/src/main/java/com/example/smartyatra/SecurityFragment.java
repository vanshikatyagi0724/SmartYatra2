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

        // Initialize views using correct IDs from fragment_security.xml
        nameEditText = root.findViewById(R.id.security_name_edit);
        startButton = root.findViewById(R.id.security_start_btn);
        stopButton = root.findViewById(R.id.security_stop_btn);
        womenHelplineBtn = root.findViewById(R.id.security_women_helpline_btn);
        sosBtn = root.findViewById(R.id.security_sos_btn);
        helpdeskBtn = root.findViewById(R.id.security_helpdesk_btn);

        // TODO: Implement actual functionality for buttons, for now sample listeners
        startButton.setOnClickListener(v -> {
            // Start action logic here
        });

        stopButton.setOnClickListener(v -> {
            // Stop action logic here
        });

        womenHelplineBtn.setOnClickListener(v -> {
            // Women helpline logic here
        });

        sosBtn.setOnClickListener(v -> {
            // SOS logic here
        });

        helpdeskBtn.setOnClickListener(v -> {
            // Helpdesk logic here
        });

        return root;
    }
}
