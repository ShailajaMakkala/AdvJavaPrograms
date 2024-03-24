function greet()
{
	document.writeln("Love You Greeshma"+"<br>")
}
function add(num1,num2)
{
  let result;
  result=num1+num2;
  document.writeln("Addition of two number:" +result +"<br>");
 }

function billcalc(name,price,quantity)
{
	let totalBill;
	totalBill=price*quantity;
	return totalBill;
}

function dummy()
{
	
}

greet();
add(10,20);
let bill=billcalc("sugar",120,5);
  document.writeln(" Your Bill...:"+bill+ "<br>");
  
let res=dummy();
document.writeln("dummy return value..."+res+"<br>")

