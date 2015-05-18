/*
*
*
*  INTELLIGENT TRAFFIC MANAGEMENT SYSTEM(ITMS)
*  ARDUINO SOURCE CODE
*
*
*/



//Red and Green LED Pin Configuration
#define G1 12 
#define G2 10
#define G3 8
#define G4 6
#define R1 13
#define R2 11
#define R3 9
#define R4 7

int r[4],g[4]; 

void setup(){
  Serial.begin(115200); // Setup Serial communication.
  pinMode(G1,OUTPUT);   // Setup LED Pins as OUTPUT Pins.
  pinMode(G2,OUTPUT);
  pinMode(G3,OUTPUT);
  pinMode(G4,OUTPUT);
  pinMode(R1,OUTPUT);
  pinMode(R2,OUTPUT);
  pinMode(R3,OUTPUT);
  pinMode(R4,OUTPUT);
  
  digitalWrite(G1,LOW); // Initialising all as LOW.
  digitalWrite(G2,LOW);
  digitalWrite(G3,LOW);
  digitalWrite(G4,LOW);
  digitalWrite(R1,LOW);
  digitalWrite(R2,LOW);
  digitalWrite(R3,LOW);
  digitalWrite(R4,LOW);

}
void loop(){
  char str[20];
  int i=0;
  if(Serial.available()){          // Start the Code with Serial Communiation

    while(Serial.available()<8){}  // Wait for all the Bytes to Receive. 
     for(int n=0; n<8; n++)
     str[n] = Serial.read();       // Storing all Received Bytes in an array. 
    
  
    g[0]=str[0]-'0';               // Converting String to Integer.
    g[1]=str[2]-'0';
    g[2]=str[4]-'0';
    g[3]=str[6]-'0';

while(1){                          // Passing th values of Green LED as delay() in Main Program. 
  digitalWrite(G4,LOW);
  digitalWrite(R1,LOW);
  digitalWrite(G1,HIGH);
  digitalWrite(R2,HIGH);
  digitalWrite(R3,HIGH);
  digitalWrite(R4,HIGH);
  delay(g[0]*1000);

  digitalWrite(G1,LOW);
  digitalWrite(R2,LOW);
  digitalWrite(G2,HIGH);
  digitalWrite(R1,HIGH);
  digitalWrite(R3,HIGH);
  digitalWrite(R4,HIGH);
  delay(g[1]*1000);
  
  digitalWrite(G2,LOW);
  digitalWrite(R3,LOW);
  digitalWrite(G3,HIGH);
  digitalWrite(R2,HIGH);
  digitalWrite(R4,HIGH);
  digitalWrite(R1,HIGH);
  delay(g[2]*1000);
  
  digitalWrite(G3,LOW);
  digitalWrite(R4,LOW);
  digitalWrite(G4,HIGH);
  digitalWrite(R3,HIGH);
  digitalWrite(R2,HIGH);
  digitalWrite(R1,HIGH);
  delay(g[3]*1000);
}

}
}

