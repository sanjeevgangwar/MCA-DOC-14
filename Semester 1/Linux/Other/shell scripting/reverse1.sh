clear
echo "Enter a number"
read n
sd=0
rev=0

while [ $n -gt 0 ]
do
    sd=$(( $n % 10 ))
    rev=$(( $rev *\ 10 + $sd ))
    n=$(( $n / 10 ))
echo "Reverse number of entered digit is $rev"
done
