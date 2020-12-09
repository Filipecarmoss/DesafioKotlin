package br.com.desafioFilipeDoCarmoSilva

open class Professor(val nome: String, val sobreNome: String, val tempoDeCasa: Int, val codigoDeProfessor:Int){
    override fun toString(): String {
        return "Professor(nome=$nome, sobreNome=$sobreNome, tempoDeCasa=$tempoDeCasa, codigoDoProfessor=$codigoDeProfessor)"
    }

}