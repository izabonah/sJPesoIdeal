/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia;

import Negocio.Pessoa;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Santos
 */
    public class Pessoas {
    private List <Pessoa> pessoa = new ArrayList <>(); // Vetor Dinamico  

    public Pessoa getPessoa(int posi) {//Ler a posição de uma determinada pessoa
        return this.pessoa.get(posi);
    }

    public void setPessoa(Pessoa pessoa, char op) {
        int posi = pesquisa(pessoa.getMatricula());
        switch(op){
            case 'I':  this.pessoa.add(pessoa); // incluir os dados de uma pessoa
                break;
            case 'A': this.pessoa.set(posi, pessoa);//alterar os dados de uma pessoa
                break;
            case 'E': this.pessoa.remove(posi); // excluir os dados de uma pessoa
        }
    }
    public int getTotal(){//total de posiÇões cadastradas
        return this.pessoa.size();
        
    }
 
    public float percent(){
        int contaM = 0;
      
        for (int i=0;i<getTotal();i++){
            if (getPessoa(i).getSexo() == 'M')
              contaM++;
        }
      return((contaM * 100) /getTotal()  );
    }
  
    /*
    public float percente (char car) {
    int total = sexoFM(car);    [contaM = quantosHM]
    return  (getTotal() > 0 ? (float) total/getTotal() * 100  : 0);
    }
    */
  
  
    public float quantosHM(char sexo){
        int quantH = 0;
      
        for (int i=0;i<getTotal();i++){
            if (getPessoa(i).getSexo() == sexo)
                quantH++;
        }
    return(quantH);
    }

    public float totA(){
        float totA = 0;
      
        for(int i=0;i<getTotal();i++){
            totA+=getPessoa(i).valorF();
          
        }
 
    return totA;
    }
  
  public int pesquisa (int matricula) {
        int posi = 0;
        boolean achou = false;
        
        while (posi < getTotal() && !achou) //!achou = (achou == false)
            if (getPessoa(posi).getMatricula() == matricula)
                achou = true;
            else 
                posi++;
    return posi; //retorna a posição
    }
  
    public int[] MaisMenosGordo(){//devolve a posição do mais magro e do mais gordo
        float[] peso = new float[getTotal()];
        int[] posi = new int[getTotal()];
        float auxPeso;
        int auxPosi;
        int[] pMG = new int [2]; // primeira e a ultima válida

        // carrega o peso da pessoa e a sua posição no vetor de pessoas
        // for (int i=0;i<getTotal();posi[i++] = i) *errado*
        for (int i = 0; i < getTotal(); posi[i] = i++) {
        //posi[i] = i;      
            peso[i] = getPessoa(i).getPeso();
    }
    
        for (int i=0;i<getTotal()-1;i++)//percorre até a penultuma posição válida
            for (int j=(i+1);j<getTotal();j++)// percorre a posição seguinte até a ultima
                if (peso[i]>peso[j]) {//compara a posição atual com a proxima selecionada,se for valida
                    auxPeso = peso[i];
                    peso[i] = peso[j];
                    peso[j]= auxPeso;
                    auxPosi = posi[i];
                    posi[i] = posi[j];
                    posi[j]= auxPosi;
                }
    pMG[0] = posi[0];
    pMG[1] = posi[getTotal() -1];
      
    return (pMG);   
    }
  
  
    public String relatorioG(){
        String resp="";
        int[]pMG = MaisMenosGordo();

        for(int i = 0;i < getTotal();i++){
            resp+= getPessoa(i).relatorio();
        }
        if(getTotal() > 0){
        resp+= "\n________________________________________________\n";
        resp += "O total de homens atentidos foram: " + (quantosHM('M')) + '\n'; 
        resp += "O total de mulheres atentidas foram: " + (quantosHM('F')) + '\n';
        resp += "O Percentual de homens atendidos é: " + NumberFormat.getPercentInstance().format(percent()) +  '\n';
        resp += "O Percentual de mulheres atendidas é: " + NumberFormat.getPercentInstance().format((100 - percent())) + '\n';
        resp += "Valor total arrecadado é de: " + NumberFormat.getCurrencyInstance().format(totA());
        resp += "\n____________________________\n";
        resp += "A pessoa mais magra é o(a) " + getPessoa(pMG[0]).relatorio();
        resp += "\n____________________________\n";
        resp += "A pessoa mais gorda é o(a) " + getPessoa(pMG[1]).relatorio();
        }
        
    return (!resp.isEmpty() ? resp : "Inexistencia de pessoas");
    }
}   

