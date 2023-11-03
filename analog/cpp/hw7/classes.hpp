#ifndef CLASSES_HPP
#define CLASSES_HPP

#include "defines.hpp"
#include <unordered_map>
#include <fstream>
#include <iostream>
#include <utility>

class DictFromCSV
{
private:
    std::unordered_map<char, std::string>   dict;
public:
    DictFromCSV();
    ~DictFromCSV();
    std::pair<char, std::string> add_line(std::string row);
};

DictFromCSV::DictFromCSV()
{
    std::string     line;
    std::ifstream   ReadFile(DCSV);
    std::pair<char, std::string> pairTmp;    


    for (char i = 0; i < 5; i++)
    {
        getline (ReadFile, line);
        pairTmp = add_line(line);

        if (dict.find(pairTmp.first) == dict.end())
            dict.insert(pairTmp);
            else {
                dict.insert(pairTmp.first,
                dict.find(pairTmp.first) + pairTmp.second);
            }
            

    }

    for (auto it : dict)
        std::cout<< it.first << " " <<
         it.second << std::endl;

    ReadFile.close();    
}

DictFromCSV::~DictFromCSV()
{
}

std::pair<char, std::string> DictFromCSV::add_line(std::string row) {
    return std::pair<char, std::string>(row[0], &row[1]);
}


#endif
