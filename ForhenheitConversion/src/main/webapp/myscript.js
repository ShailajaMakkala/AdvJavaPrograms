function convertToCelsius()
{
	// Read the fahrenheitInput store in variable
	const fahrenheitInput =document.getElementById("fahrenheitInput").value;
	
	//convert the fahrenheitInputr to celsius
	const celsiusTemperature=(parseFloat(fahrenheitInput)-32)*5/9;
	
	//set the output to celsiusOutput filled
	document.getElementById("celsiusoutput").value=celsiusTemperature.toFixed(2);
	
}