void setup(){
  
int textsize = 10;
size(1000,1000);
for(;true;){
 textsize++;
 textSize(textsize);
 fill(random(255),random(255),random(255));
 textsize++;
 text("Toucan", random(1000), random(1000));
 fill(random(255),random(255),random(255));
 textsize++;
 text("In-N-Out", random(1000), random(1000));
 fill(random(255),random(255),random(255));
 textsize++;
 text("Java", random(1000), random(1000));
 fill(random(255),random(255),random(255));
 textsize++;
 text("Squash", random(1000), random(1000));
 fill(random(255),random(255),random(255));
 textsize++;
 text("Computers", random(1000), random(1000));
}
}

