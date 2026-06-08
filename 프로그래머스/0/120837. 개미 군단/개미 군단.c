#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int hp) {
    int a = hp/5;
    hp = hp % 5;
    int b = hp / 3;
    hp = hp % 3;
    int c = hp / 1;
    
    return a + b + c;
}