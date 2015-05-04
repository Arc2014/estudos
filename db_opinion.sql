create database opinion;

use opinion;

create table tb_curso(
    id int primary key auto_increment,
    nome varchar(100)
    
);

create table tb_pergunta(
    id int primary key auto_increment,
    descricao varchar(1000)
    tipo varchar(10)
);

create table tb_pergunta_curso(
    id int primary key auto_increment,
    resposta varchar(1000),
    id_curso int,
    id_pergunta int,
    
    constraint FK_CURSO foreign key (id_curso) references tb_curso(id),
    constraint FK_PERGUNTA foreign key (id_pergunta) references tb_pergunta(id)
);
