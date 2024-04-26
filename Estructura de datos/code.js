// let figura = prompt("¿Qué figura deseas calcular? (cuadrado, triángulo, círculo)");

// if (figura === "cuadrado") {
//   let ladoCuadrado = parseFloat(prompt("Ingresa la longitud del lado del cuadrado:"));
//   let areaCuadrado = ladoCuadrado * ladoCuadrado;
//   alert(`El área del cuadrado es: ${areaCuadrado}`);
// } else if (figura === "triangulo") {
//   let baseTriangulo = parseFloat(prompt("Ingresa la base del triángulo:"));
//   let alturaTriangulo = parseFloat(prompt("Ingresa la altura del triángulo:"));
//   let areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
//   alert(`El área del triángulo es: ${areaTriangulo}`);
// } else if (figura === "circulo") {
//   let radioCirculo = parseFloat(prompt("Ingresa el radio del círculo:"));
//   let areaCirculo = Math.PI * radioCirculo * radioCirculo;
//   alert(`El área del círculo es: ${areaCirculo}`);
// } else {
//   alert("Figura no reconocida");
// }



//Ejercicio 2

// let num1 = parseFloat(prompt("Ingresa el primer número:"));
// let num2 = parseFloat(prompt("Ingresa el segundo número:"));

// if (num1 > num2) {
//   alert(`El primer número (${num1}) es mayor que el segundo número (${num2}).`);
// } else if (num2 > num1) {
//   alert(`El segundo número (${num2}) es mayor que el primer número (${num1}).`);
// } else {
//   alert("Los números son iguales.");
// }

//ejercicio 3

// let numero = parseInt(prompt("Ingresa un número:"));

// if (numero % 2 === 0) {
//   alert(`${numero} es un número par.`);
// } else {
//   alert(`${numero} es un número impar.`);
// }

// let num1 = parseFloat(prompt("Ingresa el primer número:"));
// let num2 = parseFloat(prompt("Ingresa el segundo número:"));
// let operacion = prompt("Ingresa la operación a realizar (+, -, *, /):");

// if (operacion === "+") {
//   alert(`La suma es: ${num1 + num2}`);
// } else if (operacion === "-") {
//   alert(`La resta es: ${num1 - num2}`);
// } else if (operacion === "*") {
//   alert(`La multiplicación es: ${num1 * num2}`);
// } else if (operacion === "/") {
//   if (num2 !== 0) {
//     alert(`La división es: ${num1 / num2}`);
//   } else {
//     alert("No es posible dividir entre cero.");
//   }
// } else {
//   alert("Operación no valida.");
// }


// let numero = parseFloat(prompt("Ingresa un número:"));

// if (numero > 0) {
//   alert(`${numero} es un número positivo.`);
// } else if (numero < 0) {
//   alert(`${numero} es un número negativo.`);
// } else {
//  alert("El número es cero.");
// }

// let numero = prompt("Ingresa un número:");
// let suma = 0;

// for (let i = 0; i < numero.length; i++) {
//   suma += parseInt(numero[i]);
// }

// alert(`La suma de los dígitos de ${numero} es: ${suma}`);


// for (let i = 10; i >= 1; i--) {
//     alert(i);
//   }

// for (let i = 1; i <= 10; i++) {
//     alert(`Tabla del ${i}:`);
//     for (let j = 1; j <= 10; j++) {
//       alert(`${i} x ${j} = ${i * j}`);
//     }
//     alert('\n');
//   }

// const calificacion = parseFloat(prompt("Ingresa tu calificación:")); 
// const totalAsistencias = parseInt(prompt("Ingresa el total de asistencias:")); 

// const porcentajeAsistencias = (totalAsistencias / 100) * 100; 

// if (calificacion >= 6.0 && porcentajeAsistencias >= 80) {
//   alert("¡Aprobado!"); 
// } else {
//   alert("Reprobado"); 
// }


// const monto = 120; 

// let descuento;

// if (monto > 100) {
//   descuento = monto * 0.1; 
// } else {
//   descuento = monto * 0.02; 
// }

// alert(`El descuento aplicado es: ${descuento}`);


const numero1 = parseFloat(prompt("Ingresa el primer número:"));
const numero2 = parseFloat(prompt("Ingresa el segundo número:"));

if (numero1 > numero2) {
  const suma = numero1 + numero2;
  alert(`La suma de los números es: ${suma}`);
} else if (numero2 > numero1) {
  const cuadradoNumero1 = numero1 ** 2;
  const cuadradoNumero2 = numero2 ** 2;
  const sumaCuadrados = cuadradoNumero1 + cuadradoNumero2;
  alert(`La suma de los cuadrados es: ${sumaCuadrados}`);
} else {
  alert("Los números son iguales");
}
