

let imagem= true; 


const changeoption=()=>{
    
    const egg= document.querySelector("img")

    imagem= !imagem;

    if(imagem){
        egg.setAttribute('src',"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSQ9Khbo15LlH7wTKTwZ2Eh7iJ9AcxC-RKxHg&s")
    }
    

    else{
        egg.setAttribute('src', "https://devsprouthosting.com/images/egg.jpg")
    }



    return egg

    
    

}