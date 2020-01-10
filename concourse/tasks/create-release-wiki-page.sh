#!/bin/bash
set -e
workdir=`pwd`
vsix_files=$(find *-vsix -name "*.vsix")
page=$workdir/sts4-wiki/Current-VSCode-Releases.md

echo "Current/Latest Vscode Releases" > $page
echo "==============================" >> $page
echo "" >> $page
for vsix_file in ${vsix_files}
do
    echo "Processing $vsix_file"
    fname=$(basename $vsix_file)
    echo "- [$fname](https://dist.springsource.com/release/STS4/vscode/$fname)" >> $page
done

echo "Current Vsix Release Page Generated:"
echo "----------------------------------------------"
cat $page
echo "----------------------------------------------"

cd $workdir/sts4-wiki
git config user.email "kdevolder@pivotal.io"
git config user.name "Kris De Volder"

git add .

git commit \
    -m "Update vscode latest downloads wiki page"

git clone $workdir/sts4-wiki $workdir/sts4-wiki-out