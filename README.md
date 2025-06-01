# Integrantes
Edson Leonardo - 553737
Eduardo Mazelli - 553236
Nathan Uflacker - 553264

# Problema e Solução:
As queimadas afetam áreas regiões, estados e municípios, por isso pensamos em criar uma API que pode fazer 2 coisas principais:
1- Mostrar os dados de incêndios recentes para quesitos de relatorio;
2- Coletar dados simples de incêndios que estão a ocorrer e assim podendo assim ser usado pelos bombeiros para controle.

# Arquitetura:
Usando do método restful criamos um código que consiste de 6 pacotes:
-Config: Usado para classes de configuração básica da API;
-Controllers: Usado para classes que controlaram a interação com o usuário;
-Entities: Pacote usado para as classes objetos da API;
-Repositories: Cuida das relações transacionais do código com o banco de dados;
-Security: Toda a estrutura de segurança e autenticação da API;
-Services: A parte que cuida de gerar os métodos usados pela API para busca e criação de dados no banco.

# Instruções:
- Ter o Java baixado no pc;
- Fazer o download da branch master;
- Usar a IDE InteliJ;
- Entrar no código e clicar o botão de play no topo do direito do InteliJ;
- Observar o console, após ele finalizar de rodar tudo;
- Usar os links abaixo no app do postman para poder rodar certas seções da API;
