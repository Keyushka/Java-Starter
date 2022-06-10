package javaEssential.lessons.l3_inheritance_and_polymorphism.models;

public class Tram extends Transport {
     private Boolean isConnectedToElec;

 public Tram(long id, String driver, Route route, String type, Boolean isConnectedToElec) {
  super(id, driver, route, type);
  this.isConnectedToElec = isConnectedToElec;
 }

 public Boolean getConnectedToElec() {
  return isConnectedToElec;
 }

 public void setConnectedToElec(Boolean connectedToElec) {
  isConnectedToElec = connectedToElec;
 }
}
