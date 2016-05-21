float r = 0.1;
boolean plus, minus = false;
//This is the Amazing Rings Project
void setup(){
  size(800,500);
  smooth(8);
  background(0,0,0);
}

void draw(){
  background(0,0,0);
  for(int i=300; i>0; i=i-10){
    pushMatrix();
    translate(width/4,height/4);
    noFill();

     strokeWeight(2);
     stroke(random(255), random(255), random(255));
  ellipse(r,100,i,i);
  popMatrix();
}
  for(int j=300; j>0; j=j-10){
    pushMatrix();
    translate(width/4,height/4);
    noFill();
    
stroke(random(255), random(255), random(255));
  ellipse(350-r,100,j,j);
  popMatrix();
}
if(r<5){
      plus=true;
    minus=false;

}
if(r>450){
      plus=false;
    minus=true;

}
if(plus){
 r=r+0.2;
}
if (minus){
  r=r-0.1;
}

}
