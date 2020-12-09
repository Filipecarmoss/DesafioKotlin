package br.com.desafioFilipeDoCarmoSilva

class ProfessorAdjunto(
    nome: String,
    sobreNome: String,
    tempoDeCasa: Int =0,
    codigoDeProfessor: Int,
    val quantidadesDeHorasMentorias: Double
) :Professor(nome,sobreNome,tempoDeCasa,codigoDeProfessor) {
}