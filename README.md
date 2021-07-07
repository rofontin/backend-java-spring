"# backend-java-spring"

`Para rodar a aplicação foi iniciado o SpringBoot na IDE - Spring Tool Suite 4`

`versão spring utilizada : 2.5.2`

`Exemplos para requisições:`

`INSERTS/POST`
http://127.0.0.1:8181/desafioprojuris/clientes
JSON:
{
	"idCliente":null,
	"nome": "Jão",
	"endereco": "Rua Brasil",
	"telefone": 9994444,
	"email": "joao@gmail.com"
}

http://127.0.0.1:8181/desafioprojuris/equipamentos
JSON:
{
	"idEquipamento":null,
	"nome": "Suspenção",
	"tipo": "Auto"
}

http://127.0.0.1:8181/desafioprojuris/responsaveis
JSON:
{
	"idResponsavel":null,
	"nome": "Marcio",
	"endereco": "Rua Japão",
	"cargo": "Gerente",
	"email": "marcio@gmail.com"
}

http://127.0.0.1:8181/desafioprojuris/ordensservico
JSON:
{
	"idOrdemServico":null,
	"idCliente": 1,
	"idEquipamento": 1,
	"idResponsavel": 1,
	"descricao": "Ajuste Suspenção"
}

`INICIAR ORDEM DE SERVICO` 
http://127.0.0.1:8181/desafioprojuris/ordensservico/iniciar/1?data=2021-07-06

`FINALIZAR ORDEM DE SERVICO`
http://127.0.0.1:8181/desafioprojuris/ordensservico/finalizar/1?data=2021-07-06

`BUSCAR ORDENS DE SERVICO PENDENTES POR RESPONSAVEL`
http://127.0.0.1:8181/desafioprojuris/ordensservico/findordensservicopendenteporresponsavel/1
