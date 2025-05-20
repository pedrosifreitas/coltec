class Ball{
  float x, y;
  float vy, ay;
  
  public Ball()
  {
    x = random(10, width - 10);
    y = 10;
    
    vy = 0;
    ay = 0.1;
  }
  
  void update()
  {
    vy += ay;
    y += vy;
    
    if(y + 10 == height)
    {
      vy *= -0.9;
    }
  }
  
  void show(PImage img)
  {
    image(img, x - 10, y - 10, 20, 20);
  }
}
