package com.nt.main;
import java.time.LocalTime;




public class WishMessageGenerator {
  private LocalTime lt;

  public WishMessageGenerator() {
      System.out.println("no-arg constructor");
  }
  // setter method for injection
  public void setLt(LocalTime lt){
      System.out.println("WishMessageGenerator.setlt()");
      this.lt = lt;
  }

  // b.method

 public String generateWishMessage(String user){
      System.out.println("WishMessageGenerator.generateWishMessage()");
      int hour = lt.getHour();
      if (hour < 12)
          return "Good Morning:" + user;
      else if (hour < 16)
          return "Good Afternoon:"+ user;
      else if (hour < 20)
          return "Good Evening:"+ user;
      else
          return "Good Night:" + user;

 }

}
