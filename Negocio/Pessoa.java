/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

import java.text.NumberFormat;

/**
 *
 * @author Santos
 */
public class Pessoa {
    
    private int matricula;
    private String nome;
    private float peso;
    private float altura;
    private int idade;
    private String esp;
    private char sexo;
    private boolean ass;
    private float valor;
    private int ind;

    public Pessoa(){
        this.ind = 0;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEsp() {
        return esp;
    }

    public void setEsp(String esp) {
        this.esp = esp;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isAss() {
        return ass;
    }

    public void setAss(boolean ass) {
        this.ass = ass;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getInd() {
        return ind;
    }

    public void setInd(int ind) {
        this.ind = ind;
    }
    public float pesoI() {
       float pesoI = 0;
        
       switch (sexo){
           case 'F':
               if (altura > 1.50)
                   pesoI = (float) (62.1 * altura - 44.7);
                   
               else 
                   if (idade >= 35)
                       pesoI = (float) (62.1 * altura - 45);
                   else
                       pesoI = (float) (62.1 * altura - 49);
          break;  
           case 'M':
               if (altura > 1.70)
                   if ( idade <= 20)
                      pesoI = (float) (72.7 * altura - 58);
                   else if (idade> 20 && idade<40)
                      pesoI = (float) (72.7 * altura - 53);  
                   else 
                       pesoI = (float) (72.7 * altura - 45);
                   
               else 
                   if (idade >= 40)
                       pesoI = (float) (72.7 * altura - 50);
                   else
                       pesoI = (float) (72.7 * altura - 58);
         break;
        }
       return pesoI;
    }
    public String situacao() {
       String  sit;
       
       if (peso > pesoI() )
           sit = "Acima do Peso";
       else if (peso < pesoI())
           sit = "Abaixo do Peso ";
       else 
           sit = "Peso Ideal";
       
       
       return sit;
       
   }
  
    public float valorF() {
       float valorF = 0;
       float desc = 0;
       if (situacao().charAt(1) == 'c'){
           valorF = (float) (valor * (0.89/100));
                     valorF += valor;
       }
             else {
                    desc = (float) (valor * (1.22/100)) ;
             valorF = valor - desc; 
   }
        
       return valorF;
   }
   
   /*
   public float valorF() {
      float v = valor;
       if (aval().equalsIgnoreCase("Abaixo do peso")
           || aval().equalsIgnoreCase("Peso Ideal"))
           v -= v + 1.22 ? 100;
   else 
        v += v + 0.89 ? 100;
   return v;   
   }
   */
   
    public String relatorio(){
        String resp = "";
        
        resp+= "\n----------------------------------------------------\n";
        resp += nome + " com a matricula nº " + matricula + '\n';
        resp += "Com o sexo " + (sexo == 'F' ? "Feminino" : "Masculino") + '\n';  // : = senão         ? = se
        resp +=   "Pesando " + 
                NumberFormat.getInstance().format(peso) + 
                  " e com a altura de " + 
                NumberFormat.getInstance().format(altura) + '\n';
        resp += "Com a idade de  " + idade + " anos" + '\n';
        resp += (ass ? "É assíduo" : "Não é assíduo");  // assiduo == true
        resp += "e atentido com a especialidade " + esp + '\n';
        resp +="O cliente está " + situacao();
        resp +=" e seu peso ideal é de: " + 
                NumberFormat.getInstance().format(pesoI()) + '\n' ;
        resp += "O Valor original da consulta era de: " + 
                NumberFormat.getCurrencyInstance().format(valor) + '\n';
        if (valor > valorF())
            resp+=" porém com um desconto de 1,22% o valor a ser pago ficou: " + valorF();
        else 
            resp+=" porém com um acrécimo de 0,89%, o valor a ser pago ficou: " + valorF();          

        return resp;
    }
}
