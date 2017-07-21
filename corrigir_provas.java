 import javax.swing.JOptionPane;
 class corrigir_provas {
   static String gab[] = new String[5];
   static String prova[] = new String[5];
   static String nome[] = new String[3];
   static float nota[] = new float[3];
   static String mensagem = "";
   static float soma, media;
   static  int nota_Final, a;
  public static void main(String[]args){
    cadastraGabarito();
    nota_Final = 0;
    soma = 0;
    JOptionPane.showMessageDialog(null,"\nAlunos");
    for(a = 0; a <= 2; a++){
       nome[a] = JOptionPane.showInputDialog("Aluno: " + a +"\nNome ");
      for(int c = 0; c <= 4; c++){
         prova[c] = JOptionPane.showInputDialog("Questão " + c + ":");
         if(prova[c].equals(gab[c])){
            nota_Final = nota_Final + 2;
            nota[a] =  nota_Final;
             }
           }
        nota_Final = 0;
        soma  = soma + nota[a];
        }

    for(a = 0; a <= 2; a++){
       mensagem = mensagem + "\nNome: " + nome[a] + ", Nota: " +  nota[a];
     }
    media = soma / 3;
    JOptionPane.showMessageDialog(null,"\nNota Finais: " + mensagem + "\nA média da turma é: " + media);
    }
    public static void cadastraGabarito(){
        /*
       Cadastro de Gabarito(cada questão valor = 2)
        0 = a
        1 = b
        2 = c
        3 = d
        4 = a
      */
       JOptionPane.showMessageDialog(null, "Cadastro de Gabarito");
      for(int c = 0; c <= 4; c++){
        gab[c] = JOptionPane.showInputDialog("Questão " + c + ":");
       }
     }
   }