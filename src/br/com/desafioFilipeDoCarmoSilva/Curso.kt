package br.com.desafioFilipeDoCarmoSilva

class Curso(

    val nome: String,
    val codigoDoCurso: Int,
    val quantidadeMaximaDeAlunos: Int,
    var professorTitular: ProfessorTitular? = ProfessorTitular("","",0,0,""),
    var professorAdjunto: ProfessorAdjunto? = ProfessorAdjunto("","",0,0,0.0)


) {
    val listaDeAlunosMatriculados = mutableListOf<Aluno>()

    fun adicionarUmAluno( umAluno: Aluno): Boolean{
        if (listaDeAlunosMatriculados.size <quantidadeMaximaDeAlunos){
            listaDeAlunosMatriculados.add(umAluno)
            return true
        }else return false
    }
    fun excluirAluno(umAluno: Aluno){
        listaDeAlunosMatriculados.remove(umAluno)
    }

    override fun toString(): String {
        return "Curso(nome='$nome', codigoDocurso=$codigoDoCurso,quantidadeMaximaDeAlunos=$quantidadeMaximaDeAlunos," +
                "professorTitular=$professorTitular, professorAdjunto=$professorAdjunto, ListadeAlunosMatriculados=$listaDeAlunosMatriculados"
    }

}