#ifndef ITERCLASS_HPP
#define ITERCLASS_HPP

#include <IterableClass.cpp>

template <class T> class Iter {
    private:
        T*      arr = nullptr;
        int     size = 0;
    public:
        Iter(T inArr[]);

};

template <class T> Iter<T>::Iter(T inArr[])
{
    arr = inArr;

    T* end = arr;
    while (end) {
        std::cout<< (T)end << "  ";
        size++;
        end++;
    }
    std::cout<<'\n';
};

#endif


