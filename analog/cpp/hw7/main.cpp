#include <iostream>
#include <fstream>
#include <string.h>

#include "classes.hpp"

int main () {
    DictFromCSV tmp = DictFromCSV();

    //tmp.print_letter('c');
    //std::cout<< "===================\n";
    tmp.print_letter('A');

    return 0;
}
