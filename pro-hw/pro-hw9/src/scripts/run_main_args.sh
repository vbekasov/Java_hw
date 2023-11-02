#!/bin/zsh
#!/bin/bash

java -version;

FLAGS="";
for user in "$@"
do
    FLAGS=$FLAGS' '$user;
done

java $P/Main.java $FLAGS;
