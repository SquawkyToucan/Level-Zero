void setup(){
  size(2000,1000);
  background(200,200,0);
}
void draw(){
  for(int i = 0; i < 1000; i++){
    float x=random(1000);
    float y=random(1000);
    x=getWormX(i);
    y=getWormY(i);
    fill(random(255), random(255), random(255));
    ellipse(x, y, 10, 10);
  }
  makeMagical();
}
float frequency = .001;
float noiseInterval = PI;
void makeMagical(){
  fill(0,0,0,10);
  rect(0,0,width,height);
  noStroke();
}
float getWormX(int i){
  return map(noise(i*noiseInterval + frameCount * frequency), 0,1,0, width);
}
float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}

