package lab03.eim.systems.cs.pub.ro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.SyncStateContract;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class PhoneDialerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dialer);

        TextView phoneNumber = findViewById(R.id.phoneNumber);
        phoneNumber.setText("");

        final Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "1";
                phoneNumber.setText(text);
            }
        });

        final Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "2";
                phoneNumber.setText(text);
            }
        });

        final Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "3";
                phoneNumber.setText(text);
            }
        });

        final Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "4";
                phoneNumber.setText(text);
            }
        });

        final Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "5";
                phoneNumber.setText(text);
            }
        });

        final Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "6";
                phoneNumber.setText(text);
            }
        });

        final Button button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "7";
                phoneNumber.setText(text);
            }
        });

        final Button button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "8";
                phoneNumber.setText(text);
            }
        });

        final Button button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "9";
                phoneNumber.setText(text);
            }
        });

        final Button buttonStar = findViewById(R.id.buttonStar);
        buttonStar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "*";
                phoneNumber.setText(text);
            }
        });

        final Button button0 = findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "0";
                phoneNumber.setText(text);
            }
        });

        final Button buttonHashtag = findViewById(R.id.buttonHashtag);
        buttonHashtag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                String text = phoneNumber.getText() + "#";
                phoneNumber.setText(text);
            }
        });

        final ImageButton buttonCall = findViewById(R.id.buttonCall);
        buttonCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        final ImageButton buttonDeny = findViewById(R.id.buttonDeny);
        buttonDeny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        final ImageButton buttonBackspace = findViewById(R.id.buttonBackspace);
        buttonBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView phoneNumber = findViewById(R.id.phoneNumber);
                if (!phoneNumber.getText().equals("")) {
                    String text = phoneNumber.getText().subSequence(0, phoneNumber.getText().length() - 1) + "";
                    phoneNumber.setText(text);
                }
            }
        });
    }
}