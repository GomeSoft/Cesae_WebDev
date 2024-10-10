//Exercicio 4
let passwords = [1234, 'sara1986', 2023];
let userPassword = prompt('Qual é a pass?');

passwords.push('cesaewd')
console.log(passwords)

if (userPassword == passwords[0]){
    alert('Acertou Miserave!')
} else if (userPassword == passwords[1]){
    alert('Acertou Miserave!')
} else if (userPassword == passwords[2]){
    alert('Acertou Miserave!')
} else if (userPassword == passwords[3]){
    alert('Acertou Miserave!')
} else {
    alert('Errou Miserave!')
}
    
//let safePasses = [passwords.includes.length > 6];
//console.log(safePasses)
for(let i = 0; i <= passwords.length; i++){
    let safePasses = [passwords.includes.length > 2];
    console.log(safePasses)
}
 