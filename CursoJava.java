import java.util.Scanner;
class CursoJava {
  public static void main(String[] args) {
    final int tam = 5;
    char[] gabarito ={'a','a','d','b','c'};
    char[] resposta = new char[tam];
    int nota = 0;
    Scanner scan = new Scanner (System.in);
    for(int i = 0; i < tam; i++){
      System.out.printf("informa a resposta %d: ",i);
      resposta[i] = scan.nextLine().charAt(0);
    }
    for(int i = 0; i < tam; i++){
      if(resposta[i] == gabarito[i]){
        nota++;
      }
    }
    System.out.printf("%nNota do aluno: %d ",nota);
  }
}
