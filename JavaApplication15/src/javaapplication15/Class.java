/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author sabri
 */
public class Class {
    private String[] players = {"Precious Achiuwa","Bam Adebayo","Avery Bradley", "Jimmy Butler", "Goran Dragic","Maurice Harkless","Udonis Haslem","Tyler Herro","Andre Iguodala","Meyers Leonard","Kendrick Nunn"};
    
    public String[] GetPlayers ()
    {
        return players;
    }
    int index = 0;
    public void Show ()
    {
        for (String position : players) {
                System.out.println(players[index]) ;
                index++;
    }
    }
   private String name;
   private int age;
   public Class(String name, int age)
   {
      this.name = name;
      this.age = age;
   }
   public void display(){
      System.out.println("Name: "+this.name);
      System.out.println("Age: "+this.age);
      
   }
    
}

        