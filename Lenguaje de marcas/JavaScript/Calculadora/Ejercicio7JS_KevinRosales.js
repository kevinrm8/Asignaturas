
document.getElementById("num1").addEventListener("click",num1);
document.getElementById("num2").addEventListener("click",num2);
document.getElementById("num3").addEventListener("click",num3);
document.getElementById("num4").addEventListener("click",num4);
document.getElementById("num5").addEventListener("click",num5);
document.getElementById("num6").addEventListener("click",num6);
document.getElementById("num7").addEventListener("click",num7);
document.getElementById("num8").addEventListener("click",num8);
document.getElementById("num9").addEventListener("click",num9);
document.getElementById("num0").addEventListener("click",num0);
document.getElementById("suma").addEventListener("click",suma);
document.getElementById("resta").addEventListener("click",resta);
document.getElementById("div").addEventListener("click",division);
document.getElementById("mult").addEventListener("click",multiplicacion);
document.getElementById("reset").addEventListener("click",reset);
document.getElementById("igual").addEventListener("click",Result);
//MOSTRAR NUMERO QUE HEMOS PRESIONADO
function num1() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num1").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num2() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num2").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num3() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num3").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num4() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num4").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num5() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num5").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num6() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num6").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num7() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num7").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num8() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num8").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num9() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num9").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}
function num0() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("num0").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}

function suma() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("suma").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}

function resta() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("resta").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}

function division() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("div").innerHTML;
	document.getElementById('resultado').innerHTML = actual + sumado
}

function multiplicacion() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("mult").innerHTML;
	document.getElementById('resultado').innerHTML = actual +  sumado
}
function reset() {
	let actual = document.getElementById('resultado').innerHTML;
	let sumado = document.getElementById("reset").innerHTML;
	document.getElementById('resultado').innerHTML = "";
}

//HACER LAS OPERACIONES SEGUN EL SIGNO DE LA OPERACION
function Result() {
	let actual = document.getElementById('resultado').innerHTML;
	let suma = actual.indexOf("+");
	let resta = actual.indexOf("-");
	let div = actual.indexOf("÷");
	let mult = actual.indexOf("x");
    
	if (suma !== -1) {
		arr = actual.split("+",2);
		res = parseInt(arr[0]) + parseInt(arr[1]);
		document.getElementById("resultado").innerHTML = res;
	} else if (resta !== -1) {
		arr = actual.split("-",2);
		res = arr[0] - arr[1];
		document.getElementById("resultado").innerHTML = res;
		
	} else if (div !== -1) {
		arr = actual.split("÷",2);
		res = arr[0] / arr[1];
		document.getElementById("resultado").innerHTML = res;
		
	} else if (mult !== -1) {
		arr = actual.split("x",2);
		res = arr[0] * arr[1];
		document.getElementById("resultado").innerHTML = res;
		
	}
}