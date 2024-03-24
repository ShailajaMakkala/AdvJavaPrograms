function palindromOrNot()
{
	//read the number input store in variable
	const n=document.getElementById("numberInput").value;
	
    // Changed variable name and initialized as empty string
	let p="";
	
	for(let i=n.length-1;i>=0;i--)
	//set the output to result output field
	p=p+n[i];
	
	//comparing two strings are equal or not
	if(p==n)
	{
		alert("its a palindrom");
		
	}
	else
	{
				alert("its not a palindrom");

	}
}