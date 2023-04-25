echo "enter a: "
read a
echo "enter b: "
read b
echo "enter c: "
read c
echo "Smallest number is: "
if [ $a -le $b -a $a -le $c ]
then
echo $a
elif [ $b -le $c -a $b -le $a ]
then
echo $b
else
echo $c
fi
echo "And Largest number is:"
if [ $a -gt $b ] && [ $a -gt $c ]
then
    echo $a
    
   if [ `expr $a % 2` == 0 ]
then
	echo "$a is even"
else
	echo "$a is Odd"
fi
elif [ $b -gt $a ] && [ $b -gt $c ]
then
    echo $b
    
else
    echo $c
fi
