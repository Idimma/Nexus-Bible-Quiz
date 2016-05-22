package nexus.fire.biblequiz;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class page0 extends Activity implements OnCheckedChangeListener {
	static ArrayList<Integer> s;
	int[] zea_mays;
	static Random now = new Random();
	page0 me;
	long timeleft;
	String[] ques, opt1, opt2, opt3, opt4, Cans, Bref;
	String a, b, c, d, e, f;
	Button btn5, tm1, tm2, tm3, pause, exit;
	RadioButton chk1, chk2, chk3, chk4;
	RadioGroup select;
	TextView tv1, tv2, tv3;
	int Totalscore, high = -1, counter, start = 20000, stop = 1000, i,
			_question, low, rus, m, n, o, p, succ;
	boolean just = true;
	CountDownTimer tyme, climate;
	View bql;
	Toast ding, pop;

	@Override
	public void onCreate(Bundle serve) {
		super.onCreate(serve);
		requestWindowFeature(Window.FEATURE_OPTIONS_PANEL);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		setContentView(R.layout.bq);
		activity();

	}

	private void activity() {
		Emma();
		initializingQ();
		number_generator();
		queTime();
	}

	private void Emma() {
		ques = new String[] { getString(R.string.que1),
				getString(R.string.que2), getString(R.string.que3),
				getString(R.string.que4), getString(R.string.que5),
				getString(R.string.que6), getString(R.string.que7),
				getString(R.string.que8), getString(R.string.que9),
				getString(R.string.que10), getString(R.string.que11),
				getString(R.string.que12), getString(R.string.que13),
				getString(R.string.que14), getString(R.string.que15),
				getString(R.string.que16), getString(R.string.que17),
				getString(R.string.que18), getString(R.string.que19),
				getString(R.string.que20), getString(R.string.que21),
				getString(R.string.que22), getString(R.string.que23),
				getString(R.string.que24), getString(R.string.que25),
				getString(R.string.que26), getString(R.string.que27),
				getString(R.string.que28), getString(R.string.que29),
				getString(R.string.que30), getString(R.string.que31),
				getString(R.string.que32), getString(R.string.que33),
				getString(R.string.que34), getString(R.string.que35), };
		opt1 = new String[] { getString(R.string.opt1_q1),
				getString(R.string.opt1_q2), getString(R.string.opt1_q3),
				getString(R.string.opt1_q4), getString(R.string.opt1_q5),
				getString(R.string.opt1_q6), getString(R.string.opt1_q7),
				getString(R.string.opt1_q8), getString(R.string.opt1_q9),
				getString(R.string.opt1_q10), getString(R.string.opt1_q11),
				getString(R.string.opt1_q12), getString(R.string.opt1_q13),
				getString(R.string.opt1_q14), getString(R.string.opt1_q15),
				getString(R.string.opt1_q16), getString(R.string.opt1_q17),
				getString(R.string.opt1_q18), getString(R.string.opt1_q19),
				getString(R.string.opt1_q20), getString(R.string.opt1_q21),
				getString(R.string.opt1_q22), getString(R.string.opt1_q23),
				getString(R.string.opt1_q24), getString(R.string.opt1_q25),
				getString(R.string.opt1_q26), getString(R.string.opt1_q27),
				getString(R.string.opt1_q28), getString(R.string.opt1_q29),
				getString(R.string.opt1_q30), getString(R.string.opt1_q31),
				getString(R.string.opt1_q32), getString(R.string.opt1_q33),
				getString(R.string.opt1_q34), getString(R.string.opt1_q35), };
		opt2 = new String[] { getString(R.string.opt2_q1),
				getString(R.string.opt2_q2), getString(R.string.opt2_q3),
				getString(R.string.opt2_q4), getString(R.string.opt2_q5),
				getString(R.string.opt2_q6), getString(R.string.opt2_q7),
				getString(R.string.opt2_q8), getString(R.string.opt2_q9),
				getString(R.string.opt2_q10), getString(R.string.opt2_q11),
				getString(R.string.opt2_q12), getString(R.string.opt2_q13),
				getString(R.string.opt2_q14), getString(R.string.opt2_q15),
				getString(R.string.opt2_q16), getString(R.string.opt2_q17),
				getString(R.string.opt2_q18), getString(R.string.opt2_q19),
				getString(R.string.opt2_q20), getString(R.string.opt2_q21),
				getString(R.string.opt2_q22), getString(R.string.opt2_q23),
				getString(R.string.opt2_q24), getString(R.string.opt2_q25),
				getString(R.string.opt2_q26), getString(R.string.opt2_q27),
				getString(R.string.opt2_q28), getString(R.string.opt2_q29),
				getString(R.string.opt2_q30), getString(R.string.opt2_q31),
				getString(R.string.opt2_q32), getString(R.string.opt2_q33),
				getString(R.string.opt2_q34), getString(R.string.opt2_q35), };
		opt3 = new String[] { getString(R.string.opt3_q1),
				getString(R.string.opt3_q2), getString(R.string.opt3_q3),
				getString(R.string.opt3_q4), getString(R.string.opt3_q5),
				getString(R.string.opt3_q6), getString(R.string.opt3_q7),
				getString(R.string.opt3_q8), getString(R.string.opt3_q9),
				getString(R.string.opt3_q10), getString(R.string.opt3_q11),
				getString(R.string.opt3_q12), getString(R.string.opt3_q13),
				getString(R.string.opt3_q14), getString(R.string.opt3_q15),
				getString(R.string.opt3_q16), getString(R.string.opt3_q17),
				getString(R.string.opt3_q18), getString(R.string.opt3_q19),
				getString(R.string.opt3_q20), getString(R.string.opt3_q21),
				getString(R.string.opt3_q22), getString(R.string.opt3_q23),
				getString(R.string.opt3_q24), getString(R.string.opt3_q25),
				getString(R.string.opt3_q26), getString(R.string.opt3_q27),
				getString(R.string.opt3_q28), getString(R.string.opt3_q29),
				getString(R.string.opt3_q30), getString(R.string.opt3_q31),
				getString(R.string.opt3_q32), getString(R.string.opt3_q33),
				getString(R.string.opt3_q34), getString(R.string.opt3_q35), };
		opt4 = new String[] { getString(R.string.opt4_q1),
				getString(R.string.opt4_q2), getString(R.string.opt4_q3),
				getString(R.string.opt4_q4), getString(R.string.opt4_q5),
				getString(R.string.opt4_q6), getString(R.string.opt4_q7),
				getString(R.string.opt4_q8), getString(R.string.opt4_q9),
				getString(R.string.opt4_q10), getString(R.string.opt4_q11),
				getString(R.string.opt4_q12), getString(R.string.opt4_q13),
				getString(R.string.opt4_q14), getString(R.string.opt4_q15),
				getString(R.string.opt4_q16), getString(R.string.opt4_q17),
				getString(R.string.opt4_q18), getString(R.string.opt4_q19),
				getString(R.string.opt4_q20), getString(R.string.opt4_q21),
				getString(R.string.opt4_q22), getString(R.string.opt4_q23),
				getString(R.string.opt4_q24), getString(R.string.opt4_q25),
				getString(R.string.opt4_q26), getString(R.string.opt4_q27),
				getString(R.string.opt4_q28), getString(R.string.opt4_q29),
				getString(R.string.opt4_q30), getString(R.string.opt4_q31),
				getString(R.string.opt4_q32), getString(R.string.opt4_q33),
				getString(R.string.opt4_q34), getString(R.string.opt4_q35), };
		Cans = new String[] { getString(R.string.opt3_q1),
				getString(R.string.opt3_q2), getString(R.string.opt1_q3),
				getString(R.string.opt1_q4), getString(R.string.opt2_q5),
				getString(R.string.opt4_q6), getString(R.string.opt4_q7),
				getString(R.string.opt2_q8), getString(R.string.opt3_q9),
				getString(R.string.opt2_q10), getString(R.string.opt1_q11),
				getString(R.string.opt3_q12), getString(R.string.opt3_q13),
				getString(R.string.opt3_q14), getString(R.string.opt2_q15),
				getString(R.string.opt1_q16), getString(R.string.opt3_q17),
				getString(R.string.opt1_q18), getString(R.string.opt3_q19),
				getString(R.string.opt3_q20), getString(R.string.opt3_q21),
				getString(R.string.opt3_q22), getString(R.string.opt2_q23),
				getString(R.string.opt3_q24), getString(R.string.opt1_q25),
				getString(R.string.opt4_q26), getString(R.string.opt4_q27),
				getString(R.string.opt3_q28), getString(R.string.opt2_q29),
				getString(R.string.opt1_q30), getString(R.string.opt4_q31),
				getString(R.string.opt4_q32), getString(R.string.opt2_q33),
				getString(R.string.opt1_q34), getString(R.string.opt1_q35), };
		Bref = new String[] { "2 CHR 3:1", "EXO 2:10", "1 SAM 2:22",
				"JER 20:2", "PHIL 2:6", "NAH 1:15", "PHIL 4:11-12", "GEN 2:11",
				"REV 21:22", "IS 8:3", "ACT 1:1 LUKE 1:1", "DAN 1:7",
				"1 COR2:9-11", "ECCL 7:1", "PS 51:17", "TIT 1:1", "REV 2:14",
				"REV 3:7-14", "REV 3:7", "PS 51:11", "2 CHR 35:25",
				"2 COR 11:25", "2 COR 13:8", "GAL 2:22", "ACTS 5:34-39",
				"REV 3:16", "REV 2:15", "1 KING 14:21", "1 KING 2:13-23",
				"DAN 8:1", "DAN 7:1", "2 CHR 9:30", "2 CHR 9:31",
				"1 KING 2:27", "REV 3:1" };
	}

	public void initializingQ() {
		chk1 = (RadioButton) findViewById(R.id.btn1);
		chk2 = (RadioButton) findViewById(R.id.btn2);
		chk3 = (RadioButton) findViewById(R.id.btn3);
		chk4 = (RadioButton) findViewById(R.id.btn4);
		bql = findViewById(R.id.bql);
		tv1 = (TextView) findViewById(R.id.tv1);
		tv2 = (TextView) findViewById(R.id.tv2);
		btn5 = (Button) findViewById(R.id.btn);
		select = (RadioGroup) findViewById(R.id.radio);
		select.setOnCheckedChangeListener(this);
		counter = 0;
		m = 0;
		n = 0;
		o = 0;
		p = 0;
		s = new ArrayList<Integer>();
		btn5.setVisibility(-1);
	
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
		newConfig.orientation = 2;
		} else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
			newConfig.orientation = 1;
		}
	}

	@Override
	protected void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		outState.putLong("tyme", timeleft);
		outState.putIntArray("save", zea_mays);
		outState.putString("saved", ques[_question]);
		outState.putInt("score", Totalscore);

	}

	@Override
	protected void onRestoreInstanceState(Bundle serve) {
		super.onRestoreInstanceState(serve);
		if (serve == null) {
		} else {
			timeleft = serve.getLong("tyme");
			zea_mays = serve.getIntArray("save");
			ques[_question] = serve.getString("saved");
			tv1.setText(ques[_question]);
			tv2.setGravity(Gravity.CENTER);
			Totalscore = serve.getInt("score");

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return super.onCreateOptionsMenu(menu);

	}

	@Override
	protected void onDestroy() {

		super.onDestroy();
	}

	@Override
	protected void onPause() {

		super.onPause();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
	}

	@Override
	protected void onResume() {
		super.onResume();
	}

	@Override
	protected void onStart() {
		super.onStart();
	}

	@Override
	protected void onStop() {

		super.onStop();
	}

	private void time() {

		tyme = new CountDownTimer(start, 1000) {

			private long pavlov;

			@Override
			public void onTick(long mint) {

				pavlov = mint / 1000;
				timeleft = mint;
				tv2.setText("Timer: " + pavlov);
				tv2.setGravity(Gravity.CENTER);

			}

			@Override
			public void onFinish() {
				// when timer finishes
				Toast.makeText(page0.this, "Time Up!!!   click the Button",
						Toast.LENGTH_SHORT).show();
				ty();
				tv2.setText("Time Up!!!  click the Button");
				tv2.setTextColor(Color.rgb(now.nextInt(225), now.nextInt(225),
						now.nextInt(225)));
				btn5.setVisibility(+1);

				btn5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						ding.cancel();
						pop.cancel();
						nextQue();
					}
				});
			}
		}.start();

	}

	public void nextQue() {
		low = 15;
		if (counter == low) {
			String next = String.valueOf(Totalscore);
			String nt = String.valueOf(15);
			btn5.setText("DONE!!!");
			Bundle mud = new Bundle();
			mud.putString("key", next);
			Bundle mud1 = new Bundle();
			mud1.putString("zs", nt);
			Intent page1 = new Intent("nexus.fire.biblequiz.page10");
			page1.putExtras(mud);
			page1.putExtras(mud1);
			startActivity(page1);
			{
				super.onPause();
				finish();
			}
			oryza_sativa();

		} else if (counter < low) {
			select.clearCheck();
			btn5.setText("");
			queTime();
			select.setVisibility(+1);
			btn5.setVisibility(-1);
		}
	}

	private void ty() {

		btn5.setText("NEXT QUESTION");
		tyme.cancel();
		tv1.setText("Your current score is: " + Totalscore);
		tv2.setText("");
		tv2.setTextColor(Color.rgb(now.nextInt(225), now.nextInt(225),
				now.nextInt(225)));
		select.setVisibility(-1);

	}

	void number_generator() {
		// Instantiating a random number without repeation
		while (s.size() < 16) {
			succ = now.nextInt(34);
			if (s.contains(succ) == false) {
				s.add(succ);
				s.retainAll(s);
				if (s.size() != 15) {
					succ = now.nextInt(34);
				}
			}
		}
	}

	public void queTime() {
		high++;
		{
			{
				_question = s.get(high);
			}
			// Displaying the Question and options on screen
			// / counter++ is for counting the number of Question
			// and answer displayed
			counter++;

			tv1.setText(ques[_question]);
			chk1.setText(opt1[_question]);
			chk2.setText(opt2[_question]);
			chk3.setText(opt3[_question]);
			chk4.setText(opt4[_question]);
			bql.setBackgroundColor(Color.rgb(now.nextInt(225),
					now.nextInt(225), now.nextInt(225)));
			time();
			tv2.setText("");
			tv2.setTextColor(Color.WHITE);
			ding = Toast.makeText(page0.this,
					"CORRECT B_R: " + Bref[_question], Toast.LENGTH_SHORT);
			e = "CORRECT B_R: " + Bref[_question];
			pop = Toast.makeText(page0.this, "INCORRECT B_R: "
					+ Bref[_question], Toast.LENGTH_SHORT);
			f = "INCORRECT B_R: " + Bref[_question];

		}

	}

	@Override
	public void onCheckedChanged(RadioGroup group, int chk) {

		switch (chk) {
		case R.id.btn1:
			btn5.setVisibility(+1);
			try {
				btn5.setText("SUBMIT");
				btn5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {

						ty();
						checkAns1();
						Totalscore = m + n + o + p;
						tv1.setText("Your current score is: " + Totalscore);

						btn5.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								ding.cancel();
								pop.cancel();
								nextQue();

							}
						});

					}
				});

			} catch (Exception e) {
				e.printStackTrace();
			}

			break;
		case R.id.btn2:
			btn5.setVisibility(+1);
			try {
				btn5.setText("SUBMIT");
				btn5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						ty();
						checkAns2();
						Totalscore = m + n + o + p;
						tv1.setText("Your current score is: " + Totalscore);
						btn5.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								ding.cancel();
								pop.cancel();
								nextQue();

							}
						});

					}
				});

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case R.id.btn3:
			btn5.setVisibility(+1);
			try {
				btn5.setText("SUBMIT");
				btn5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						ty();
						checkAns3();
						Totalscore = m + n + o + p;
						tv1.setText("Your current score is: " + Totalscore);
						btn5.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								ding.cancel();
								pop.cancel();
								nextQue();

							}
						});

					}
				});

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;
		case R.id.btn4:
			btn5.setVisibility(+1);
			try {
				btn5.setText("SUBMIT");
				btn5.setOnClickListener(new OnClickListener() {
					@Override
					public void onClick(View v) {
						ty();
						checkAns4();
						Totalscore = m + n + o + p;
						tv1.setText("Your current score is: " + Totalscore);
						btn5.setOnClickListener(new OnClickListener() {
							@Override
							public void onClick(View v) {
								ding.cancel();
								pop.cancel();
								nextQue();

							}
						});

					}
				});

			} catch (Exception e) {
				e.printStackTrace();
			}
			break;

		}
	}

	public void checkAns1() {
		String answer = opt1[_question];
		if (isCorrect(answer)) {
			tv2.setText(e);
			ding.show();

			m++;
		} else {
			pop.show();
			tv2.setText(f);
		}
	}

	public void checkAns2() {

		String answer = opt2[_question];
		if (isCorrect(answer)) {
			tv2.setText(e);
			ding.show();

			n++;
		}

		else {
			pop.show();
			tv2.setText(f);
		}
	}

	public void checkAns3() {

		String answer = opt3[_question];
		if (isCorrect(answer)) {
			tv2.setText(e);
			ding.show();
			p++;
		} else {
			pop.show();
			tv2.setText(f);
		}
	}

	public void checkAns4() {
		String answer = opt4[_question];
		if (isCorrect(answer)) {
			tv2.setText(e);

			o++;
			ding.show();
		} else {
			pop.show();
			tv2.setText(f);
		}
	}

	public boolean isCorrect(String answer) {

		return (answer.equalsIgnoreCase(Cans[_question]));

	}

	private void oryza_sativa() {
		zea_mays = new int[] { Totalscore, high, counter, start, _question,
				low, rus, m, n, o, p, succ, stop, i, };

	}

}
