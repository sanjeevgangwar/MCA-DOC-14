echo -n "Enter number : "
read n
 
sd=0
 
# store number of digit 
nd=0
on=$n # store $n so that we can use it later
 
# use while loop to caclulate the number of digit
while [ $n -gt 0 ]
do
    sd=$(( $n % 10 )) # get Remainder 
    n=$(( $n / 10 )) 
    nd=$(( $nd + 1)) # calculate all digit in a number till n is not zero
done
echo  "Number of digit in a $on is $nd"
