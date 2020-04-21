package com.rk.ad;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onBackPressed() {
        tampilkanAlertDialog();
    }

    private void tampilkanAlertDialog(){
        final AlertDialog.Builder PembentukAlertDialog = new AlertDialog.Builder(this);
        PembentukAlertDialog.setCancelable(false);
        PembentukAlertDialog.setTitle("Kembali");
        PembentukAlertDialog.setMessage("Apakah Kamu Yakin Ingin Kembali?");
        PembentukAlertDialog.setPositiveButton("YA", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        PembentukAlertDialog.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        PembentukAlertDialog.create().show();
    }
}
