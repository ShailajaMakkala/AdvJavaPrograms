function  validateForm()
{
	// Read the form data
	var proId=document.getElementById("proId").value;
	var proName=document.getElementById("proName").value;
	var proPrice=document.getElementById("proPrice").value;
	var proBrand=document.getElementById("proBrand").value;
	var proMadeIn=document.getElementById("proMadeIn").value;
	
	
	if(proId.trim()===""||proName.trim()===""||proPrice.trim()===""||proBrand.trim()===""||proMadeIn.trim()===""){
		alert("All fields must be filled out");
		return false;
	}
	
	if(parseFloat(proPrice)<0){
		alert("proPrice must be a non-negative value")
	}
	
	if(proName.length>50 || proBrand.length>50){
		alert("product name and product brand must be less than 50 characters")
	}
	
	//get the mfg and exp dates
	
	var proMfcDate=document.getElementById("proMfcDate").value;
	var proExpDate=document.getElementById("proExpDate").value;
	
	// convert into dateformat
	var manufacturingDateObj=new Date(proMfcDate);
	var expiryDateObj=new Date(proExpDate);
	
	//check the validation of dates
	if(manufacturingDateObj>expiryDateObj){
		alert("Manufacturing date cannot be greater than expirydate...");
		return false;
		
	}
	return true;
}