package com.mysite.sbb.oop;

import java.io.InputStream;
import java.util.Properties;

public class TVEtude {
  public static void main(String[] args) throws Exception {
    Properties props = new Properties();
    InputStream in = TVEtude.class.getClassLoader().getResourceAsStream("product.properties");
    props.load(in);
    Class<?> tvClass = Class.forName(props.getProperty("tv"));
    Object obj = tvClass.getConstructor().newInstance();
    TV tv = (TV) obj;  //new SamsungTV();
    tv.powerOn();
    tv.channelUp();
    tv.channelUp();
    tv.soundUp();
    tv.powerOff();
  }
}
