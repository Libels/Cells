package dev.libels.cells;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		LinearLayout virus = findViewById(R.id.virus);
		LinearLayout bacteria = findViewById(R.id.bacteria);
		LinearLayout immune = findViewById(R.id.immune);

		virus.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent virus = new Intent(MainActivity.this, subcat.class);
				virus.putExtra("cat", 0);
				startActivity(virus);
			}
		});

		bacteria.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent bacteria = new Intent(MainActivity.this, subcat.class);
				bacteria.putExtra("cat", 1);
				startActivity(bacteria);
			}
		});

		immune.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent immune = new Intent(MainActivity.this, subcat.class);
				immune.putExtra("cat", 2);
				startActivity(immune);
			}
		});
	}
}
