PImage pepperoni;
PImage olive;
PImage mushroom;
void setup() {
  pepperoni = loadImage("pepperoni.png");
  pepperoni.resize(30,30);
  olive = loadImage("olive.png");
  olive.resize(30,30);
  mushroom = loadImage("mushroom.png");
  mushroom.resize(30,30);
    size(500,500);
    fill(#FAD69C);
    ellipse(250,250,400,400);
    fill(#FF0329);
    ellipse(250,250,380,380);
    fill(#F0F290);
    ellipse(250,250,360,360);
}
void draw() {
  if (mousePressed) {
    image(pepperoni,200,200);
    image(pepperoni,100,150);
    image(pepperoni,200,300);
    image(pepperoni,223,370);
    image(pepperoni,300,150);
    image(pepperoni,300,300);
    image(olive,200,150);
    image(olive,350,140);
    image(olive,150,190);
    image(olive,340,340);
  }
  if (mousePressed && (mouseButton == RIGHT)) {
    image(mushroom,150,300);
    image(mushroom,170,150);
    image(mushroom,200,320);
    image(mushroom,300,370);
  }
}
