
package com.example.menusinandroid;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    int day,month,year,min,hours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu) {

        getMenuInflater().inflate(R.menu.option, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.ad:
                showAlert();
                break;
            case R.id.dp:
                tp();
                break;
            case R.id.tp:
                dp();
                break;
            case R.id.search:
                search();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showAlert() {
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
                builder.setTitle("Alert..");
                builder.setMessage("Do you want to close the app?");
                builder.setCancelable(false);
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });
        builder.show();


    }

    private void tp() {
        Calendar c=Calendar.getInstance();
        min=c.get(Calendar.MINUTE);
        hours=c.get(Calendar.HOUR_OF_DAY);
        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int i, int i1) {
                String time=i+"-"+i1;
                Toast.makeText(MainActivity.this, "now time is "+time, Toast.LENGTH_SHORT).show();
            }
        },hours,min,false);
        dialog.show();


    }


    private void dp() {
        Calendar c=Calendar.getInstance();
        day=c.get(Calendar.DAY_OF_MONTH);
        month=c.get(Calendar.MONTH);
        year=c.get(Calendar.YEAR);
        DatePickerDialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                /*month name come under the srting array-->start index vallue is 0->
                 * Jan -0
                 * feb -1
                 * jun -5*/
                String date=i+"-"+(i1+1)+"-"+i2;
                Toast.makeText(MainActivity.this, ""+date, Toast.LENGTH_SHORT).show();
            }
        },year,month,day);
        dialog.show();


    }

    private void search() {

    }
}