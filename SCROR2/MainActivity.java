package com.ashakanoj.program2;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
 Button button1; 
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 button1 = (Button) findViewById(R.id.button1);
 }
 public void onClick(View v) {
 Intent intent = new Intent(MainActivity.this, SecondActivity.class);
 startActivity(intent);
 }
}
