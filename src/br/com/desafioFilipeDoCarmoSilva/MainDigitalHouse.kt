package br.com.desafioFilipeDoCarmoSilva

fun main() {

        val sistemaDigital = DigitalHouseManager()


        sistemaDigital.registrarCurso("UX/UI", 230511,20)
        sistemaDigital.registrarCurso("Desenvolvimento Android", 55635,53)
        sistemaDigital.registrarCurso("Financeiro", 3,15)


        sistemaDigital.excluirCurso(3)



        sistemaDigital.registrarProfessorTitular("Filipe", "Carmo", 23, "UX")
        sistemaDigital.registrarProfessorTitular("Alexandre", "Freitas", 35, "Contabilidade")


        sistemaDigital.excluirProfessor(23)


        sistemaDigital.registrarProfessorAdjunto("Pedro", "Silva", 1, 10.3)
        sistemaDigital.registrarProfessorAdjunto("João", "Pedro", 2, 40.0)
        sistemaDigital.registrarProfessorAdjunto("Juliana", "Menezes", 3, 10.3)
        sistemaDigital.registrarProfessorAdjunto("Caio", "Nobegra", 4, 10.3)



        sistemaDigital.excluirProfessor(35)


        sistemaDigital.matriculaAluno("Juan", "Caetano",123)
        sistemaDigital.matriculaAluno("Vinicius", "Lucas",456)
        sistemaDigital.matriculaAluno("Luana", "Silva",789)
        sistemaDigital.matriculaAluno("Felipe", "Souza",1011)
        sistemaDigital.matriculaAluno("Paula", "Gois",5858)


        sistemaDigital.matricularAlunoNoCurso(123,55635)
        sistemaDigital.matricularAlunoNoCurso(456,55635)
        sistemaDigital.matricularAlunoNoCurso(789,3)
        sistemaDigital.matricularAlunoNoCurso(1011,3)
        sistemaDigital.matricularAlunoNoCurso(5858,230511)


        sistemaDigital.alocarProfessor(3,1,35)
        sistemaDigital.alocarProfessor(230511,2,23)




        println(sistemaDigital.listaDeCurso[230511])
        println(sistemaDigital.listaDeProfessorTitular)
        println(sistemaDigital.listaDeProfessorAdjunto)
        println(sistemaDigital.listaDeAlunos)
        println(sistemaDigital.listaDeCurso)
        println(sistemaDigital.listaDeCurso[1])
        println(sistemaDigital.listaDeCurso[1]?.listaDeAlunosMatriculados)
        println("________________")
        println(sistemaDigital)

    }