#include <iostream>
#include "./libraries/IterClass.hpp"

int main(int argc, char const *argv[])
{
    int arr[] = {1, 2, 3, 4};

    Iter<int> it = Iter<int>(arr);

    return 0;
}
