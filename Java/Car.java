
public class Car
{
  String m_color;
  int m_milage;
  float m_fuel;
  boolean m_lowPressure;
  int m_MPG;
  
  // Constructor (default) 
  public Car(String color, int milage,float fuel, boolean lowPressure, int MPG)
  {
    m_color = color;
    m_milage = milage;
    m_fuel = fuel;
    m_lowPressure = lowPressure;
    m_MPG = MPG;
  }
  
  public void drive (int speed, int distance)
  {
      m_milage = m_milage + distance;
      System.out.println("Driving");
  }
}
