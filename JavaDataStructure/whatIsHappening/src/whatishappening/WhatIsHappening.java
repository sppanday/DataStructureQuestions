package whatishappening;


public class WhatIsHappening {

public static void main(String[] args) {

System.out.println( whatHappens(50));
}

private static int whatHappens(int limit) { 

int counter = 0;
int sum = 0;
int nextValue = 2;

while (sum < limit) {
sum = sum + nextValue;
nextValue = nextValue + 2;
counter++;
}
return counter;
}
}

