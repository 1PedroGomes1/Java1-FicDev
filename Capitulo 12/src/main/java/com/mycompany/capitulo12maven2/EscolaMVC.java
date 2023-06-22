package com.mycompany.capitulo12maven2;

public class EscolaMVC {
    public static void main(String[] args) {
        // Modelo
        Aluno aluno = new Aluno("Fernanda Alves", 25, "CIA223");
        
        //Visao
        AlunoVisao alunoVisao = new AlunoVisao();
        
        //Controle
        AlunoControle alunoControle = new
            AlunoControle(aluno, alunoVisao);
        
        alunoControle.exibirDetalhesAluno();
        
        alunoControle.atualizaDadosAluno("Ana Cruz", 23, "CIB261");
    }
    
}
