package com.example.smartyatra;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        TextView nameView = root.findViewById(R.id.profile_name);
        TextView emailView = root.findViewById(R.id.profile_email);
        ImageView avatarView = root.findViewById(R.id.profile_image);

        nameView.setText("John Doe");
        emailView.setText("johndoe@example.com");
        avatarView.setImageResource(R.drawable.ic_profile_avatar);

        // Option Views
        View optionTrips = root.findViewById(R.id.option_trips);
        View optionLanguage = root.findViewById(R.id.option_language);
        View optionEditProfile = root.findViewById(R.id.option_editprofile);
        View optionNotifications = root.findViewById(R.id.option_notifications);
        View optionFeedback = root.findViewById(R.id.option_feedback);
        View optionLogout = root.findViewById(R.id.option_logout);

        optionTrips.setOnClickListener(v -> {
            // TODO: Implement See Trips Done action
        });

        optionLanguage.setOnClickListener(v -> {
            // TODO: Implement Change Language action
        });

        optionEditProfile.setOnClickListener(v -> {
            // TODO: Implement Edit Profile action
        });

        optionNotifications.setOnClickListener(v -> {
            // TODO: Implement Notification Settings action
        });

        optionFeedback.setOnClickListener(v -> {
            // TODO: Implement Rating and Feedback action
        });

        optionLogout.setOnClickListener(v -> {
            // TODO: Implement Logout action
        });

        return root;
    }
}
