package com.exp.fmodvoicechange;

/**
 * Created by haiyu.chen on 2018/12/10.
 */

public class Util {

  //音效的类型
  public static final int MODE_NORMAL = 0;//正常
  public static final int MODE_LUOLI = 1;//萝莉
  public static final int MODE_DASHU = 2;//大叔
  public static final int MODE_JINGSONG = 3;//惊悚
  public static final int MODE_GAOGUAI = 4;//搞怪
  public static final int MODE_KONGLING = 5;//空灵

  /**
   * 变声
   *
   * @param path 声音路径
   * @param type 变声类型
   */
  public static native void voiceChange(String path, int type);

  static {
    System.loadLibrary("fmodL");
    System.loadLibrary("fmod");
    System.loadLibrary("changeVoice");
  }
}
