package dev.libels.cells;

import androidx.appcompat.app.AppCompatActivity;

import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;

import android.content.Context;

import android.content.Intent;

import android.content.res.Resources;

import android.os.Bundle;

import android.view.View;
import android.widget.ImageView;

import android.widget.TextView;

import java.io.InputStream;

import java.util.List;

public class subcat extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_subcat);

		InputStream inputStream = getResources().openRawResource(R.raw.data);
		TSVFile tsvFile = new TSVFile(inputStream);
		final List<String[]> data = tsvFile.read();

		System.out.println(R.drawable.corona);

		int cat;
		if (savedInstanceState == null) {
			Bundle extras = getIntent().getExtras();
			if (extras == null) {
				cat = 0;
			} else {
				cat = extras.getInt("cat");
			}
		} else {
			if (savedInstanceState.getSerializable("cat") == null) {
				cat = 0;
			} else {
				cat = (int) savedInstanceState.getSerializable("cat");
			}
		}

		ImageView bg = findViewById(R.id.background);
		TextView dc = findViewById(R.id.articleDesc);

		if (cat == 0) {
			bg.setImageDrawable(getDrawable(R.drawable.virus));
			dc.setText("Virus adalah Suatu parasit berukuran mikroskopik yang menyerang sel organisme biologis.");
		} else if (cat == 1) {
			bg.setImageDrawable(getDrawable(R.drawable.bakteri));
			dc.setText("Bakteri adalah organisme yang tidak memiliki membran inti sel yang berukuran mikroskopik.");
		} else {
			bg.setImageDrawable(getDrawable(R.drawable.shield));
			dc.setText("Imun adalah sel yang banyak sistem biologisnya yang bertugas untuk melindungi tubuh manusia.");
		}

		ImageView pic1 = findViewById(R.id.contentPicture1);
		TextView txt1 = findViewById(R.id.contentSubject1);
		CardView con1 = findViewById(R.id.content1);

		ImageView pic2 = findViewById(R.id.contentPicture2);
		TextView txt2 = findViewById(R.id.contentSubject2);
		CardView con2 = findViewById(R.id.content2);

		ImageView pic3 = findViewById(R.id.contentPicture3);
		TextView txt3 = findViewById(R.id.contentSubject3);
		CardView con3 = findViewById(R.id.content3);

		ImageView pic4 = findViewById(R.id.contentPicture4);
		TextView txt4 = findViewById(R.id.contentSubject4);
		CardView con4 = findViewById(R.id.content4);

		ImageView pic5 = findViewById(R.id.contentPicture5);
		TextView txt5 = findViewById(R.id.contentSubject5);
		CardView con5 = findViewById(R.id.content5);

		ImageView pic6 = findViewById(R.id.contentPicture6);
		TextView txt6 = findViewById(R.id.contentSubject6);
		CardView con6 = findViewById(R.id.content6);

		for (int i=0; i < data.size(); i++) {
			if (Integer.parseInt(data.get(i)[1]) == cat) {

				txt1.setText(data.get(i)[0]);
				txt2.setText(data.get(i + 1)[0]);
				txt3.setText(data.get(i + 2)[0]);
				txt4.setText(data.get(i + 3)[0]);
				txt5.setText(data.get(i + 4)[0]);
				txt6.setText(data.get(i + 5)[0]);

				pic1.setImageDrawable(ContextCompat.getDrawable(this, Integer.parseInt(data.get(i)[2])));
				pic2.setImageDrawable(ContextCompat.getDrawable(this, Integer.parseInt(data.get(i + 1)[2])));
				pic3.setImageDrawable(ContextCompat.getDrawable(this, Integer.parseInt(data.get(i + 2)[2])));
				pic4.setImageDrawable(ContextCompat.getDrawable(this, Integer.parseInt(data.get(i + 3)[2])));
				pic5.setImageDrawable(ContextCompat.getDrawable(this, Integer.parseInt(data.get(i + 4)[2])));
				pic6.setImageDrawable(ContextCompat.getDrawable(this, Integer.parseInt(data.get(i + 5)[2])));

				final int finalI = i;
				con1.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent con1 = new Intent(subcat.this, Article.class);
						con1.putExtra("pic", Integer.parseInt(data.get(finalI)[2]));
						con1.putExtra("sub", data.get(finalI)[0]);
						con1.putExtra("dsc", data.get(finalI)[3]);
						startActivity(con1);
					}
				});

				final int finalI1 = i;
				con2.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent con2 = new Intent(subcat.this, Article.class);
						con2.putExtra("pic", Integer.parseInt(data.get(finalI1 + 1)[2]));
						con2.putExtra("sub", data.get(finalI1 + 1)[0]);
						con2.putExtra("dsc", data.get(finalI1 + 1)[3]);
						startActivity(con2);
					}
				});

				final int finalI2 = i;
				con3.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent con3 = new Intent(subcat.this, Article.class);
						con3.putExtra("pic", Integer.parseInt(data.get(finalI2 + 2)[2]));
						con3.putExtra("sub", data.get(finalI2 + 2)[0]);
						con3.putExtra("dsc", data.get(finalI2 + 2)[3]);
						startActivity(con3);
					}
				});

				final int finalI3 = i;
				con4.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent con4 = new Intent(subcat.this, Article.class);
						con4.putExtra("pic", Integer.parseInt(data.get(finalI3 + 3)[2]));
						con4.putExtra("sub", data.get(finalI3 + 3)[0]);
						con4.putExtra("dsc", data.get(finalI3 + 3)[3]);
						startActivity(con4);
					}
				});

				final int finalI4 = i;
				con5.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent con5 = new Intent(subcat.this, Article.class);
						con5.putExtra("pic", Integer.parseInt(data.get(finalI4 + 4)[2]));
						con5.putExtra("sub", data.get(finalI4 + 4)[0]);
						con5.putExtra("dsc", data.get(finalI4 + 4)[3]);
						startActivity(con5);
					}
				});

				final int finalI5 = i;
				con6.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						Intent con6 = new Intent(subcat.this, Article.class);
						con6.putExtra("pic", Integer.parseInt(data.get(finalI5 + 5)[2]));
						con6.putExtra("sub", data.get(finalI5 + 5)[0]);
						con6.putExtra("dsc", data.get(finalI5 + 5)[3]);
						startActivity(con6);
					}
				});

				break;
			}
		}
	}
}
