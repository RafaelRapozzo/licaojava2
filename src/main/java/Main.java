public class Main {
   public static void main(String[] args) {
     Professor prof1 = new Professor("Jose");
     prof1.setPCPF(1234567574);
     Aluno al1 = new Aluno("Luizinho");
     al1.setACPF(1234567890);
     System.out.println(al1.getNome());
     System.out.println("CPF: " + al1.getACPF());
     System.out.println(prof1.getNome());
     System.out.println("CPF: " + prof1.getPCPF());
   }
}
