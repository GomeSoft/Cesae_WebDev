
//Exercicio 5

const studentGrades = [
    {
        'studentName': 'Rita',
        'grade': 16,
        nameAndGrade(){
            return `A ${this.studentName} tem nota ${this.grade}`;
        }

    },
    {
        studentName: 'Luís',
        grade: 20,
    },
    {
        studentName: 'João',
        grade: 18,
    },
    {
        studentName: 'André',
        grade: 15,
    },
    {
        studentName: 'Luísa',
        grade: 19,
    },
]

studentGrades. forEach(function(student){
    (nameAndGrade(student.studentName, student.grade))
})
function nameAndGrade(aluno, nota){
    console.log(`A nota de ${aluno} é ${nota}`)
}

