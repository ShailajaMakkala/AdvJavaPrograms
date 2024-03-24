let Dolphinsc1=parseInt(prompt("Enter the 1st Score of Dolphons"));
let Dolphinsc2=parseInt(prompt("Enter the 2nd Score of Dolphons"));
let Dolphinsc3=parseInt(prompt("Enter the 3rd Score of Dolphons"));


let Koalassc1=parseInt(prompt("Enter the 1st of Koalas"));
let Koalassc2=parseInt(prompt("Enter the 2nd Score of Koalas"));
let Koalassc3=parseInt(prompt("Enter the 3rd Score of Koalas"));

let scoreDolphin=(Dolphinsc1+Dolphinsc2+Dolphinsc3)/3;
let scoreKoalas=(Koalassc1+Koalassc2+Koalassc3)/3;

if(scoreDolphin===scoreKoalas)
{
	document.write("Both win the trophy");
}
else if(scoreDolphin>=100)
{
	document.write("Dolphins win the trophy");

}
else{
	document.write("Koalas win the trophy");

}

