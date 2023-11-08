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
    std::unordered_map<char, std::unordered_map<
        std::string, std::string>>   dict;

    std::pair<std::string, std::string> parseLine(std::string row);
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
    char        first   = 'A';
    std::string second  = "Test";

/*
    for (char i = 0; i < 40; i++)
    {
        getline (ReadFile, line);
        pairTmp = add_line(line);

        if (dict.find(pairTmp.first) == dict.end()) {
            dict.insert(pairTmp);
        } else {
            dict.at(pairTmp.first) +=  " ||| " + pairTmp.second;
        }
    }
*/
    for (char i = 0; i < 40; i++)
        getline (ReadFile, line);
    
    std::cout<< line + "\n";

    ReadFile.close();    
}

DictFromCSV::~DictFromCSV()
{
}

std::pair<char, std::string> DictFromCSV::add_line(std::string row) {
    return std::pair<char, std::string>(row[0], &row[1]);
}

std::pair<std::string, std::string> DictFromCSV::parseLine(std::string row) {
    char*   word = new char[row.length()];
    int     pos  = 0;

    for ( ; row[pos] != ','; pos++)
        word[pos] = row[pos];
    

    return nullptr;
}


#endif
