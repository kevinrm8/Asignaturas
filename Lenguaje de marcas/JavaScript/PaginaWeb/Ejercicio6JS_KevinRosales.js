function Diabetico(){  //Pedir acceso a la pagina
    var r = true;
    var r2 = true;
    
     r = confirm("\t\t¡ATENCION!\n Si eres diabetico te aconsejamos no entrar en la pagina.")
       if(r == false){
                   r2 = confirm("Entro bajo mi responsabilidad");
                       if(r2 == false){
                           location.replace("Diabetico.html");
                       }            
        }else 
            alert("Bienvenido a la pagina!");    
}

    //HISTORIA PAGINA 2
var x;
function siguiente(){ // CADA X SEGUNDOS SE MUESTRA ALGO DE LA HISTORIA
    document.getElementById("descubre").innerHTML = "";
    
    x = setTimeout(function(){titulo("");},1000);
    
    x = setTimeout(function(){Anyo92("");},4000);
    x = setTimeout(function(){hist92("");},5000);
    
    x = setTimeout(function(){Anyo98("");},8000);
    x = setTimeout(function(){hist98("");},9000);
    
    x = setTimeout(function(){Anyo03("");},12000);
    x = setTimeout(function(){hist03("");},13000);
    
    x = setTimeout(function(){Anyo10("");},16000);
    x = setTimeout(function(){hist10("");},17000);
    
    x = setTimeout(function(){Anyo17("");},20000);
    x = setTimeout(function(){hist17("");},21000);
    
}
// FUNCIONES PARA QUE SE MUESTRO AL PASO DE LOS SEGUNDOS LO QUE QUEREMOS
function titulo(){
    document.getElementById("titulo").innerHTML = "HISTORIA DE LA EMPRESA";
}
function Anyo92(){
    document.getElementById("1992").innerHTML = "1992";
}
function hist92(){
    document.getElementById("hist92").innerHTML = "La familia fundadora Rosales decide emprender una aventura empresarial y nace Chucherias S.L.";
}
function Anyo98(){
    document.getElementById("1998").innerHTML = "1998";
}
function hist98(){
    document.getElementById("hist98").innerHTML = "Nuestro afan por cruzar fronteras nos llevo a ser la primera empresa española en participar en la Feria ISM de Alemania.";
}
function Anyo03(){
    document.getElementById("2003").innerHTML = "2003";
}
function hist03(){
    document.getElementById("hist03").innerHTML = "Fuimos los primeros en fabricar regaliz en continuo.";
}
function Anyo10(){
    document.getElementById("2010").innerHTML = "2010";
}
function hist10(){
    document.getElementById("hist10").innerHTML = "Necesitabamos mas espacio, estamos en pleno crecimiento. Pusimos en marcha un segundo centro productivo.";
}
function Anyo17(){
    document.getElementById("2017").innerHTML = "2017";
}
function hist17(){
    document.getElementById("hist17").innerHTML = "Seguimos creciendo y ampliamos nuestras instalaciones con un centro logistico.";
}
