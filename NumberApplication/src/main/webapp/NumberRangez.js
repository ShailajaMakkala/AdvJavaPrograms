
for(var i=1;i<=100;i++);
{
	if (i%3===0)
	{
		document.write("Fizz");
		consol.log("Fizz");
	}
	else if (i%5===0)
	{
			document.write(i+"Buzz");
			consol.log(i+"Buzz");
		}
	else if (i%3===0 && i%5===0)
	{
				document.write(i+"FizzBuzz");
				consol.log(i+"FizzBuzz");
	}
	else
	{
	document.write(i);
	console.log(i);
	}
	}