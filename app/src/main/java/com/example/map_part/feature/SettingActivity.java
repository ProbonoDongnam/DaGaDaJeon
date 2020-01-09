package com.example.map_part.feature;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.map_part.R;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

public class SettingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
    }
    public void onClickEnglishButton(View v){
        Intent intent = new Intent();
        intent.putExtra("source_language", "en");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }
    public void onClickChineseButton(View v){
        Intent intent = new Intent();
        intent.putExtra("source_language", "zh");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }
    public void onClickVietnameseButton(View v){
        Intent intent = new Intent();
        intent.putExtra("source_language", "vi");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }
    public void onClickThaiButton(View v){
        Intent intent = new Intent();
        intent.putExtra("source_language", "th");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }
    public void onClickTagalogButton(View v){
        Intent intent = new Intent();
        intent.putExtra("source_language", "tl");
        setResult(RESULT_OK, intent);

        //액티비티(팝업) 닫기
        finish();
    }
}
