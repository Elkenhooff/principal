package com.mycompany.principal;

public class Principal {

    public static void main(String[] args) {
        Aluno objetoAluno = new Aluno();
        //objetoAluno.enviarTexto("Testando");
        
        objetoAluno.setNome("Pedro");
        objetoAluno.setIdade(19);
        objetoAluno.setRa(391863923);
        objetoAluno.setSexo("Masculino");
        
        System.out.println("Nome: " + objetoAluno.getNome());
        System.out.println("Idade: " + objetoAluno.getIdade());
        System.out.println("Ra: " + objetoAluno.getRa());
        System.out.println("Sexo: " + objetoAluno.getSexo());
        
        objetoAluno.enviarTexto("\nIsso é um método.");
    }
}
