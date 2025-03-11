public class ControleProduto {

        private int codigo, quantidadeEstoque, quantidadeCompra, opcaoPagamento;
        private String nome, cor;
        private double tamanho, peso, valor;


             public void setCodigo (int codigo_digitado){
                 this.codigo = codigo_digitado;
             }
             public int getCodigo(){
                 return codigo;
             }


             public void setNome (String nome_digitado){
                 this.nome = nome_digitado;
             }
             public String getNome(){
                 return nome;
             }


             public void setTamanho (double tamanho_digitado){
                this.tamanho = tamanho_digitado;
             }
             public double getTamanho(){
                return tamanho;
             }


             public void setPeso (double peso_digitado){
                this.peso = peso_digitado;
             }
             public double getPeso(){
                return peso;
             }


             public void setCor (String cor_digitada){
                this.cor = cor_digitada;
             }
             public String getCor(){
                return cor;
             }


             public void setValor (double valor_digitado){
                this.valor = valor_digitado;
             }
             public double getValor(){
                return valor;
             }


             public void setQuantidadeEstoque (int quantidadeEstoque_digitado){
                this.quantidadeEstoque = quantidadeEstoque_digitado;
             }
             public int getQuantidadeEstoque(){
                return quantidadeEstoque;
             }


             public void setQuantidadeCompra (int quantidadeCompra_digitado){
                 this.quantidadeCompra = quantidadeCompra_digitado;
             }
             public int getQuantidadeCompra(){
                 return quantidadeCompra;
             }


             public void setOpcaoPagamento(int opcaoPagamento_digitado) {
                 this.opcaoPagamento = opcaoPagamento_digitado;
             }
             public int getOpcaoPagamento() {
                 return opcaoPagamento;
             }



        public double definirValor(double valor){
               valor = valor * quantidadeCompra;
               return valor;
        }


        public double atualizarEstoque(int quantidadeEstoque){
               quantidadeEstoque = quantidadeEstoque - quantidadeCompra;
               return quantidadeEstoque;
        }


        //if else com problema de mostrar o valor parcelado
        public double aplicarDesconto(double OpcaoPagamento){

                 if (OpcaoPagamento >= 1 && OpcaoPagamento <= 4){
                     valor = quantidadeCompra - (quantidadeCompra * 0.05);
                     return valor;
                 }else if (OpcaoPagamento == 5){
                     valor = valor / 3;
                     return valor;
                 }else {
                     return valor;
                 }

        }




}
