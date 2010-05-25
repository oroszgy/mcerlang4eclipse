#! /bin/bash

TMP="../tmp"
TMPUPDATE=$(TMP)"/update"
UPDATE="org.mcerlang.update"

git checkout master

mkdir $(TMP)
mkdir $(TMPUPDATE)
cp ./org.mcerlang.update/* -r 

git checkout gh-pages
cp $(TMPUPDATE)/* -r ./update

rm $(TMP) -r $(TMP)