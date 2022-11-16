show databases;
create database SAE;
use SAE;

create table tb_usuario(
id_usuario bigint primary key auto_increment,
nome varchar(120) not null,
cpf varchar(30) not null,
login varchar(60) not null,
senha varchar(30) not null,
Adm tinyint,
#tb_endereco
);

create table tb_grupo_usuario(
id_grupo bigint primary key auto_increment,
nome_grupo varchar(60) not null,
#tb_usuario_id_usuario bigint,
#tb_permissao_id_permissao bigint
);

create table tb_permissao(
id_permissao bigint primary key auto_increment,
nome_permissao varchar(60) not null,
ler tinyint,
deletar tinyint,
aletrar tinyint,
criar tinyint,
);

create table tb_professor(
id_professor bigint primary key auto_increment,
#tb_usuario_id_usuario bigint
);

create table tb_endereco(
id_endereco bigint primary key auto_increment,
bairro varchar(100) not null,
rua varchar(150) not null,
*numero varchar(12) not null,
*complemento varchar(160) not null,
cep varchar(15)
);

create table tb_materia_tb_professor(
id_materia_id_materia bigint auto_increment,
id_professor_id_professor bigint auto_increment,

);

create table tb_avaliacao(
id_avaliacao bigint primary key auto_increment,
data_aplicacao date,
*nova_avaliacao double,
aprovado tinyint
#tb_professor
#tb_aluno_id_aluno
);

create table tb_aluno(
id_aluno bigint primary key auto_increment,
nome varchar(160) not null,
cpf varchar(16) not null,
reforco tinyint,
#tb_endereco;
#tb_turma_id
);

create table tb_turma(
id_turma bigint primary key auto_increment,
nome_turma varchar(60) not null,
periodo varchar(150) not null
);

create table tb_materia(
id_materia bigint primary key auto_increment,
nome_materia varchar(100) not null,
rua varchar(150) not null,
#tb_turma_id_turma bigint
);
