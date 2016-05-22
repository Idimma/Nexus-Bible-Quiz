package nexus.fire.biblequiz;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Biblequiz extends Activity {
	MediaPlayer music1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.startingpoint);
		music1 = MediaPlayer.create(Biblequiz.this, R.raw.symmetriesshort);
		music1.start();
		Thread lunchtime = new Thread() {
			@Override
			public void run() {
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					Intent page1 = new Intent("nexus.fire.biblequiz.page0");
					startActivity(page1);

				}

			}
		};
		lunchtime.start();

	}

	@Override
	protected void onPause() {
		super.onPause();
		music1.release();
		finish();
	}
}
