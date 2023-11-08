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
        std::string, std::string>* >   dict;

    std::pair<std::string, std::string> parse_line(std::string row);
public:
    DictFromCSV();
    ~DictFromCSV();
    std::pair<char, std::string> add_line(std::string row);
    void print_letter(char let);
};

DictFromCSV::DictFromCSV()
{
    std::string     line;
    std::ifstream   ReadFile(DCSV);
    std::pair<std::string, std::string> pairTmp;
    std::unordered_map<std::string, std::string>* mapDif = nullptr;
    std::string second  = "";

    while(getline (ReadFile, line))
    {
        pairTmp = parse_line(line);

        if (dict.find(line[0]) == dict.end()) {
            mapDif = new std::unordered_map<std::string, std::string>();
            mapDif->insert(pairTmp);
            dict[line[0]] = mapDif;
        } else {
            mapDif = dict.at(line[0]);
            if (mapDif->find(pairTmp.first) == mapDif->end())
                mapDif->insert(pairTmp);
            else {
                second = mapDif->at(pairTmp.first);
                pairTmp.second = second + "\n!!!!" + pairTmp.second;
                mapDif->insert(pairTmp);
                //std::cout<< pairTmp.first << "   " << pairTmp.second << '\n';
            }
        }
    }

    ReadFile.close();    
}

DictFromCSV::~DictFromCSV()
{
}

std::pair<char, std::string> DictFromCSV::add_line(std::string row) {
    return std::pair<char, std::string>(row[0], &row[1]);
}

std::pair<std::string, std::string> DictFromCSV::parse_line(std::string row) {
    int     pos  = 0;

    while (row[pos++] != ',') {}
        
    std::string word(&row[0], pos - 1);
    
    pos = row.length() - 2;
    while (row[--pos] != '[') {}
    std::string dif(&row[pos+2]);

    return std::pair<std::string, std::string>(word, dif);
}

void DictFromCSV::print_letter(char let) {
    if (dict.find(let) != dict.end()) {
        std::unordered_map<std::string, std::string> *tmp = dict.at(let);
        
        for (auto it : *tmp)
            std::cout<< it.first << "   " << it.second << '\n';
    }

}


#endif
