Projeto para POO dos alunos do 3º ADS Noturno, Fatec Itapetininga
Proposto pela professora Sandra Cielavin

O objetivo é funcionar o mais parecido possível com a calculadora
do Windows


em 02/06
Corrigimos um bug que ocorria quando clicava no botão de igual
(o aplicativo ficava maluco quando fosse 
começar um segundo cálculo).


Começamos uma refatoração do código,
melhorando o encapsulamento da classe de calculo
Tem que finalizar essa fase,
antes de continuar a adicionar mais funções.


----------------------------------------

Criamos uma classe de calculo
	com atributos de valor1, valor2 e operador
	e um metodo que executa o calculo
 a interface gráfica faz chamadas a essa classe


Falta : formatar a saida para não aparece o ".0" no final
		quando não tem decimal
Falta as demais operacoes
depois os botões de controle de limpeza
depois as funções de memória