package com.pouyablack.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void info_Btn(View view) {
        // TODO: Making Alert
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        // @Mkh_Pouya (https://t.me/Mkh_Pouya)
        alert.setMessage("برنامه‌نویسی و طراحی: پویا محمدخانی\n دانشجوی مهندسی کامپیوتر - دانشگاه شهید بهشتی\n\nخوش‌حال میشم نظرتون رو بدونم!")
                .setTitle("درباره");
//                .setPositiveButton(
//                        "خب",
//                        new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//                        // after pressing the خب button!
//                        // Toast.makeText(getApplicationContext(), "خب کلیک شدش! نترس ازش!!", Toast.LENGTH_SHORT).show();
//                    }
//                }).show();
                alert.setPositiveButton(
                        "تلگرام من",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
//                        // TODO: sendign via telegram
//                        Intent telegram_intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/Mkh_Pouya"));
//                        startActivity(telegram_intent);
                        Intent i = new
                                Intent(android.content.Intent.ACTION_PICK);
                        i.setType(ContactsContract.Contacts.CONTENT_TYPE);
                        startActivityForResult(i,1);
                    }
                })
                .setNegativeButton(
                        "ایمیل من",
                        new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        // TODO: sending via mail
                        Intent email_intent = new Intent(Intent.ACTION_SENDTO);
                        email_intent.setData(Uri.parse("mailto:p.mohammadkhani95@gmail.com"));
                        startActivity(email_intent);
                    }
                })
                .show();
    }

    public void start_btn(View view) {
        // TODO: Start "StartPage" !
        Intent i = new Intent(getApplicationContext(), StartPage.class);
        startActivity(i);
        // Toast.makeText(getApplicationContext(),"صفحه شروع بسته شد! و دیگه برنمیگرده میره از اول کار شروع میکنه.",Toast.LENGTH_SHORT).show();
        // finish();
    }

//    public void coding_Btn(View view) {
//        // TODO: Start "CondingPage" !
//        Intent i = new Intent(getApplicationContext(), CodingPage.class);
//        startActivity(i);
//    }
}

