function cutFruitPieces(fruit){
	return `juice preparing with ${fruit*4}`;
	
}
function fruitProcessor(apples,oranges){
	const applejuice= cutFruitPieces(apples)
	const orangejuice=cutFruitPieces(oranges)
	return ` ${applejuice} apples and ${orangejuice} oranges`;
}

console.log(fruitProcessor(8,6))