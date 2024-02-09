const oculto = document.querySelector("#texto-oculto"); 
let texto = document.querySelector("#mensaje"); //Guardo el texto del mensaje
let textoEncriptado = document.querySelector("#mensaje-encriptado");
let tipoMensaje = document.querySelector("#tipomensaje"); 
let aviso = document.querySelector("#aviso");

function validarMensaje() {
  let regex = /^[a-z 0-9]+$/; // Expresión regular para verificar que solo hay letras minúsculas y numeros
  if (!regex.test(texto.value)) { //Si la validacion del texto no contiene minusculas devuelve False,  
    aviso.classList.remove("oculto");
    aviso.innerHTML='<span class="material-symbols-outlined">error</span>Ingrese un texto en minusculas y sin acentos';
  } else {
    aviso.classList.add("oculto");
    return texto.value;
  }
}

function encriptar() {
  let mensaje = validarMensaje();
  if (!mensaje){
    mensaje=null;
  } else {
  /*Reemplazamos caracteres por los valores requeridos*/
  let mensajeEncriptado = mensaje 
      .replaceAll("e", "enter")
      .replaceAll("i", "imes")
      .replaceAll("a", "ai")
      .replaceAll("o", "ober")
      .replaceAll("u", "ufat");
  oculto.classList.remove("oculto");
  tipoMensaje.innerText = "Mensaje Encriptado";
  textoEncriptado.value = mensajeEncriptado;
  }
}

function desencriptar() {
  let mensaje = validarMensaje();
  if (!mensaje){
    mensaje=null;
  } else {
  /*Reemplazamos los valores por caracteres*/
  let mensajeOriginal = mensaje
      .replaceAll("enter", "e")
      .replaceAll("imes", "i")
      .replaceAll("ai", "a")
      .replaceAll("ober", "o")
      .replaceAll("ufat", "u");
  oculto.classList.remove("oculto");
  tipoMensaje.innerText = "Mensaje Desencriptado";
  textoEncriptado.value = mensajeOriginal;
  }
}

function limpiar() {
  texto.value = "";
  textoEncriptado.value = "";
  oculto.classList.add("oculto");
  aviso.classList.add("oculto");
}

function copiar(){
  textoEncriptado.select();
  textoEncriptado.setSelectionRange(0, 99999);
  navigator.clipboard.writeText(textoEncriptado.value);
}