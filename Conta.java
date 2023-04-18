public class Conta{
        
        public int agencia;
        public int conta;
        public float saldo;
        
       public  Conta(int conta, int agencia, float saldo){
            this.conta = conta;
            this.agencia = agencia;
            this.saldo = saldo;
          
        }
        
        public void depositar(float valor){
            this.saldo = this.saldo + valor;
            System.out.println("saldo  atual: " + this.saldo);
        }
        
        public void sacar(float valor){
            if(valor > this.saldo){
                System.out.println("saldo indisponivel");
                return;
            }
            
            this.saldo = this.saldo - valor;
            System.out.println("saldo  atual: " + this.saldo);
        }
       
}
