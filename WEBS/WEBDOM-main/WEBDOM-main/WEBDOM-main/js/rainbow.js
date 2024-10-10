

const colores = ['green', 'orange', 'yellow', 'green', 'blue', 'indigo', 'violet'];

const TrueColors = document.querySelectorAll('span');

TrueColors.forEach((sp, index) => {
    sp.style.color = colores[index]; 
});
