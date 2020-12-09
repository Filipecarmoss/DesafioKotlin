package br.com.desafioFilipeDoCarmoSilva

class ProfessorTitular(
    nome: String,
    sobreNome: String,
    tempoDeCasa: Int = 0,
    codigoDeProfessor: Int,
    val especialidade: String


    ) : Professor(nome,sobreNome,tempoDeCasa,codigoDeProfessor){
}