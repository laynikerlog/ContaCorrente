class ContaCorrente {
    private String titular;
    private double saldo;

    public ContaCorrente(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de R$ " + valor + " realizado com sucesso.");
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        } else {
            System.out.println("Valor inválido para saque.");
        }
    }

    public void transferir(ContaCorrente destino, double valor) {
        if (valor > 0) {
            if (valor <= saldo) {
                saldo -= valor;
                destino.depositar(valor);
                System.out.println(
                        "Transferência de R$ " + valor + " realizada com sucesso para " + destino.titular + ".");
            } else {
                System.out.println("Saldo insuficiente para transferência.");
            }
        } else {
            System.out.println("Valor inválido para transferência.");
        }
    }
}
