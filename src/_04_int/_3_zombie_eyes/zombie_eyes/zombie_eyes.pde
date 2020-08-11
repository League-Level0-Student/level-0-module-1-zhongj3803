
void setup() {
  size(500,500);
  PImage face = loadImage("face.jpg");
  face.resize(500,500);
  image(face,0,0);
}
void draw() {
fill(mouseX,mouseY,138);
  ellipse(185,140,50,50);
  ellipse(300,140,50,50);
  fill(0,0,0);
  ellipse(185,140,10,10);
  ellipse(300,140,10,10);
}
