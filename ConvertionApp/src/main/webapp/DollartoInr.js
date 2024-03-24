function ConvertToInr()
{
	//Read the Dollar Input Store in variable
	const dollarInput=document.getElementById("dollarInput").value;
	
	//Conver Dollar to INR
	const Inr=parseFloat(dollarInput)*83;
	
	//set the ouput to Indian RUpees
	document.getElementById("InrOutput").value=Inr.toFixed(2);
}