/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

public class BeanRmrCompras {

    private int rmr_id_compra;
    private int rmr_id_fornecedor;
    private String rmr_data_compra;
    private double rmr_valor_total;
    private String rmr_forma_pagamento;
    private String rmr_status_compra;
    private String rmr_observacao;

    public int getRmr_id_compra() {
        return rmr_id_compra;
    }

    public void setRmr_id_compra(int rmr_id_compra) {
       this.rmr_id_compra = rmr_id_compra;
    }

    public int getRmr_id_fornecedor() {
        return rmr_id_fornecedor;
    }

    public void setRmr_id_fornecedor(int rmr_id_fornecedor) {
        this.rmr_id_fornecedor = rmr_id_fornecedor;
    }

    public String getRmr_data_compra() {
        return rmr_data_compra;
    }

    public void setRmr_data_compra(String rmr_data_compra) {
        this.rmr_data_compra = rmr_data_compra;
    }

    public double getRmr_valor_total() {
        return rmr_valor_total;
    }

    public void setRmr_valor_total(double rmr_valor_total) {
        this.rmr_valor_total = rmr_valor_total;
    }

    public String getRmr_forma_pagamento() {
        return rmr_forma_pagamento;
    }

    public void setRmr_forma_pagamento(String rmr_forma_pagamento) {
        this.rmr_forma_pagamento = rmr_forma_pagamento;
    }

    public String getRmr_status_compra() {
        return rmr_status_compra;
    }

    public void setRmr_status_compra(String rmr_status_compra) {
        this.rmr_status_compra = rmr_status_compra;
    }

    public String getRmr_observacao() {
        return rmr_observacao;
    }

    public void setRmr_observacao(String rmr_observacao) {
        this.rmr_observacao = rmr_observacao;
    }
}
