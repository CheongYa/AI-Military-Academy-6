package stage08.oop.et12;

public class SamsungTV implements TV {
  public void powerOn(){
    System.out.println("SamsungTV : TV를 켭니다.");
  }
  public void powerOff(){
    System.out.println("SamsungTV : TV를 끕니다.");
  }
  public void channelUp(){
    System.out.println("SamsungTV : 채널을 올립니다.");
  }
  public void channelDown(){
    System.out.println("SamsungTV : 채널을 내립니다.");
  }
  public void soundUp(){
    System.out.println("SamsungTV : 소리를 키웁니다.");
  }
  public void soundDown(){
    System.out.println("SamsungTV : 소리를 줄입니다.");
  }
}
