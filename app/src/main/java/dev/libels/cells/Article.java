package dev.libels.cells;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Article extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_article);

		String sub;
		int pic;
		String dsc;
		if (savedInstanceState == null) {
			Bundle extras = getIntent().getExtras();
			if (extras == null) {
				sub = null;
				pic = 0;
				dsc = null;
			} else {
				sub = extras.getString("sub");
				pic = extras.getInt("pic");
				dsc = extras.getString("dsc");
			}
		} else {
			if (savedInstanceState.getSerializable("sub") == null) {
				sub = null;
			} else {
				sub = (String) savedInstanceState.getSerializable("sub");
			}

			if (savedInstanceState.getSerializable("pic") == null) {
				pic = 0;
			} else {
				pic = (int) savedInstanceState.getSerializable("pic");
			}

			if (savedInstanceState.getSerializable("dsc") == null) {
				dsc = null;
			} else {
				dsc = (String) savedInstanceState.getSerializable("dsc");
			}
		}

		TextView subject = findViewById((R.id.articleSubject));
		ImageView picture = findViewById(R.id.articlePicture);
		TextView desc = findViewById(R.id.articleDesc);

		subject.setText(sub);
		picture.setImageDrawable(ContextCompat.getDrawable(this, pic));
		desc.setText(dsc);
	}
}
