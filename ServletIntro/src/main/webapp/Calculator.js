window.onload = function(){
    document.getElementById("n1").addEventListener("change",math);
    document.getElementById("n2").addEventListener("change",math);
    document.getElementById("operation").addEventListener("change",math);
	
}

function math(){
    operation = document.getElementById("operation").value;

    if(operation == 'Add'){
        document.getElementById("result").innerHTML = Number(n1.value)+Number(n2.value);
    }else if(operation == 'Subtract'){
        document.getElementById("result").innerHTML = Number(n1.value)-Number(n2.value);
    }else if(operation == 'Divide'){
        document.getElementById("result").innerHTML = Number(n1.value)/Number(n2.value);
    }else if(operation == 'Multiply'){
        document.getElementById("result").innerHTML = Number(n1.value)*Number(n2.value);
    }
}