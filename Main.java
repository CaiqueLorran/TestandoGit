
import javax.swing.JOptionPane;
public class Main{
  public static void main(String[] args){
  
    String answer = " ";
    while(true){
      answer = JOptionPane.showInputDialog("Dessa vez eh serio, vamos voltar com tudo! Entedeu?");
      if(answer.equals("Entendi")){
        JOptionPane.showMessageDialog(null, "Que bom garoto, vamos la! Sem desistir!");
         break;
      }else{
        JOptionPane.showMessageDialog(null,"Vagabundo, por isso ta lascado! Volta e responde direito");
      }
      
    }
   
  }
}