package teste;

import bean.BeanRmrCadastro;
import bean.BeanRmrClientes;
import bean.BeanRmrCompras;
import bean.BeanRmrComprasProdutos;
import bean.BeanRmrFornecedor;
import bean.BeanRmrProdutos;
import bean.BeanRmrUsuarios1;
import bean.BeanRmrVendas;
import bean.BeanRmrVendaProdutos;

import dao.DaoRmrCadastro;
import dao.DaoRmrClientes;
import dao.DaoRmrCompras;
import dao.DaoRmrCompras_produtos;
import dao.DaoRmrFornecedor;
import dao.DaoRmrProdutos;
import dao.DaoRmrUsuarios;
import dao.DaoRmrVendas;
import dao.DaoRmrVendas_Produtos;

public class JdbcCrud {

    public static void main(String[] args) {

        BeanRmrClientes cliente =
                new BeanRmrClientes();

        cliente.setRmr_nome("Carlos Eduardo");
        cliente.setRmr_telefone("(44)99999-1111");
        cliente.setRmr_email("carlos@gmail.com");
        cliente.setRmr_endereco("Rua das Flores");
        cliente.setRmr_numero("250");
        cliente.setRmr_bairro("Centro");
        cliente.setRmr_cidade("Cianorte");
        cliente.setRmr_estado("PR");
        cliente.setRmr_cep("87200000");
        cliente.setRmr_cpf("123.456.789-00");
        cliente.setRmr_data_nascimento("2005-03-15");
        cliente.setRmr_genero("Masculino");
        cliente.setRmr_data_cadastro("2026-05-11 10:00:00");
        cliente.setRmr_status("A");

        DaoRmrClientes daoCliente =
                new DaoRmrClientes();

        daoCliente.insert(cliente);



        BeanRmrFornecedor fornecedor =
                new BeanRmrFornecedor();

        fornecedor.setRmr_nome("Fornecedor Alpha");
        fornecedor.setRmr_telefone("(44)98888-2222");
        fornecedor.setRmr_email("alpha@gmail.com");
        fornecedor.setRmr_endereco("Av. Paraná");
        fornecedor.setRmr_cnpj("11.222.333/0001-44");
        fornecedor.setRmr_status("A");
        fornecedor.setRmr_inscricao_estadual("987654");
        fornecedor.setRmr_inscricao_municipal("456789");
        fornecedor.setRmr_tipo_fornecedor("Eletrônicos");
        fornecedor.setRmr_limite_credito(15000);
        fornecedor.setRmr_condicao_pagamento("30 dias");
        fornecedor.setRmr_banco("Banco do Brasil");
        fornecedor.setRmr_agencia("1234");
        fornecedor.setRmr_conta("98765-0");
        fornecedor.setRmr_fornecedorcol("Teste");

        DaoRmrFornecedor daoFornecedor =
                new DaoRmrFornecedor();

        daoFornecedor.insert(fornecedor);



        BeanRmrProdutos produto =
                new BeanRmrProdutos();

        produto.setRmr_nome("Notebook Gamer");
        produto.setRmr_preco(4500.00);
        produto.setRmr_marca("Dell");
        produto.setRmr_categoria("Informática");
        produto.setRmr_descricao("Notebook Dell RTX");
        produto.setRmr_data_cadastro("2026-05-11 11:00:00");

        DaoRmrProdutos daoProduto =
                new DaoRmrProdutos();

        daoProduto.insert(produto);



        BeanRmrUsuarios1 usuario =
                new BeanRmrUsuarios1();

        usuario.setRmr_id_usuarios(9);
        usuario.setRmr_nomel("Rafael Roa");
        usuario.setRmr_apelido("Roa");
        usuario.setRmr_cpf("999.888.777-66");
        usuario.setRmr_dataNascimento("2008-01-01");
        usuario.setRmr_nivel(1);
        usuario.setRmr_senha("123");
        usuario.setRmr_ativo("S");

        DaoRmrUsuarios daoUsuario =
                new DaoRmrUsuarios();

        daoUsuario.insert(usuario);



        BeanRmrVendas venda =
                new BeanRmrVendas();

        venda.setRmr_id_cliente(1);
        venda.setRmr_data_venda("2026-05-11 12:00:00");
        venda.setRmr_valor_total(5000.00);
        venda.setRmr_forma_pagamento("PIX");
        venda.setRmr_status_venda("Finalizada");
        venda.setRmr_observacao("Venda notebook");

        DaoRmrVendas daoVenda =
                new DaoRmrVendas();

        daoVenda.insert(venda);



        BeanRmrCompras compra =
                new BeanRmrCompras();

        compra.setRmr_id_fornecedor(1);
        compra.setRmr_data_compra("2026-05-11 13:00:00");
        compra.setRmr_valor_total(12000.00);
        compra.setRmr_forma_pagamento("Boleto");
        compra.setRmr_status_compra("Paga");
        compra.setRmr_observacao("Compra estoque");

        DaoRmrCompras daoCompra =
                new DaoRmrCompras();

        daoCompra.insert(compra);



        BeanRmrComprasProdutos compraProdutos =
                new BeanRmrComprasProdutos();

        compraProdutos.setRmr_id_compra(2);
        compraProdutos.setRmr_id_produto(2);
        compraProdutos.setRmr_quantidade(8);
        compraProdutos.setRmr_preco_custo(75.50);
        compraProdutos.setRmr_subtotal(604.00);
        compraProdutos.setRmr_data_entrada("2026-05-11 14:30:00");

        DaoRmrCompras_produtos daoCompraProdutos =
                new DaoRmrCompras_produtos();

        daoCompraProdutos.insert(compraProdutos);



        BeanRmrVendaProdutos vendaProdutos =
                new BeanRmrVendaProdutos();

        vendaProdutos.setRmr_id_venda(2);
        vendaProdutos.setRmr_id_produto(2);
        vendaProdutos.setRmr_quantidade(3);
        vendaProdutos.setRmr_preco_unitario(199.90);
        vendaProdutos.setRmr_subtotal(599.70);
        vendaProdutos.setRmr_desconto(20.00);

        DaoRmrVendas_Produtos daoVendaProdutos =
                new DaoRmrVendas_Produtos();

        daoVendaProdutos.insert(vendaProdutos);



        BeanRmrCadastro cadastro =
                new BeanRmrCadastro();

        cadastro.setUsuario("Roa");
        cadastro.setFornecedor("Fornecedor Alpha");
        cadastro.setLicencas("Licença Premium");
        cadastro.setClientes("Carlos Eduardo");

        DaoRmrCadastro daoCadastro =
                new DaoRmrCadastro();

        daoCadastro.insert(cadastro);

        System.out.println("Funcionando!");

    }
}