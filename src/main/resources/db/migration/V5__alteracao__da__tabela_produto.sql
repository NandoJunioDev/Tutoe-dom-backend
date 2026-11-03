alter table produto
    add column marca_do_produto varchar(100),

    add column grupo varchar(100) not null,
    add column preco_atual numeric(10,2) not null,
    add column foto_url text;

