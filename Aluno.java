package com.mycompany.principal;


public class Aluno {
    private String nome;
    private int idade;
    private int ra;
    private String sexo;
    
    
    public Aluno(){
        this.nome = "";
        this.idade = 0;
        this.ra = 0;
        this.sexo = "";
    }
    
    public Aluno(String pNome, int pIdade, int pRa, String pSexo){
        this.nome = pNome;
        this.idade = pIdade;
        this.ra = pRa;
        this.sexo = pSexo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String x){
        this.nome = x;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setIdade(int x){
        this.idade = x;
    }
    
    public int getRa(){
        return this.ra;
    }
    
    public void setRa(int x){
        this.ra = x;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    
    public void setSexo(String x){
        this.sexo = x;
    }
    
    public void enviarTexto(String x){
        System.out.println(x);
    }
}
