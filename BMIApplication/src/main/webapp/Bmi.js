let massRatan=parseInt(prompt("Enter the Ratan mass"));
let heightRatan=parseFloat(prompt("Enter the Ratan height"));

let massAnu=parseInt(prompt("Enter the Anu mass"));
let heightAnu=parseInt(prompt("Enter the Anu height"));

let BMIRatan=massRatan/(heightRatan*heightRatan);
let BMIAnu=massAnu/(heightAnu*heightAnu);


console.log("BMI of Ratan.."+BMIRatan);
console.log("BMI of Anu.."+BMIAnu);

document.write("BMI of Ratan.."+BMIRatan);
document.write("BMI of Anu.."+BMIAnu);


	console.log("Ratan has a higher BMI than Anu"  +BMIRatan>BMIAnu)
	document.write("Ratan has a higher BMI than Anu"  +BMIRatan>BMIAnu)



