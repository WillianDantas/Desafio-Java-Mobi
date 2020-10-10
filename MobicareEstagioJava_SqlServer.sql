use MobicareEstagioJava_2017


Create Table ClassificacaoCliente(
	 Codigo bigint  not null,
	 NomeClassificacao varchar(50) not null,
	 FaixaInicial decimal(14,2),
	 FaixaFinal decimal(14, 2) 
)

Create Table GeraIdClassificacao(
	BaseId bigint
)


Insert Into GeraIdClassificacao
Select 0



