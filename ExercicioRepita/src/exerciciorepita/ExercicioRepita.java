/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;
import javax.swing.JOptionPane;
/**
 *
 * @author buziq
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, s=0, total=0, vPar=0, vImpar=0, nCem=0, media=0, soma=0;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "<html>Informe um número: <br><em>(O valor 0 interrompe)</em></html>"));
            
        if(n!=0){
            soma +=n;
        
        
        total++;
            
        if(n%2==0){
                vPar++;
            }else{
                vImpar++;
            }
        if(n>100){
            nCem++;
        }
        media=soma/total;
        }
        s+=n;
        }while(n!=0);
        JOptionPane.showMessageDialog(null,
                "<html>Resultado:<hr>"
                +"<br>Total de Valores "+total
                +"<br>Total de Pares "+vPar
                +"<br>Total de Impares "+vImpar
                +"<br>Total acima de cem "+nCem
                +"<br>Media dos valores "+media
                +"<br>Soma total dos valores" +soma
                +"<br><br>Resultado Final:<hr>" +
                        "<br><em>Somatorio vale = </em> "+s);
    }
    
}
