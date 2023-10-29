#ifndef ITERABLECLASS_CPP
#define ITERABLECLASS_CPP


template <class T> class BaseIter {
    private:
        T       arr[];
        int     capacity;

    public:
        BaseIter(T inArr[], int len);
        
};

template <class T> BaseIter<T>::BaseIter(T inArr[], int len)
{
    arr = new int[len];

    while (--len >= 0)
        arr[len] = inArr[len];
}

#endif
