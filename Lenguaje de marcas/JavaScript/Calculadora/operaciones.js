var numero1;
var numero2;
var operacion;

function inicio(){
    //variables
    var resultado= document.getElementById("resultado");
    var reset= document.getElementById("reset");
    var suma= document.getElementById("suma");
    var resta= document.getElementById("resta");
    var multiplicacion= document.getElementById("multiplicacion");
    var division= document.getElementById("division");
    var igual= document.getElementById("igual");
    var uno= document.getElementById("uno");
    var dos= document.getElementById("dos");
    var tres= document.getElementById("tres");
    var cuatro= document.getElementById("cuatro");
    var cinco= document.getElementById("cinco");
    var seis= document.getElementById("seis");
    var siete= document.getElementById("siete");
    var ocho= document.getElementById("ocho");
    var nueve= document.getElementById("nueve");
    var cero= document.getElementById("cero");
    
    //BOTONES NUMERICOS
    uno.onclick = function(){
        resultado.textContent = resultado.textContent + "1";
    }
    dos.onclick = function(){
        resultado.textContent = resultado.textContent + "2";
    }
    tres.onclick = function(){
        resultado.textContent = resultado.textContent + "3";
    }
    cuatro.onclick = function(){
        resultado.textContent = resultado.textContent + "4";
    }
    cinco.onclick = function(){
        resultado.textContent = resultado.textContent + "5";
    }
    seis.onclick = function(){
        resultado.textContent = resultado.textContent + "6";
    }
    siete.onclick = function(){
        resultado.textContent = resultado.textContent + "7";
    }
    ocho.onclick = function(){
        resultado.textContent = resultado.textContent + "8";
    }
    nueve.onclick = function(){
        resultado.textContent = resultado.textContent + "9";
    }
    cero.onclick = function(){
        resultado.textContent = resultado.textContent + "0";
    }
    
    // OPERACIONES
    reset.onlcick = function(){
        resetear();
    }
    
    suma.onclick = function(e){
        numero1 = resultado.textContent;
        operacion = "+";
        resultado.textContent = "+";
        limpiar();
    }
    
    resta.onclick = function(e){
        numero1 = resultado.textContent;
        operacion = "-";
        limpiar();
    }
    
    multiplicacion.onlcick = function(e){
        numero1 = resultado.textContent;
        operacion = "*";
        limpiar();
    }
    division.onclick = function(e){
        numero1 = resultado.textContent;
        operacion = "/";
        limpiar();
    }
    igual.onclick = function(e){
        numero2 = resultado.textContent;
        resolver();
    }
}


function limpiar(){
    resultado.textContent="";
}
function resetear(){
    resultado.textContent="";
    numero1=0;
    numero2=0;
    operacion= "";
}
function resolver(){
    var res = 0;
    switch(operacion){
        case "+":
            res = parseFloat(numero1) + parseFloat(numero2);
            break;
        case "-":
            res = parseFloat(numero1) - parseFloat(numero2);
            break;  
        case "*":           
            res = parseFloat(numero1) * parseFloat(numero2);
            break;
        case "/":       
            res = parseFloat(numero1) / parseFloat(numero2);
            break;
    }
    resetear();
    resultado.textContent = res;
}