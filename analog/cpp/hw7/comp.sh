#!/bin/zsh
#!/bin/bash

rm -f ./bin_file ;
c++ main.cpp -std=c++20 -o bin_file; 
./bin_file ;
