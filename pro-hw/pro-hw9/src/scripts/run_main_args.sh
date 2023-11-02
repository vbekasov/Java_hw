#!/bin/zsh
#!/bin/bash

java -version;

FLAGS="";
for user in "$@"
do
    FLAGS=$FLAGS' '$user;
done

P=`pwd`;
echo $P;
java $P/Main.java $FLAGS;
