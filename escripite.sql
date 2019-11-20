

drop database if exists bancoVendas;
create database bancoVendas;
use bancoVendas;
create table usuarios (
nome char(10) not null unique,
senha char(10) not null unique
);
create table vendedores(
codigo integer primary key,
nome varchar(30)
);
create table produtos (
codigo integer primary key,
nome varchar(30),
precoUnit numeric(8,2)
);
create table clientes(
codigo integer primary key,
nome varchar(30)
);
create table pedidos(
numero integer primary key,
vendedor integer references vendedores(codigo),
cliente integer references clientes(codigo),
dataPedido date
);
create table itensPedido(
pedido integer references pedidos(numero),
produto integer references produtos(codigo),
qtde integer,
valUnit numeric(8,2)
);
insert into usuarios (nome, senha) values ('aaa', 123);
insert into vendedores (codigo,nome) values(123, 'joao');
insert into vendedores (codigo,nome) values(122, 'ana maria');
insert into vendedores (codigo,nome) values(144, 'carlos');
insert into vendedores (codigo,nome) values(167, 'jo');
insert into produtos(codigo,nome,precoUnit) values (1, 'prod1', 1.10);
insert into produtos(codigo,nome,precoUnit) values (2, 'prod2', 2.20);
insert into produtos(codigo,nome,precoUnit) values (3, 'prod2', 3.30);
insert into clientes (codigo,nome) values(10, 'cli10');
insert into clientes (codigo,nome) values(20, 'cli20');
insert into clientes (codigo,nome) values(30, 'cli30');
insert into pedidos(numero, vendedor, cliente, dataPedido)
values(1000, 123, 10, '2019-11-04');
insert into pedidos(numero, vendedor, cliente, dataPedido)
values(2000, 144, 20, '2019-09-25');
insert into pedidos(numero, vendedor, cliente, dataPedido)
values(3000, 167, 10, '2019-10-23');
insert into itensPedido (pedido, produto, qtde, valUnit)
values(1000, 1, 1, 1.10);
insert into itensPedido (pedido, produto, qtde, valUnit)
values(1000, 2, 1, 2.20);
insert into itensPedido (pedido, produto, qtde, valUnit)
values(2000, 3, 3, 3.30);
insert into itensPedido (pedido, produto, qtde, valUnit)
values(3000, 1, 1, 1.10);
insert into itensPedido (pedido, produto, qtde, valUnit)
values(3000, 3, 10, 3.00);

