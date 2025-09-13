package com.example.smartyatra;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {

    private EditText etName, etAge, etGender, etBloodType, etEmail, etPhone,
            etPrefLanguage, etEmergencyContact, etEmergencyContactRelation,
            etCurrentLocation, etNationality;
    private Button btnRegisterConfirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        etName = findViewById(R.id.etRegName);
        etAge = findViewById(R.id.etRegAge);
        etGender = findViewById(R.id.etRegGender);
        etBloodType = findViewById(R.id.etRegBloodType);
        etEmail = findViewById(R.id.etRegEmail);
        etPhone = findViewById(R.id.etRegPhone);
        etPrefLanguage = findViewById(R.id.etRegPrefLanguage);
        etEmergencyContact = findViewById(R.id.etRegEmergencyContact);
        etEmergencyContactRelation = findViewById(R.id.etRegEmergencyContactRelation);
        etCurrentLocation = findViewById(R.id.etRegCurrentLocation);
        etNationality = findViewById(R.id.etRegNationality);

        btnRegisterConfirm = findViewById(R.id.btnRegisterConfirm);

        btnRegisterConfirm.setOnClickListener(v -> {
            if (checkInputs()) {
                Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(RegistrationActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(intent);
                finish();
            }
        });
    }

    private boolean checkInputs() {
        if (TextUtils.isEmpty(etName.getText().toString().trim())) {
            etName.setError("Enter Name");
            return false;
        }
        if (TextUtils.isEmpty(etAge.getText().toString().trim())) {
            etAge.setError("Enter Age");
            return false;
        }
        if (TextUtils.isEmpty(etGender.getText().toString().trim())) {
            etGender.setError("Enter Gender");
            return false;
        }
        if (TextUtils.isEmpty(etBloodType.getText().toString().trim())) {
            etBloodType.setError("Enter Blood Type");
            return false;
        }
        if (TextUtils.isEmpty(etEmail.getText().toString().trim())) {
            etEmail.setError("Enter Email");
            return false;
        }
        if (TextUtils.isEmpty(etPhone.getText().toString().trim())) {
            etPhone.setError("Enter Phone");
            return false;
        }
        if (TextUtils.isEmpty(etPrefLanguage.getText().toString().trim())) {
            etPrefLanguage.setError("Enter Preferred Language");
            return false;
        }
        if (TextUtils.isEmpty(etEmergencyContact.getText().toString().trim())) {
            etEmergencyContact.setError("Enter Emergency Contact");
            return false;
        }
        if (TextUtils.isEmpty(etEmergencyContactRelation.getText().toString().trim())) {
            etEmergencyContactRelation.setError("Enter Emergency Contact Relation");
            return false;
        }
        if (TextUtils.isEmpty(etCurrentLocation.getText().toString().trim())) {
            etCurrentLocation.setError("Enter Current Location");
            return false;
        }
        if (TextUtils.isEmpty(etNationality.getText().toString().trim())) {
            etNationality.setError("Enter Nationality");
            return false;
        }
        return true;
    }
}
