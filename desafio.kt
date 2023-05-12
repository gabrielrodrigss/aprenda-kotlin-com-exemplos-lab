// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int)

data class Formacao(
    val nome: String,
    var conteudos: List<ConteudoEducacional>,
    var nivel: Nivel,
) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }

    fun exibirFormacaoEInscritos() {
        println("Formação: $nome")
        println("Lista de usuário escritos")
        for (usuario in inscritos) {
            println("- ${usuario.nome}")
        }
    }


}

fun main() {
//    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")

    val conteudo1 = ConteudoEducacional("Introdução a pensamento computacional", 60)
    val conteudo2 = ConteudoEducacional("Lígica de programção", 80)
    val conteudo3 = ConteudoEducacional("Desiggner de sistemas", 70)

    val formacao1 = Formacao("Desenvolvedor python", listOf(conteudo1, conteudo2, conteudo3), Nivel.BASICO)

    val usuario1 = Usuario("Gabriel")
    val usuario2 = Usuario("Joel")
    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)
    formacao1.exibirFormacaoEInscritos()
    println(formacao1)

    val conteudo4 = ConteudoEducacional("Introdução a frameworks", 60)
    val conteudo5 = ConteudoEducacional("Paradigmas da linguagem Java Script", 80)
    val conteudo6 = ConteudoEducacional("HTML e REACT", 70)

    val formacao2 = Formacao("Desenvolvedor python", listOf(conteudo4, conteudo5, conteudo6), Nivel.INTERMEDIARIO)

    val usuario3 = Usuario("Gabriel")
    val usuario4 = Usuario("Joel")
    formacao2.matricular(usuario3)
    formacao2.matricular(usuario4)
    formacao2.exibirFormacaoEInscritos()
    println(formacao2)
    
}
