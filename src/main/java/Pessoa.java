public class Pessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getACPF() {
        return ACPF;
    }

    public void setACPF(int ACPF) {
        this.ACPF = ACPF;
    }

    private int ACPF;

    public Pessoa(String nome){
        this.nome = nome;
    }
    public Pessoa(int ACPF){
         this.ACPF = ACPF;
    }

    public int getPCPF() {
        return PCPF;
    }

    public void setPCPF(int PCPF) {
        this.PCPF = PCPF;
    }

    private int PCPF;
}
