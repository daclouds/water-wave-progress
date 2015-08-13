package cn.modificator.waterwaveprogressdemo;

import cn.modificator.waterwave_progress.WaterWaveProgress;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        WaterWaveProgress waveProgress = (WaterWaveProgress) findViewById(R.id.waterWaveProgress1);

        waveProgress.setShowProgress(false);
        waveProgress.setShowNumerical(false);
        waveProgress.setmRingBgColor(Color.TRANSPARENT);
        waveProgress.setmRingColor(Color.TRANSPARENT);

        waveProgress.setWaterColor(Color.RED);
        waveProgress.setmWaterColor(Color.RED);
		waveProgress.setProgress(90);
		waveProgress.animateWave();

        waveProgress = (WaterWaveProgress) findViewById(R.id.waterWaveProgress2);

        waveProgress.setShowProgress(false);
        waveProgress.setShowNumerical(false);
        waveProgress.setmRingBgColor(Color.TRANSPARENT);
        waveProgress.setmRingColor(Color.TRANSPARENT);

//        waveProgress2.setWaterAlpha(0.5f);
        waveProgress.setWaterBgColor(Color.TRANSPARENT);
		waveProgress.setProgress(88);
        waveProgress.setWaveSpeed(0.055F);

		waveProgress.animateWave();

        //		SeekBar bar = (SeekBar) findViewById(R.id.seekBar1);

//		bar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
//
//			@Override
//			public void onStopTrackingTouch(SeekBar seekBar) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void onStartTrackingTouch(SeekBar seekBar) {
//				// TODO Auto-generated method stub
//
//			}
//
//			@Override
//			public void onProgressChanged(SeekBar seekBar, int progress,
//					boolean fromUser) {
//				setTitle("" + progress);
//				waveProgress.setProgress(progress);
//
//			}
//		});
//		((CheckBox)findViewById(R.id.checkBox1)).setOnCheckedChangeListener(new OnCheckedChangeListener() {
//
//			@Override
//			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//					waveProgress.setShowProgress(isChecked);
//			}
//		});
//((CheckBox)findViewById(R.id.checkBox2)).setOnCheckedChangeListener(new OnCheckedChangeListener() {
//
//			@Override
//			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//					waveProgress.setShowNumerical(isChecked);
//			}
//		});
	}
}
