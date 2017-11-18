int nodeAmount = 10;
PVector[] nodeObj = new PVector[nodeAmount];

void setup(){
  size(500, 500);
  for (int i = 0;i<nodeAmount;i++){
    nodeObj[i] = new PVector(random(width),random(height));
    ellipse(nodeObj[i].x ,nodeObj[i].y, 10, 10);
  }
}

void swap(PVector[a],PVector[b]){
  PVector(temp) = PVector[a];
  PVector[a] = PVector[b];
  PVector[b] = temp;
}

void draw(){

}
