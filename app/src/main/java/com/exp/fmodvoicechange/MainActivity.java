package com.exp.fmodvoicechange;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.io.File;
import org.fmod.FMOD;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    FMOD.init(this);
    setContentView(R.layout.activity_main);
    findViewById(R.id.btn_1).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        VoiceFun1(v);
      }
    });
    findViewById(R.id.btn_2).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        VoiceFun2(v);
      }
    });
    findViewById(R.id.btn_3).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        VoiceFun3(v);
      }
    });
    findViewById(R.id.btn_4).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        VoiceFun4(v);
      }
    });
    findViewById(R.id.btn_5).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        VoiceFun5(v);
      }
    });
    findViewById(R.id.btn_6).setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        VoiceFun6(v);
      }
    });
  }

  public void VoiceFun1(View btn) {
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()
        + File.separatorChar
        + "/Download/10028.wav";
    File file = new File(path);
    if (file.exists()) {
      Toast.makeText(this, "变声-正常", Toast.LENGTH_SHORT).show();
      Util.voiceChange(path, Util.MODE_NORMAL);
      Log.e("x---", "VoiceFun1");
    } else {
      Log.e("x---", "file is not exist");
      Toast.makeText(this, "file is not exist", Toast.LENGTH_SHORT).show();
    }
  }

  public void VoiceFun2(View btn) {
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()
        + File.separatorChar
        + "/Download/10028.wav";
    File file = new File(path);
    if (file.exists()) {
      Toast.makeText(this, "变声-萝莉", Toast.LENGTH_SHORT).show();
      Util.voiceChange(path, Util.MODE_LUOLI);
      Log.d("jason", "VoiceFun2");
    } else {
      Log.e("x---", "file is not exist");
      Toast.makeText(this, "file is not exist", Toast.LENGTH_SHORT).show();
    }
  }

  public void VoiceFun3(View btn) {
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()
        + File.separatorChar
        + "/Download/10028.wav";
    File file = new File(path);
    if (file.exists()) {
      Toast.makeText(this, "变声-大叔", Toast.LENGTH_SHORT).show();
      Util.voiceChange(path, Util.MODE_DASHU);
      Log.e("x---", "VoiceFun3");
    } else {
      Log.e("x---", "file is not exist");
      Toast.makeText(this, "file is not exist", Toast.LENGTH_SHORT).show();
    }
  }

  public void VoiceFun4(View btn) {
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()
        + File.separatorChar
        + "/Download/10028.wav";
    File file = new File(path);
    if (file.exists()) {
      Toast.makeText(this, "变声-惊悚", Toast.LENGTH_SHORT).show();
      Util.voiceChange(path, Util.MODE_JINGSONG);
      Log.e("x---", "VoiceFun4");
    } else {
      Log.e("x---", "file is not exist");
      Toast.makeText(this, "file is not exist", Toast.LENGTH_SHORT).show();
    }
  }

  public void VoiceFun5(View btn) {
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()
        + File.separatorChar
        + "/Download/10028.wav";
    File file = new File(path);
    if (file.exists()) {
      Toast.makeText(this, "变声-搞笑", Toast.LENGTH_SHORT).show();
      Util.voiceChange(path, Util.MODE_GAOGUAI);
      Log.e("x---", "VoiceFun5");
    } else {
      Log.e("x---", "file is not exist");
      Toast.makeText(this, "file is not exist", Toast.LENGTH_SHORT).show();
    }
  }

  public void VoiceFun6(View btn) {
    String path = Environment.getExternalStorageDirectory().getAbsolutePath()
        + File.separatorChar
        + "/Download/10028.wav";
    File file = new File(path);
    if (file.exists()) {
      Toast.makeText(this, "变声-空灵", Toast.LENGTH_SHORT).show();
      Util.voiceChange(path, Util.MODE_KONGLING);
      Log.e("x---", "VoiceFun6");
    } else {
      Log.e("x---", "file is not exist");
      Toast.makeText(this, "file is not exist", Toast.LENGTH_SHORT).show();
    }
  }

  @Override protected void onDestroy() {
    super.onDestroy();
    FMOD.close();
  }

  @Override public void onBackPressed() {
    super.onBackPressed();
    finish();
  }
}
