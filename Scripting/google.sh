#!/bin/bash

echo "Hello World!"
echo "Again Me"

num_of_companies=15
echo "${num_of_companies}"

my_string="A very long string"
my_length=8

echo "${my_string:0:my_length}"
echo "${#my_string}"

array=(one two three four)
echo "The first item in my array: ${array[0]}"
echo "My array has these: ${array[@]}"
echo "The length of array is: ${array[@]}"

for item in "${array[@]}"; do
    echo "${item}"
done

echo "Last program's return value: $?"
echo "All arguments passed to script: $@"
echo "The first argument: $1"
echo {1..10}
echo {a..z}


echo "Enter your name: "
read name
echo "Your name is: $name"

if [[ $name == "Amir" ]]; then
    echo "Your name is Amir"
else
    echo "Your name is not Amir"
fi

# my_text_files=${ls | grep '\.txt'}
# echo $my_text_files

function numberPrinter() {
    for if in {1..10}; do
        echo $i
    done
}

numberPrinter

git commit && git push
gir commit || echo "Commit failed"

while read -r line; do
    echo $line
done < "file.txt"

printf "Hello %s, I'm %s" Sven Olga

printf "1+1 = %d" 2
