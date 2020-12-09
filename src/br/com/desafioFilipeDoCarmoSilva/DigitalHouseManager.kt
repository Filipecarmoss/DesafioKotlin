package br.com.desafioFilipeDoCarmoSilva

class DigitalHouseManager() {
    var listaDeAlunos = mutableMapOf<Any?, Aluno>()
    var listaDeProfessorTitular = mutableMapOf<Any?,ProfessorTitular>()
    var listaDeProfessorAdjunto = mutableMapOf<Any?,ProfessorAdjunto>()
    var listaDeCurso = mutableMapOf<Any?,Curso>()
    var listaDeMatricula= mutableMapOf<Any?,Matricula>()

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int){
        listaDeCurso.put(
            codigoCurso, Curso(
                nome= nome,
                codigoDoCurso = codigoCurso,
                quantidadeMaximaDeAlunos= quantidadeMaximaDeAlunos


            )
        )

    }
    fun excluirCurso(codigoCurso: Int){
        listaDeCurso.remove(codigoCurso)
    }
    fun registrarProfessorAdjunto(nome: String, sobreNome:String, codigoProfessor:Int, quantidadeDeHoras: Double){
        listaDeProfessorAdjunto.put(
            codigoProfessor, ProfessorAdjunto( nome = nome,sobreNome=sobreNome,codigoDeProfessor=codigoProfessor,quantidadesDeHorasMentorias = quantidadeDeHoras


            )
        )

    }
    fun registrarProfessorTitular( nome: String, sobreNome:String,codigoProfessor: Int, especialidade:String){
        listaDeProfessorTitular.put(
            codigoProfessor,
            ProfessorTitular(nome=nome,sobreNome=sobreNome,codigoDeProfessor= codigoProfessor,especialidade=especialidade)
        )

    }
    fun excluirProfessor(codigoProfessor: Int){
        listaDeProfessorTitular.remove(codigoProfessor)
        listaDeProfessorAdjunto.remove(codigoProfessor)
    }
    fun matriculaAluno(nome:String, sobreNome:String,codigoAluno: Int){
        listaDeAlunos.put(codigoAluno, Aluno(nome=nome,sobreNome=sobreNome,codigoDeAluno= codigoAluno)
        )
    }
    fun matricularAlunoNoCurso(codigoAluno: Int,codigoCurso: Int){
        var alunoASerMatriculado=listaDeAlunos[codigoAluno]
        if (listaDeCurso[codigoCurso]?.listaDeAlunosMatriculados!!.size>=listaDeCurso[codigoCurso]?.quantidadeMaximaDeAlunos!!){
            println("Impossível matricular(o),${listaDeAlunos[codigoAluno]?.nome} no curso pois já se esgotou a vaga disponível do curso = '[, vagas disponível ${listaDeCurso[codigoCurso]?.quantidadeMaximaDeAlunos}")

        }else{listaDeCurso[codigoCurso]?.adicionarUmAluno(alunoASerMatriculado!!)
            println("Matricula feita com sucesso, referente ao aluno:${listaDeAlunos[codigoAluno]?.nome}")

        }

    }
    fun alocarProfessor(codigoCurso: Int,codigoProfessorAdjunto: Int,codigoProfessorTitular: Int){
        var professorTitular: ProfessorTitular? = listaDeProfessorTitular[codigoProfessorTitular]
        var professorAdjunto: ProfessorAdjunto?= listaDeProfessorAdjunto[codigoProfessorAdjunto]
        listaDeCurso[codigoCurso]?.professorTitular= professorTitular
        listaDeCurso[codigoCurso]?.professorAdjunto=professorAdjunto

    }
}