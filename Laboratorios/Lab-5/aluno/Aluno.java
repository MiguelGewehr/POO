package aluno;

import java.time.LocalDate;

public class Aluno{

    private String id;
    private String nome;
    private float cr;
    private LocalDate dataNascimento;
    private float rendaSalarial;

    public Aluno(String id, String nome, float cr, LocalDate dataNascimento, float rendaSalarial){
        
        this.id = id;
        this.nome = nome;
        this.cr = cr;
        this.dataNascimento = dataNascimento;
        this.rendaSalarial = rendaSalarial;
    }
    
    public String getId() {
        return id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public float getCr() {
        return cr;
    }
    
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    
    public float getRendaSalarial() {
        return rendaSalarial;
    }
}