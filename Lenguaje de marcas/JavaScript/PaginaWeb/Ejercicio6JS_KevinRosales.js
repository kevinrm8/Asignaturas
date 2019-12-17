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
var historia = 0;

function Mostrar(){
    hisotria++;
   window.alert(""+historia);
    
}

